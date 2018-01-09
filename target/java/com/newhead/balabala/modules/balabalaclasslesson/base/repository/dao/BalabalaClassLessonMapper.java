package com.newhead.balabala.modules.balabalaclasslesson.base.repository.dao;

import com.newhead.balabala.modules.balabalaclasslesson.base.repository.entity.BalabalaClassLesson;
import com.newhead.balabala.modules.balabalaclasslesson.base.repository.entity.BalabalaClassLessonExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaClassLessonMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_lesson
     * @generated 2018年1月9日 04:35:21
     */
    long countByExample(BalabalaClassLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_lesson
     * @generated 2018年1月9日 04:35:21
     */
    int deleteByExample(BalabalaClassLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_lesson
     * @generated 2018年1月9日 04:35:21
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_lesson
     * @generated 2018年1月9日 04:35:21
     */
    int insert(BalabalaClassLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_lesson
     * @generated 2018年1月9日 04:35:21
     */
    int insertSelective(BalabalaClassLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_lesson
     * @generated 2018年1月9日 04:35:21
     */
    List<BalabalaClassLesson> selectByExample(BalabalaClassLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_lesson
     * @generated 2018年1月9日 04:35:21
     */
    BalabalaClassLesson selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_lesson
     * @generated 2018年1月9日 04:35:21
     */
    int updateByExampleSelective(@Param("record") BalabalaClassLesson record, @Param("example") BalabalaClassLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_lesson
     * @generated 2018年1月9日 04:35:21
     */
    int updateByExample(@Param("record") BalabalaClassLesson record, @Param("example") BalabalaClassLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_lesson
     * @generated 2018年1月9日 04:35:21
     */
    int updateByPrimaryKeySelective(BalabalaClassLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class_lesson
     * @generated 2018年1月9日 04:35:21
     */
    int updateByPrimaryKey(BalabalaClassLesson record);
}