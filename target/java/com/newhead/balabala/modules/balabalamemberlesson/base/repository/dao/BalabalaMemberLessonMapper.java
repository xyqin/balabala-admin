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
     * @generated 2017年12月28日 06:54:51
     */
    long countByExample(BalabalaMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月28日 06:54:51
     */
    int deleteByExample(BalabalaMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月28日 06:54:51
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月28日 06:54:51
     */
    int insert(BalabalaMemberLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月28日 06:54:51
     */
    int insertSelective(BalabalaMemberLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月28日 06:54:51
     */
    List<BalabalaMemberLesson> selectByExample(BalabalaMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月28日 06:54:51
     */
    BalabalaMemberLesson selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月28日 06:54:51
     */
    int updateByExampleSelective(@Param("record") BalabalaMemberLesson record, @Param("example") BalabalaMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月28日 06:54:51
     */
    int updateByExample(@Param("record") BalabalaMemberLesson record, @Param("example") BalabalaMemberLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月28日 06:54:51
     */
    int updateByPrimaryKeySelective(BalabalaMemberLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_member_lesson
     * @generated 2017年12月28日 06:54:51
     */
    int updateByPrimaryKey(BalabalaMemberLesson record);
}