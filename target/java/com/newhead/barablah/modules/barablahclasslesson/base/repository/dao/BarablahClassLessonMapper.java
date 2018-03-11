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
     * @generated 2018年3月11日 09:18:42
     */
    long countByExample(BarablahClassLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年3月11日 09:18:42
     */
    int deleteByExample(BarablahClassLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年3月11日 09:18:42
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年3月11日 09:18:42
     */
    int insert(BarablahClassLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年3月11日 09:18:42
     */
    int insertSelective(BarablahClassLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年3月11日 09:18:42
     */
    List<BarablahClassLesson> selectByExample(BarablahClassLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年3月11日 09:18:42
     */
    BarablahClassLesson selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年3月11日 09:18:42
     */
    int updateByExampleSelective(@Param("record") BarablahClassLesson record, @Param("example") BarablahClassLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年3月11日 09:18:42
     */
    int updateByExample(@Param("record") BarablahClassLesson record, @Param("example") BarablahClassLessonExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年3月11日 09:18:42
     */
    int updateByPrimaryKeySelective(BarablahClassLesson record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class_lesson
     * @generated 2018年3月11日 09:18:42
     */
    int updateByPrimaryKey(BarablahClassLesson record);
}