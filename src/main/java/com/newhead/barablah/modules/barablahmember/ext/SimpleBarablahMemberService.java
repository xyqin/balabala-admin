package com.newhead.barablah.modules.barablahmember.ext;

import com.google.common.collect.Maps;
import com.newhead.barablah.modules.barablahcampus.base.repository.entity.BarablahCampus;
import com.newhead.barablah.modules.barablahcampus.base.repository.entity.BarablahCampusExample;
import com.newhead.barablah.modules.barablahmember.base.AbstractBarablahMemberService;
import com.newhead.barablah.modules.barablahmember.base.repository.dao.BarablahMemberMapper;
import com.newhead.barablah.modules.barablahmember.base.repository.entity.BarablahMember;
import com.newhead.barablah.modules.barablahmember.base.repository.entity.BarablahMemberExample;
import com.newhead.barablah.modules.barablahmember.ext.protocol.*;
import com.newhead.barablah.modules.barablahmemberpassport.base.repository.dao.BarablahMemberPassportMapper;
import com.newhead.barablah.modules.barablahmemberpassport.base.repository.entity.BarablahMemberPassport;
import com.newhead.barablah.modules.barablahmemberpassport.base.repository.entity.BarablahMemberPassportExample;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.modules.LabelValueItem;
import io.swagger.annotations.Api;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 会员服务
 * 2018年02月07日 04:55:37
 */
@Api(tags = "会员", description = "相关的API")
@Service
public class SimpleBarablahMemberService extends AbstractBarablahMemberService {

    @Autowired
    private BarablahMemberMapper mapper;

    @Autowired
    private BarablahMemberPassportMapper passportMapper;

    @Override
    protected BarablahMemberMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahMember entity) {

    }

    @Transactional
    @Override
    public BarablahMember create(SimpleBarablahMemberCreateRequest request) {
        BarablahMember entity = super.create(request);

        // 创建手机号密码账号
        BarablahMemberPassport passport = new BarablahMemberPassport();
        passport.setMemberId(entity.getId());
        passport.setProvider("PHONE");
        passport.setProviderId(request.getPhoneNumber());
        passport.setPassword(DigestUtils.md5Hex(request.getPassword()));
        passportMapper.insertSelective(passport);

        return entity;
    }

    @Transactional
    @Override
    public BarablahMember update(SimpleBarablahMemberUpdateRequest request) {
        BarablahMember entity = super.update(request);

        // 更新手机号密码账号
        BarablahMemberPassport passportToBeUpdated = new BarablahMemberPassport();
        passportToBeUpdated.setProviderId(request.getPhoneNumber());
        passportToBeUpdated.setPassword(DigestUtils.md5Hex(request.getPassword()));

        BarablahMemberPassportExample example = new BarablahMemberPassportExample();
        example.createCriteria().andMemberIdEqualTo(entity.getId());

        passportMapper.updateByExampleSelective(passportToBeUpdated, example);

        return entity;
    }

    @Override
    public SimpleBarablahMemberGetDetailResponse getDetail(Long id) {
        SimpleBarablahMemberGetDetailResponse response = super.getDetail(id);

        BarablahMemberPassportExample example = new BarablahMemberPassportExample();
        example.createCriteria().andMemberIdEqualTo(id).andProviderEqualTo("PHONE");

        List<BarablahMemberPassport> passports = passportMapper.selectByExample(example);

        if (CollectionUtils.isNotEmpty(passports)) {
            response.setPhoneNumber(passports.get(0).getProviderId());
        }

        return response;
    }

    @Override
    public List<SimpleBarablahMemberQueryResponse> queryList(SimpleBarablahMemberQueryListRequest request) {
        List<SimpleBarablahMemberQueryResponse> results = new ArrayList<SimpleBarablahMemberQueryResponse>();

        //构造查询对象
        BarablahMemberExample example = new BarablahMemberExample();
        BarablahMemberExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        example.setOrderByClause("points desc");
        if (request.getNickname() != null) {
            c.andNicknameLike("%" + request.getNickname() + "%");
        }

        if (request.getGender() != null) {
            c.andGenderEqualTo(request.getGender());
        }

        if (request.getStatus() != null) {
            c.andStatusEqualTo(request.getStatus());
        }

        convertEntityToResponse(getMapper().selectByExample(example), results);
        return results;
    }

    @Override
    public Page<SimpleBarablahMemberQueryResponse> queryPage(SimpleBarablahMemberQueryPageRequest request) {
        //结果
        List<SimpleBarablahMemberQueryResponse> results = new ArrayList<SimpleBarablahMemberQueryResponse>();

        //构造查询对象
        BarablahMemberExample example = new BarablahMemberExample();
        BarablahMemberExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        example.setOrderByClause("points desc");

        if (request.getNickname() != null) {
            c.andNicknameLike("%" + request.getNickname() + "%");
        }

        if (request.getGender() != null) {
            c.andGenderEqualTo(request.getGender());
        }

        if (request.getStatus() != null) {
            c.andStatusEqualTo(request.getStatus());
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

    @Transactional
    public void updatebatch(SimpleBarablahMemberUpdateBatchRequest request) {
        if (CollectionUtils.isNotEmpty(request.getMemberIds())) {
            for (Long teacherId : request.getMemberIds()) {
                BarablahMember memberToBeUpdated = new BarablahMember();
                memberToBeUpdated.setId(teacherId);
                memberToBeUpdated.setStatus(request.getStatus());
                mapper.updateByPrimaryKeySelective(memberToBeUpdated);
            }
        }
    }

    private void convertEntityToResponse(List<BarablahMember> entitys, List<SimpleBarablahMemberQueryResponse> results) {
        Map<Long, Long> campusIdMap = Maps.newHashMap();
        Map<Long, LabelValueItem> campusIdResultMap = Maps.newHashMap();

        for (BarablahMember entity : entitys) {
            campusIdMap.put(entity.getId(), entity.getCampusId());
        }
        BarablahCampusExample campusIdExample = new BarablahCampusExample();

        List<Long> campusIds = new ArrayList<>();
        campusIds.addAll(campusIdMap.values());
        if (campusIds.size() > 0) {
            campusIdExample.createCriteria().andIdIn(campusIds);
        }
        List<BarablahCampus> campusIdList = barablahcampusMapper.selectByExample(campusIdExample);
        for (BarablahCampus item : campusIdList) {
            LabelValueItem campusIdItem = new LabelValueItem();
            campusIdItem.setName("campusId");
            campusIdItem.setValue(String.valueOf(item.getId()));
            campusIdItem.setLabel(item.getCampusName());
            campusIdResultMap.put(item.getId(), campusIdItem);
        }
        //第一组
        for (BarablahMember entity : entitys) {
            SimpleBarablahMemberQueryResponse response = new SimpleBarablahMemberQueryResponse();
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
            genderEnum.setLabel(com.newhead.barablah.modules.barablahmember.BarablahMemberGenderEnum.getLabel(entity.getGender()));
            genderEnum.setValue(entity.getGender());
            genderEnum.setChecked(true);
            LabelValueItem statusEnum = response.getStatusEnum();
            statusEnum.setName("status");
            statusEnum.setLabel(com.newhead.barablah.modules.barablahmember.BarablahMemberStatusEnum.getLabel(entity.getStatus()));
            statusEnum.setValue(entity.getStatus());
            statusEnum.setChecked(true);

            // 抓取手机号
            BarablahMemberPassportExample example = new BarablahMemberPassportExample();
            example.createCriteria().andMemberIdEqualTo(entity.getId()).andProviderEqualTo("PHONE");

            List<BarablahMemberPassport> passports = passportMapper.selectByExample(example);

            if (CollectionUtils.isNotEmpty(passports)) {
                response.setPhoneNumber(passports.get(0).getProviderId());
            }

            results.add(response);
        }
    }
}
