package com.newhead.barablah.modules.barablahmemberlessonlog.base.repository.dao;

import com.newhead.barablah.modules.barablahmemberlessonlog.base.repository.entity.BarablahMemberLessonlog;
import com.newhead.barablah.modules.barablahmemberlessonlog.base.repository.entity.BarablahMemberLessonlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahMemberLessonlogMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lessonlog
     * @generated 2018年3月25日 10:55:18
     */
    long countByExample(BarablahMemberLessonlogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lessonlog
     * @generated 2018年3月25日 10:55:18
     */
    int deleteByExample(BarablahMemberLessonlogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lessonlog
     * @generated 2018年3月25日 10:55:18
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lessonlog
     * @generated 2018年3月25日 10:55:18
     */
    int insert(BarablahMemberLessonlog record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lessonlog
     * @generated 2018年3月25日 10:55:18
     */
    int insertSelective(BarablahMemberLessonlog record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lessonlog
     * @generated 2018年3月25日 10:55:18
     */
    List<BarablahMemberLessonlog> selectByExample(BarablahMemberLessonlogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lessonlog
     * @generated 2018年3月25日 10:55:18
     */
    BarablahMemberLessonlog selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lessonlog
     * @generated 2018年3月25日 10:55:18
     */
    int updateByExampleSelective(@Param("record") BarablahMemberLessonlog record, @Param("example") BarablahMemberLessonlogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lessonlog
     * @generated 2018年3月25日 10:55:18
     */
    int updateByExample(@Param("record") BarablahMemberLessonlog record, @Param("example") BarablahMemberLessonlogExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lessonlog
     * @generated 2018年3月25日 10:55:18
     */
    int updateByPrimaryKeySelective(BarablahMemberLessonlog record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_member_lessonlog
     * @generated 2018年3月25日 10:55:18
     */
    int updateByPrimaryKey(BarablahMemberLessonlog record);
}