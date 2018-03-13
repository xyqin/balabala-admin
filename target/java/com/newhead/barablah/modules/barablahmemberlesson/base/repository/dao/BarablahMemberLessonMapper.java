package com.newhead.barablah.modules.barablahmemberlesson.base.repository.dao;

import com.newhead.barablah.modules.barablahmemberlesson.base.repository.entity.BarablahMemberLesson;
import com.newhead.barablah.modules.barablahmemberlesson.base.repository.entity.BarablahMemberLessonExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahMemberLessonMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月13日 09:31:59
     */
    long countByExample(BarablahMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月13日 09:31:59
     */
    int deleteByExample(BarablahMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月13日 09:31:59
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月13日 09:31:59
     */
    int insert(BarablahMemberLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月13日 09:31:59
     */
    int insertSelective(BarablahMemberLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月13日 09:31:59
     */
    List<BarablahMemberLesson> selectByExample(BarablahMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月13日 09:31:59
     */
    BarablahMemberLesson selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月13日 09:31:59
     */
    int updateByExampleSelective(@Param("record") BarablahMemberLesson record, @Param("example") BarablahMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月13日 09:31:59
     */
    int updateByExample(@Param("record") BarablahMemberLesson record, @Param("example") BarablahMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月13日 09:31:59
     */
    int updateByPrimaryKeySelective(BarablahMemberLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月13日 09:31:59
     */
    int updateByPrimaryKey(BarablahMemberLesson record);
}