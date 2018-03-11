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
     * @generated 2018年3月12日 05:37:03
     */
    long countByExample(BarablahMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月12日 05:37:03
     */
    int deleteByExample(BarablahMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月12日 05:37:03
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月12日 05:37:03
     */
    int insert(BarablahMemberLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月12日 05:37:03
     */
    int insertSelective(BarablahMemberLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月12日 05:37:03
     */
    List<BarablahMemberLesson> selectByExample(BarablahMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月12日 05:37:03
     */
    BarablahMemberLesson selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月12日 05:37:03
     */
    int updateByExampleSelective(@Param("record") BarablahMemberLesson record, @Param("example") BarablahMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月12日 05:37:03
     */
    int updateByExample(@Param("record") BarablahMemberLesson record, @Param("example") BarablahMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月12日 05:37:03
     */
    int updateByPrimaryKeySelective(BarablahMemberLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lesson
     * @generated 2018年3月12日 05:37:03
     */
    int updateByPrimaryKey(BarablahMemberLesson record);
}