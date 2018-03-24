package com.newhead.barablah.modules.barablahteacher.ext;

import com.google.common.collect.Maps;
import com.newhead.barablah.modules.barablahcampus.base.repository.entity.BarablahCampus;
import com.newhead.barablah.modules.barablahcampus.base.repository.entity.BarablahCampusExample;
import com.newhead.barablah.modules.barablahcountry.base.repository.entity.BarablahCountry;
import com.newhead.barablah.modules.barablahcountry.base.repository.entity.BarablahCountryExample;
import com.newhead.barablah.modules.barablahteacher.base.AbstractBarablahTeacherService;
import com.newhead.barablah.modules.barablahteacher.base.repository.dao.BarablahTeacherMapper;
import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacher;
import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacherExample;
import com.newhead.barablah.modules.barablahteacher.ext.protocol.SimpleBarablahTeacherQueryListRequest;
import com.newhead.barablah.modules.barablahteacher.ext.protocol.SimpleBarablahTeacherQueryPageRequest;
import com.newhead.barablah.modules.barablahteacher.ext.protocol.SimpleBarablahTeacherQueryResponse;
import com.newhead.barablah.modules.barablahteacher.ext.protocol.SimpleBarablahTeacherUpdateBatchRequest;
import com.newhead.barablah.modules.barablahteachermajor.base.repository.entity.BarablahTeacherMajor;
import com.newhead.barablah.modules.barablahteachermajor.base.repository.entity.BarablahTeacherMajorExample;
import com.newhead.rudderframework.core.security.ShiroAuthorizingRealm;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.modules.rudderuser.base.repository.dao.RudderUserMapper;
import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUser;
import io.swagger.annotations.Api;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * RudderFramework 自动生成
 * 教师服务
 * 2018年01月18日 06:52:58
 */
@Api(tags = "教师", description = "相关的API")
@Service
public class SimpleBarablahTeacherService extends AbstractBarablahTeacherService {

    @Autowired
    private BarablahTeacherMapper mapper;

    @Autowired
    private RudderUserMapper rudderUserMapper;

    @Override
    public BarablahTeacherMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahTeacher entity) {

    }

    @Transactional
    public void updatebatch(SimpleBarablahTeacherUpdateBatchRequest request) {
        if (CollectionUtils.isNotEmpty(request.getTeacherIds())) {
            for (Long teacherId : request.getTeacherIds()) {
                BarablahTeacher teacherToBeUpdated = new BarablahTeacher();
                teacherToBeUpdated.setId(teacherId);
                teacherToBeUpdated.setStatus(request.getStatus());
                mapper.updateByPrimaryKeySelective(teacherToBeUpdated);
            }
        }
    }

    @Override
    public List<SimpleBarablahTeacherQueryResponse> queryList(SimpleBarablahTeacherQueryListRequest request) {
        List<SimpleBarablahTeacherQueryResponse> results = new ArrayList<SimpleBarablahTeacherQueryResponse>();

        //构造查询对象
        BarablahTeacherExample example = new BarablahTeacherExample();
        BarablahTeacherExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc = "";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);

        if (request.getCampusId() != null) {
            c.andCampusIdEqualTo(request.getCampusId());
        }

        if (request.getUsername() != null) {
            c.andUsernameLike("%" + request.getUsername() + "%");
        }

        if (request.getFullName() != null) {
            c.andFullNameLike("%" + request.getFullName() + "%");
        }

        if (request.getPhoneNumber() != null) {
            c.andPhoneNumberLike("%" + request.getPhoneNumber() + "%");
        }


        if (request.getStatus() != null) {
            c.andStatusEqualTo(request.getStatus());
        }

        // 处理校区筛选
        ShiroAuthorizingRealm.ShiroUser user = getCurrentUser();
        RudderUser rudderUser = rudderUserMapper.selectByPrimaryKey(user.getId());

        if (Objects.nonNull(rudderUser.getCampusId()) && rudderUser.getCampusId() > 0L) {
            c.andCampusIdEqualTo(rudderUser.getCampusId());
        }

        convertEntityToResponse(getMapper().selectByExample(example), results);
        return results;
    }

    @Override
    public Page<SimpleBarablahTeacherQueryResponse> queryPage(SimpleBarablahTeacherQueryPageRequest request) {
        //结果
        List<SimpleBarablahTeacherQueryResponse> results = new ArrayList<SimpleBarablahTeacherQueryResponse>();

        //构造查询对象
        BarablahTeacherExample example = new BarablahTeacherExample();
        BarablahTeacherExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc = "";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);
        if (request.getCampusId() != null) {
            c.andCampusIdEqualTo(request.getCampusId());
        }

        if (request.getUsername() != null) {
            c.andUsernameLike("%" + request.getUsername() + "%");
        }

        if (request.getFullName() != null) {
            c.andFullNameLike("%" + request.getFullName() + "%");
        }

        if (request.getPhoneNumber() != null) {
            c.andPhoneNumberLike("%" + request.getPhoneNumber() + "%");
        }

        if (request.getStatus() != null) {
            c.andStatusEqualTo(request.getStatus());
        }

        // 处理校区筛选
        ShiroAuthorizingRealm.ShiroUser user = getCurrentUser();
        RudderUser rudderUser = rudderUserMapper.selectByPrimaryKey(user.getId());

        if (Objects.nonNull(rudderUser.getCampusId()) && rudderUser.getCampusId() > 0L) {
            c.andCampusIdEqualTo(rudderUser.getCampusId());
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


    /**
     * 对象转换
     * @param entitys
     * @param results
     */
    private void convertEntityToResponse(List<BarablahTeacher> entitys,List<SimpleBarablahTeacherQueryResponse> results) {
        Map<Long,Long> campusIdMap = Maps.newHashMap();
        Map<Long,LabelValueItem> campusIdResultMap = Maps.newHashMap();

        Map<Long,Long> majorMap = Maps.newHashMap();
        Map<Long,LabelValueItem> majorResultMap = Maps.newHashMap();

        Map<Long,Long> comeFromMap = Maps.newHashMap();
        Map<Long,LabelValueItem> comeFromResultMap = Maps.newHashMap();

        for(BarablahTeacher entity:entitys) {
            campusIdMap.put(entity.getId(),entity.getCampusId());
            majorMap.put(entity.getId(),entity.getMajor());
            comeFromMap.put(entity.getId(),entity.getComeFrom());
        }
        BarablahCampusExample campusIdExample = new BarablahCampusExample();

        List<Long> campusIds = new ArrayList<>();
        campusIds.addAll(campusIdMap.values());
        if (campusIds.size()>0) {
            campusIdExample.createCriteria().andIdIn(campusIds);
        }
        List<BarablahCampus>  campusIdList = barablahcampusMapper.selectByExample(campusIdExample);
        for(BarablahCampus item:campusIdList) {
            LabelValueItem campusIdItem = new LabelValueItem();
            campusIdItem.setName("campusId");
            campusIdItem.setValue(String.valueOf(item.getId()));
            campusIdItem.setLabel(item.getCampusName());
            campusIdResultMap.put(item.getId(),campusIdItem);
        }
        BarablahTeacherMajorExample majorExample = new BarablahTeacherMajorExample();

        List<Long> majors = new ArrayList<>();
        majors.addAll(majorMap.values());
        if (majors.size()>0) {
            majorExample.createCriteria().andIdIn(majors);
        }
        List<BarablahTeacherMajor>  majorList = barablahteachermajorMapper.selectByExample(majorExample);
        for(BarablahTeacherMajor item:majorList) {
            LabelValueItem majorItem = new LabelValueItem();
            majorItem.setName("major");
            majorItem.setValue(String.valueOf(item.getId()));
            majorItem.setLabel(item.getMajorName());
            majorResultMap.put(item.getId(),majorItem);
        }
        BarablahCountryExample comeFromExample = new BarablahCountryExample();

        List<Long> comeFroms = new ArrayList<>();
        comeFroms.addAll(comeFromMap.values());
        if (comeFroms.size()>0) {
            comeFromExample.createCriteria().andIdIn(comeFroms);
        }
        List<BarablahCountry>  comeFromList = barablahcountryMapper.selectByExample(comeFromExample);
        for(BarablahCountry item:comeFromList) {
            LabelValueItem comeFromItem = new LabelValueItem();
            comeFromItem.setName("comeFrom");
            comeFromItem.setValue(String.valueOf(item.getId()));
            comeFromItem.setLabel(item.getZhName());
            comeFromResultMap.put(item.getId(),comeFromItem);
        }
        //第一组
        for(BarablahTeacher entity:entitys) {
            SimpleBarablahTeacherQueryResponse response = new SimpleBarablahTeacherQueryResponse();
            BeanUtils.copyProperties(entity,response);
            Long campusId = campusIdMap.get(entity.getId());

            LabelValueItem campusIdlvi = null;
            if (campusId!=null && campusIdResultMap.get(campusId)!=null) {
                campusIdlvi = new LabelValueItem();
                BeanUtils.copyProperties(campusIdResultMap.get(campusId),campusIdlvi);
            }
            response.setCampusIdObject(campusIdlvi);
            Long major = majorMap.get(entity.getId());

            LabelValueItem majorlvi = null;
            if (major!=null && majorResultMap.get(major)!=null) {
                majorlvi = new LabelValueItem();
                BeanUtils.copyProperties(majorResultMap.get(major),majorlvi);
            }
            response.setMajorObject(majorlvi);
            Long comeFrom = comeFromMap.get(entity.getId());

            LabelValueItem comeFromlvi = null;
            if (comeFrom!=null && comeFromResultMap.get(comeFrom)!=null) {
                comeFromlvi = new LabelValueItem();
                BeanUtils.copyProperties(comeFromResultMap.get(comeFrom),comeFromlvi);
            }
            response.setComeFromObject(comeFromlvi);
            LabelValueItem statusEnum = response.getStatusEnum();
            statusEnum.setName("status");
            statusEnum.setLabel(com.newhead.barablah.modules.barablahteacher.BarablahTeacherStatusEnum.getLabel(entity.getStatus()));
            statusEnum.setValue(entity.getStatus());
            statusEnum.setChecked(true);
            results.add(response);
        }
    }
}
