package com.newhead.barablah.modules.barablahteacher.base;

import com.google.common.collect.Maps;
import com.newhead.barablah.modules.barablahcampus.base.repository.dao.BarablahCampusMapper;
import com.newhead.barablah.modules.barablahcampus.base.repository.entity.BarablahCampus;
import com.newhead.barablah.modules.barablahcampus.base.repository.entity.BarablahCampusExample;
import com.newhead.barablah.modules.barablahcountry.base.repository.dao.BarablahCountryMapper;
import com.newhead.barablah.modules.barablahcountry.base.repository.entity.BarablahCountry;
import com.newhead.barablah.modules.barablahcountry.base.repository.entity.BarablahCountryExample;
import com.newhead.barablah.modules.barablahteacher.base.repository.dao.BarablahTeacherMapper;
import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacher;
import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacherExample;
import com.newhead.barablah.modules.barablahteachermajor.base.repository.dao.BarablahTeacherMajorMapper;
import com.newhead.barablah.modules.barablahteachermajor.base.repository.entity.BarablahTeacherMajor;
import com.newhead.barablah.modules.barablahteachermajor.base.repository.entity.BarablahTeacherMajorExample;
import com.newhead.rudderframework.core.services.BaseService;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Node;
import com.newhead.rudderframework.modules.LabelValueItem;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 菜单服务
 * 2017年05月03日 06:31:12
 */
public abstract class AbstractBarablahTeacherService extends BaseService {
    protected abstract BarablahTeacherMapper getMapper();

    protected abstract void saveOrUpdate(BarablahTeacher entity);

    @Autowired
    protected BarablahCountryMapper barablahcountryMapper;
    @Autowired
    protected BarablahCampusMapper barablahcampusMapper;
    @Autowired
    protected BarablahTeacherMajorMapper barablahteachermajorMapper;

    /**
     * 创建
     * @param request
     * @return entity
     */
    @Transactional
    public BarablahTeacher create(SimpleBarablahTeacherCreateRequest request) {
        BarablahTeacher entity = new BarablahTeacher();
        BeanUtils.copyProperties(request,entity);
        entity.setCreatedAt(new Date());
        entity.setUpdatedAt(new Date());
        entity.setDeleted(false);
        entity.setCreator(getCurrentUser().getId());
        entity.setLastModifier(getCurrentUser().getId());
        saveOrUpdate(entity);
        getMapper().insert(entity);

        //添加关系
        return entity;
    }

    /**
     * 修改
     * @param request
     * @return
     */
    @Transactional
    public BarablahTeacher update(SimpleBarablahTeacherUpdateRequest request) {
        BarablahTeacher entity = new BarablahTeacher();
        BeanUtils.copyProperties(request,entity);
        entity.setUpdatedAt(new Date());
        entity.setDeleted(false);
        entity.setLastModifier(getCurrentUser().getId());
        saveOrUpdate(entity);
        getMapper().updateByPrimaryKeySelective(entity);

        return entity;
    }

    /**
     * 查看菜单详情
     * @param id
     * @return
     */
    public SimpleBarablahTeacherGetDetailResponse getDetail(Long id) {
        BarablahTeacher entity = getMapper().selectByPrimaryKey(id);
        if (entity.getDeleted()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称已经被删除或者并不存在！");
        }
        SimpleBarablahTeacherGetDetailResponse response = new SimpleBarablahTeacherGetDetailResponse();
        BeanUtils.copyProperties(entity, response);
        BarablahCampus  campusIdEntity = barablahcampusMapper.selectByPrimaryKey(Long.valueOf(entity.getCampusId()));
        if (campusIdEntity!=null) {
            LabelValueItem campusIdObject = response.getCampusIdObject();
            campusIdObject.setName("campusId");
            campusIdObject.setLabel(campusIdEntity.getCampusName());
            campusIdObject.setValue(String.valueOf(entity.getCampusId()));
            campusIdObject.setChecked(false);
        }
        BarablahTeacherMajor  majorEntity = barablahteachermajorMapper.selectByPrimaryKey(Long.valueOf(entity.getMajor()));
        if (majorEntity!=null) {
            LabelValueItem majorObject = response.getMajorObject();
            majorObject.setName("major");
            majorObject.setLabel(majorEntity.getMajorName());
            majorObject.setValue(String.valueOf(entity.getMajor()));
            majorObject.setChecked(false);
        }
        BarablahCountry  comeFromEntity = barablahcountryMapper.selectByPrimaryKey(Long.valueOf(entity.getComeFrom()));
        if (comeFromEntity!=null) {
            LabelValueItem comeFromObject = response.getComeFromObject();
            comeFromObject.setName("comeFrom");
            comeFromObject.setLabel(comeFromEntity.getZhName());
            comeFromObject.setValue(String.valueOf(entity.getComeFrom()));
            comeFromObject.setChecked(false);
        }
        LabelValueItem statusEnum = response.getStatusEnum();
        statusEnum.setName("status");
        statusEnum.setLabel(com.newhead.barablah.modules.barablahteacher.BarablahTeacherStatusEnum.getLabel(entity.getStatus()));
        statusEnum.setValue(entity.getStatus());
        statusEnum.setChecked(true);
        return response;
    }

    @Transactional
    /**
     * 删除
     * @param id
     */
    public void delete(Long id) {
        BarablahTeacher entity = new BarablahTeacher();
        entity.setId(id);
        entity.setDeleted(true);
        getMapper().updateByPrimaryKeySelective(entity);
    }

    /**
     * 查询
     * @param request
     * @return list
     */
    public List<SimpleBarablahTeacherQueryResponse> queryList(SimpleBarablahTeacherQueryListRequest request) {
        List<SimpleBarablahTeacherQueryResponse> results = new ArrayList<SimpleBarablahTeacherQueryResponse>();

        //构造查询对象
        BarablahTeacherExample example = new BarablahTeacherExample();
        BarablahTeacherExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);

        if (request.getCampusId()!=null) {
            c.andCampusIdEqualTo(request.getCampusId());
         }

        if (request.getUsername()!=null) {
            c.andUsernameLike("%"+request.getUsername()+"%");
        }

        if (request.getFullName()!=null) {
            c.andFullNameLike("%"+request.getFullName()+"%");
        }

        if (request.getPhoneNumber()!=null) {
            c.andPhoneNumberLike("%"+request.getPhoneNumber()+"%");
        }

        if (request.getMajor()!=null) {
            c.andMajorEqualTo(request.getMajor());
         }

        if (request.getComeFrom()!=null) {
            c.andComeFromEqualTo(request.getComeFrom());
         }

        if (request.getStatus()!=null) {
            c.andStatusEqualTo(request.getStatus());
         }

        convertEntityToResponse(getMapper().selectByExample(example),results);
        return results;
    }

    /**
     * 查询
     * @param request
     * @return page
     */
    public Page<SimpleBarablahTeacherQueryResponse> queryPage(SimpleBarablahTeacherQueryPageRequest request) {
        //结果
        List<SimpleBarablahTeacherQueryResponse> results = new ArrayList<SimpleBarablahTeacherQueryResponse>();

        //构造查询对象
        BarablahTeacherExample example = new BarablahTeacherExample();
        BarablahTeacherExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        String ordersrc ="";
        ordersrc = ordersrc + "id desc";
        example.setOrderByClause(ordersrc);
        if (request.getCampusId()!=null) {
            c.andCampusIdEqualTo(request.getCampusId());
         }

        if (request.getUsername()!=null) {
            c.andUsernameLike("%"+request.getUsername()+"%");
        }

        if (request.getFullName()!=null) {
            c.andFullNameLike("%"+request.getFullName()+"%");
        }

        if (request.getPhoneNumber()!=null) {
            c.andPhoneNumberLike("%"+request.getPhoneNumber()+"%");
        }

        if (request.getMajor()!=null) {
            c.andMajorEqualTo(request.getMajor());
         }

        if (request.getComeFrom()!=null) {
            c.andComeFromEqualTo(request.getComeFrom());
         }

        if (request.getStatus()!=null) {
            c.andStatusEqualTo(request.getStatus());
         }

        example.setPageSize(request.getSize());
        example.setStartRow(request.getOffset());

        long count = getMapper().countByExample(example);

        convertEntityToResponse(getMapper().selectByExample(example),results);

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

    /**
     *
     * @param node
     * @param selectMap
     */
    private void traversalTree(Node node,Map<Long,Boolean> selectMap) {
        if (node.getValue()!=null && org.apache.commons.lang3.math.NumberUtils.isNumber(node.getValue())) {
            if (selectMap.containsKey(Long.valueOf(node.getValue()))) {
                node.setSelected(true);
            }
        }
        if (node.getChildren()!=null) {
            for(Node child:node.getChildren()) {
                traversalTree(child,selectMap);
            }
        }
    }






}
