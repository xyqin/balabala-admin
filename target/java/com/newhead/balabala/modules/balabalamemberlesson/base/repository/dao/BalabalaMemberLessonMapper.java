package com.newhead.balabala.modules.balabalamemberlesson.base.repository.dao;

import com.newhead.balabala.modules.balabalamemberlesson.base.repository.entity.BalabalaMemberLesson;
import com.newhead.balabala.modules.balabalamemberlesson.base.repository.entity.BalabalaMemberLessonExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaMemberLessonMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月23日 02:12:57
     */
    long countByExample(BalabalaMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月23日 02:12:57
     */
    int deleteByExample(BalabalaMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月23日 02:12:57
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月23日 02:12:57
     */
    int insert(BalabalaMemberLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月23日 02:12:57
     */
    int insertSelective(BalabalaMemberLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月23日 02:12:57
     */
    List<BalabalaMemberLesson> selectByExample(BalabalaMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月23日 02:12:57
     */
    BalabalaMemberLesson selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月23日 02:12:57
     */
    int updateByExampleSelective(@Param("record") BalabalaMemberLesson record, @Param("example") BalabalaMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月23日 02:12:57
     */
    int updateByExample(@Param("record") BalabalaMemberLesson record, @Param("example") BalabalaMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月23日 02:12:57
     */
    int updateByPrimaryKeySelective(BalabalaMemberLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月23日 02:12:57
     */
    int updateByPrimaryKey(BalabalaMemberLesson record);
}