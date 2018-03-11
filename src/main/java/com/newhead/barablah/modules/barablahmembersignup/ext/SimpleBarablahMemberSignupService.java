package com.newhead.barablah.modules.barablahmembersignup.ext;

import com.newhead.barablah.modules.barablahclasslesson.base.repository.dao.BarablahClassLessonMapper;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLesson;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLessonExample;
import com.newhead.barablah.modules.barablahclassmember.BarablahClassMemberStatusEnum;
import com.newhead.barablah.modules.barablahclassmember.base.repository.dao.BarablahClassMemberMapper;
import com.newhead.barablah.modules.barablahclassmember.base.repository.entity.BarablahClassMember;
import com.newhead.barablah.modules.barablahmemberlesson.base.repository.dao.BarablahMemberLessonMapper;
import com.newhead.barablah.modules.barablahmemberlesson.base.repository.entity.BarablahMemberLesson;
import com.newhead.barablah.modules.barablahmembersignup.base.AbstractBarablahMemberSignupService;
import com.newhead.barablah.modules.barablahmembersignup.base.repository.dao.BarablahMemberSignupMapper;
import com.newhead.barablah.modules.barablahmembersignup.base.repository.entity.BarablahMemberSignup;
import com.newhead.barablah.modules.barablahmembersignup.ext.protocol.SimpleBarablahMemberSignupCreateRequest;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * RudderFramework 自动生成
 * 会员报名表服务
 * 2018年01月18日 06:52:58
 */
@Api(tags = "会员报名表", description = "相关的API")
@Service
public class SimpleBarablahMemberSignupService extends AbstractBarablahMemberSignupService {

    @Autowired
    private BarablahMemberSignupMapper mapper;

    @Autowired
    private BarablahClassLessonMapper classLessonMapper;

    @Autowired
    private BarablahClassMemberMapper classMemberMapper;

    @Autowired
    private BarablahMemberLessonMapper memberLessonMapper;

    @Override
    protected BarablahMemberSignupMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahMemberSignup entity) {

    }

    @Transactional
    @Override
    public BarablahMemberSignup create(SimpleBarablahMemberSignupCreateRequest request) {
        BarablahMemberSignup entity = new BarablahMemberSignup();
        BeanUtils.copyProperties(request, entity);
        entity.setCreatedAt(new Date());
        entity.setUpdatedAt(new Date());
        entity.setDeleted(false);
        entity.setCreator(getCurrentUser().getId());
        entity.setLastModifier(getCurrentUser().getId());
        saveOrUpdate(entity);
        getMapper().insert(entity);

        BarablahClassMember classMember = new BarablahClassMember();
        classMember.setClassId(request.getClassId());
        classMember.setMemberId(request.getMemberId());
        classMember.setStatus(BarablahClassMemberStatusEnum.进行中.getValue());
        classMemberMapper.insertSelective(classMember);

        // 创建学生课时
        BarablahClassLessonExample classLessonExample = new BarablahClassLessonExample();
        classLessonExample.createCriteria()
                .andClassIdEqualTo(request.getClassId())
                .andDeletedEqualTo(Boolean.FALSE);
        List<BarablahClassLesson> classLessons = classLessonMapper.selectByExample(classLessonExample);

        for (BarablahClassLesson lesson : classLessons) {
            BarablahMemberLesson memberLesson = new BarablahMemberLesson();
            memberLesson.setClassId(lesson.getClassId());
            memberLesson.setLessonId(lesson.getId());
            memberLesson.setMemberId(request.getMemberId());
            memberLesson.setType(lesson.getType());
            memberLesson.setStartAt(lesson.getStartAt());
            memberLesson.setEndAt(lesson.getEndAt());
            memberLesson.setProbational(Boolean.FALSE);
            memberLessonMapper.insertSelective(memberLesson);
        }

        //添加关系
        return entity;
    }
}
