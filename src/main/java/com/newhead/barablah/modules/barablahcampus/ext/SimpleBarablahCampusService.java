package com.newhead.barablah.modules.barablahcampus.ext;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.newhead.barablah.modules.barablahcampus.base.AbstractBarablahCampusService;
import com.newhead.barablah.modules.barablahcampus.base.repository.dao.BarablahCampusMapper;
import com.newhead.barablah.modules.barablahcampus.base.repository.entity.BarablahCampus;
import com.newhead.barablah.modules.barablahcampus.base.repository.entity.BarablahCampusExample;
import com.newhead.barablah.modules.barablahcampus.ext.protocol.SimpleBarablahCampusQueryListRequest;
import com.newhead.barablah.modules.barablahcampus.ext.protocol.SimpleBarablahCampusQueryResponse;
import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClassExample;
import com.newhead.barablah.modules.barablahmember.base.repository.dao.BarablahMemberMapper;
import com.newhead.barablah.modules.barablahmember.base.repository.entity.BarablahMemberExample;
import com.newhead.barablah.modules.barablahregion.base.repository.entity.BarablahRegion;
import com.newhead.barablah.modules.barablahregion.base.repository.entity.BarablahRegionExample;
import com.newhead.barablah.modules.barablahteacher.base.repository.dao.BarablahTeacherMapper;
import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacherExample;
import com.newhead.rudderframework.core.security.ShiroAuthorizingRealm;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
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
 * 校区服务
 * 2018年01月18日 06:52:58
 */
@Api(tags = "校区", description = "相关的API")
@Service
public class SimpleBarablahCampusService extends AbstractBarablahCampusService {

    @Autowired
    private BarablahCampusMapper mapper;


    @Autowired
    private BarablahTeacherMapper teacherMapper;

    @Autowired
    private BarablahMemberMapper memberMapper;

    @Autowired
    private BarablahClassMapper classMapper;

    @Autowired
    private RudderUserMapper rudderUserMapper;

    @Override
    protected BarablahCampusMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahCampus entity) {

    }

    @Override
    public List<SimpleBarablahCampusQueryResponse> queryList(SimpleBarablahCampusQueryListRequest request) {
        List<SimpleBarablahCampusQueryResponse> results = new ArrayList<SimpleBarablahCampusQueryResponse>();
        List<BarablahCampus> campusList = Lists.newArrayList();

        ShiroAuthorizingRealm.ShiroUser user = getCurrentUser();
        RudderUser rudderUser = rudderUserMapper.selectByPrimaryKey(user.getId());

        if (Objects.nonNull(rudderUser.getCampusId()) && rudderUser.getCampusId() > 0L) {
            campusList.add(getMapper().selectByPrimaryKey(rudderUser.getCampusId()));
        } else {
            //构造查询对象
            BarablahCampusExample example = new BarablahCampusExample();
            BarablahCampusExample.Criteria c = example.createCriteria();
            c.andDeletedEqualTo(false);
            String ordersrc = "";
            ordersrc = ordersrc + "id desc";
            example.setOrderByClause(ordersrc);

            if (request.getCampusName() != null) {
                c.andCampusNameLike("%" + request.getCampusName() + "%");
            }
            campusList.addAll(getMapper().selectByExample(example));
        }

        convertEntityToResponse(campusList, results);
        return results;
    }

    /**
     * 对象转换
     *
     * @param entitys
     * @param results
     */
    private void convertEntityToResponse(List<BarablahCampus> entitys, List<SimpleBarablahCampusQueryResponse> results) {
        Map<Long, Long> regionIdMap = Maps.newHashMap();
        Map<Long, LabelValueItem> regionIdResultMap = Maps.newHashMap();

        for (BarablahCampus entity : entitys) {
            regionIdMap.put(entity.getId(), entity.getRegionId());
        }
        BarablahRegionExample regionIdExample = new BarablahRegionExample();

        List<Long> regionIds = new ArrayList<>();
        regionIds.addAll(regionIdMap.values());
        if (regionIds.size() > 0) {
            regionIdExample.createCriteria().andIdIn(regionIds);
        }
        List<BarablahRegion> regionIdList = barablahregionMapper.selectByExample(regionIdExample);
        for (BarablahRegion item : regionIdList) {
            LabelValueItem regionIdItem = new LabelValueItem();
            regionIdItem.setName("regionId");
            regionIdItem.setValue(String.valueOf(item.getId()));
            regionIdItem.setLabel(item.getRegionName());
            regionIdResultMap.put(item.getId(), regionIdItem);
        }
        //第一组
        for (BarablahCampus entity : entitys) {
            SimpleBarablahCampusQueryResponse response = new SimpleBarablahCampusQueryResponse();
            BeanUtils.copyProperties(entity, response);
            Long regionId = regionIdMap.get(entity.getId());

            LabelValueItem regionIdlvi = null;
            if (regionId != null && regionIdResultMap.get(regionId) != null) {
                regionIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(regionIdResultMap.get(regionId), regionIdlvi);
            }
            response.setRegionIdObject(regionIdlvi);
            results.add(response);
        }
    }


    @Override
    public void delete(Long id) {
        BarablahTeacherExample teacher = new BarablahTeacherExample();
        teacher.createCriteria().andCampusIdEqualTo(id);
        long nums1 = teacherMapper.countByExample(teacher);
        if (nums1>0) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(), "该校区已经有教师,不允许删除!");
        }

        BarablahMemberExample member = new BarablahMemberExample();
        teacher.createCriteria().andCampusIdEqualTo(id);
        long nums2 = memberMapper.countByExample(member);
        if (nums2>0) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(), "该校区已经有学员,不允许删除!");
        }

        BarablahClassExample classes = new BarablahClassExample();
        teacher.createCriteria().andCampusIdEqualTo(id);
        long nums3 = classMapper.countByExample(classes);
        if (nums3>0) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(), "该校区已经有班级在开班,不允许删除!");
        }

    }
}
