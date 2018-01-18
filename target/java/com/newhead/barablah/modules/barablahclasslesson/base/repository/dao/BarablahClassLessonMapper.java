package com.newhead.barablah.modules.barablahclasslesson.base.repository.dao;

import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLesson;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLessonExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahClassLessonMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年1月18日 06:52:57
     */
    long countByExample(BarablahClassLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年1月18日 06:52:57
     */
    int deleteByExample(BarablahClassLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年1月18日 06:52:57
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年1月18日 06:52:57
     */
    int insert(BarablahClassLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年1月18日 06:52:57
     */
    int insertSelective(BarablahClassLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年1月18日 06:52:57
     */
    List<BarablahClassLesson> selectByExample(BarablahClassLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年1月18日 06:52:57
     */
    BarablahClassLesson selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年1月18日 06:52:57
     */
    int updateByExampleSelective(@Param("record") BarablahClassLesson record, @Param("example") BarablahClassLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年1月18日 06:52:57
     */
    int updateByExample(@Param("record") BarablahClassLesson record, @Param("example") BarablahClassLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年1月18日 06:52:57
     */
    int updateByPrimaryKeySelective(BarablahClassLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年1月18日 06:52:57
     */
    int updateByPrimaryKey(BarablahClassLesson record);
}