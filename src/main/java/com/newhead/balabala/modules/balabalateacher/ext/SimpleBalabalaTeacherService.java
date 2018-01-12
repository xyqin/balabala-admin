package com.newhead.balabala.modules.balabalateacher.ext;

import com.google.common.collect.Maps;
import com.newhead.balabala.modules.balabalacampus.base.repository.entity.BalabalaCampus;
import com.newhead.balabala.modules.balabalacampus.base.repository.entity.BalabalaCampusExample;
import com.newhead.balabala.modules.balabalateacher.base.AbstractBalabalaTeacherService;
import com.newhead.balabala.modules.balabalateacher.base.repository.dao.BalabalaTeacherMapper;
import com.newhead.balabala.modules.balabalateacher.base.repository.entity.BalabalaTeacher;
import com.newhead.balabala.modules.balabalateacher.base.repository.entity.BalabalaTeacherExample;
import com.newhead.balabala.modules.balabalateacher.ext.protocol.SimpleBalabalaTeacherQueryPageRequest;
import com.newhead.balabala.modules.balabalateacher.ext.protocol.SimpleBalabalaTeacherQueryResponse;
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
 * 教师服务
 * 2017年12月23日 02:12:57
 */
@Api(tags = "教师", description = "相关的API")
@Service
public class SimpleBalabalaTeacherService extends AbstractBalabalaTeacherService {

    @Autowired
    private BalabalaTeacherMapper mapper;

    @Autowired
    private RudderUserMapper userMapper;

    @Override
    protected BalabalaTeacherMapper getMapper() {
        return this.mapper;
    }

    @Override
    protected void saveOrUpdate(BalabalaTeacher entity) {

    }

    @Override
    public Page<SimpleBalabalaTeacherQueryResponse> queryPage(SimpleBalabalaTeacherQueryPageRequest request) {
        RudderUser user = userMapper.selectByPrimaryKey(getCurrentUser().getId());

        //结果
        List<SimpleBalabalaTeacherQueryResponse> results = new ArrayList<SimpleBalabalaTeacherQueryResponse>();

        //构造查询对象
        BalabalaTeacherExample example = new BalabalaTeacherExample();
        BalabalaTeacherExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);

        if (request.getUsername() != null) {
            c.andUsernameLike("%" + request.getUsername() + "%");
        }

        if (request.getPassword() != null) {
            c.andPasswordLike("%" + request.getPassword() + "%");
        }

        if (request.getAvatar() != null) {
            c.andAvatarLike("%" + request.getAvatar() + "%");
        }

        if (request.getFullName() != null) {
            c.andFullNameLike("%" + request.getFullName() + "%");
        }

        if (request.getPhoneNumber() != null) {
            c.andPhoneNumberLike("%" + request.getPhoneNumber() + "%");
        }

        if (request.getMajor() != null) {
            c.andMajorLike("%" + request.getMajor() + "%");
        }

        if (request.getComeFrom() != null) {
            c.andComeFromLike("%" + request.getComeFrom() + "%");
        }

        if (request.getStatus() != null) {
            c.andStatusEqualTo(request.getStatus());
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

    private void convertEntityToResponse(List<BalabalaTeacher> entitys, List<SimpleBalabalaTeacherQueryResponse> results) {
        Map<Long, Long> campusIdMap = Maps.newHashMap();
        Map<Long, LabelValueItem> campusIdResultMap = Maps.newHashMap();

        for (BalabalaTeacher entity : entitys) {
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
        for (BalabalaTeacher entity : entitys) {
            SimpleBalabalaTeacherQueryResponse response = new SimpleBalabalaTeacherQueryResponse();
            BeanUtils.copyProperties(entity, response);
            Long campusId = campusIdMap.get(entity.getId());

            LabelValueItem campusIdlvi = null;
            if (campusId != null && campusIdResultMap.get(campusId) != null) {
                campusIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(campusIdResultMap.get(campusId), campusIdlvi);
            }
            response.setCampusIdObject(campusIdlvi);
            LabelValueItem statusEnum = response.getStatusEnum();
            statusEnum.setName("status");
            statusEnum.setLabel(com.newhead.balabala.modules.balabalateacher.BalabalaTeacherStatusEnum.getLabel(entity.getStatus()));
            statusEnum.setValue(entity.getStatus());
            statusEnum.setChecked(true);
            results.add(response);
        }
    }

}
