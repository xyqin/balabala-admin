package com.newhead.balabala.modules.balabalamember.ext;

import com.google.common.collect.Maps;
import com.newhead.balabala.modules.balabalacampus.base.repository.entity.BalabalaCampus;
import com.newhead.balabala.modules.balabalacampus.base.repository.entity.BalabalaCampusExample;
import com.newhead.balabala.modules.balabalamember.base.AbstractBalabalaMemberService;
import com.newhead.balabala.modules.balabalamember.base.repository.dao.BalabalaMemberMapper;
import com.newhead.balabala.modules.balabalamember.base.repository.entity.BalabalaMember;
import com.newhead.balabala.modules.balabalamember.base.repository.entity.BalabalaMemberExample;
import com.newhead.balabala.modules.balabalamember.ext.protocol.SimpleBalabalaMemberQueryPageRequest;
import com.newhead.balabala.modules.balabalamember.ext.protocol.SimpleBalabalaMemberQueryResponse;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.modules.rudderuser.base.repository.dao.RudderUserMapper;
import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUser;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * RudderFramework 自动生成
 * 会员服务
 * 2017年12月28日 06:54:52
 */
@Api(tags = "会员", description = "相关的API")
@Service
public class SimpleBalabalaMemberService extends AbstractBalabalaMemberService {

    @Autowired
    private BalabalaMemberMapper mapper;

    @Autowired
    private RudderUserMapper userMapper;

    @Override
    protected BalabalaMemberMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaMember entity) {

    }

    @Override
    public Page<SimpleBalabalaMemberQueryResponse> queryPage(SimpleBalabalaMemberQueryPageRequest request) {
        RudderUser user = userMapper.selectByPrimaryKey(getCurrentUser().getId());

        //结果
        List<SimpleBalabalaMemberQueryResponse> results = new ArrayList<SimpleBalabalaMemberQueryResponse>();

        //构造查询对象
        BalabalaMemberExample example = new BalabalaMemberExample();
        BalabalaMemberExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        example.setOrderByClause("points desc");

        if (request.getNickname() != null) {
            c.andNicknameLike("%" + request.getNickname() + "%");
        }

        if (request.getAvatar() != null) {
            c.andAvatarLike("%" + request.getAvatar() + "%");
        }

        if (request.getEnglishName() != null) {
            c.andEnglishNameLike("%" + request.getEnglishName() + "%");
        }

        if (request.getGender() != null) {
            c.andGenderEqualTo(request.getGender());
        }

        if (request.getBirthday() != null) {
            c.andBirthdayLike("%" + request.getBirthday() + "%");
        }

        if (request.getAccid() != null) {
            c.andAccidLike("%" + request.getAccid() + "%");
        }

        if (request.getToken() != null) {
            c.andTokenLike("%" + request.getToken() + "%");
        }

        if (Objects.nonNull(user.getCampusId()) && user.getCampusId() > 0L) {
            c.andCampusIdEqualTo(user.getCampusId());
        }

        example.setPageSize(request.getSize());
        example.setStartRow(request.getOffset());

        long count = getMapper().countByExample(example);

        convertEntityToResponse(getMapper().selectByExample(example), results);

        Page page = new Page();
        page.setNumber(request.getPage());
        page.setSize(request.getSize());
        page.setContent(results);
        page.setTotalElements(count);
        return page;
    }

    private void convertEntityToResponse(List<BalabalaMember> entitys, List<SimpleBalabalaMemberQueryResponse> results) {
        Map<Long, Long> campusIdMap = Maps.newHashMap();
        Map<Long, LabelValueItem> campusIdResultMap = Maps.newHashMap();

        for (BalabalaMember entity : entitys) {
            campusIdMap.put(entity.getId(), entity.getCampusId());
        }
        BalabalaCampusExample campusIdExample = new BalabalaCampusExample();

        List<Long> campusIds = new ArrayList<>();
        campusIds.addAll(campusIdMap.values());
        if (campusIds.size() > 0) {
            campusIdExample.createCriteria().andIdIn(campusIds);
        }
        List<BalabalaCampus> campusIdList = balabalacampusMapper.selectByExample(campusIdExample);
        for (BalabalaCampus item : campusIdList) {
            LabelValueItem campusIdItem = new LabelValueItem();
            campusIdItem.setName("campusId");
            campusIdItem.setValue(String.valueOf(item.getId()));
            campusIdItem.setLabel(item.getCampusName());
            campusIdResultMap.put(item.getId(), campusIdItem);
        }
        //第一组
        for (BalabalaMember entity : entitys) {
            SimpleBalabalaMemberQueryResponse response = new SimpleBalabalaMemberQueryResponse();
            BeanUtils.copyProperties(entity, response);
            Long campusId = campusIdMap.get(entity.getId());

            LabelValueItem campusIdlvi = null;
            if (campusId != null && campusIdResultMap.get(campusId) != null) {
                campusIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(campusIdResultMap.get(campusId), campusIdlvi);
            }
            response.setCampusIdObject(campusIdlvi);
            LabelValueItem genderEnum = response.getGenderEnum();
            genderEnum.setName("gender");
            genderEnum.setLabel(com.newhead.balabala.modules.balabalamember.BalabalaMemberGenderEnum.getLabel(entity.getGender()));
            genderEnum.setValue(entity.getGender());
            genderEnum.setChecked(true);
            results.add(response);
        }
    }

}
