package com.newhead.balabala.modules.balabalacourse.base.repository.dao;

import com.newhead.balabala.modules.balabalacourse.base.repository.entity.BalabalaCourse;
import com.newhead.balabala.modules.balabalacourse.base.repository.entity.BalabalaCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaCourseMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月23日 02:12:57
     */
    long countByExample(BalabalaCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月23日 02:12:57
     */
    int deleteByExample(BalabalaCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月23日 02:12:57
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月23日 02:12:57
     */
    int insert(BalabalaCourse record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月23日 02:12:57
     */
    int insertSelective(BalabalaCourse record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月23日 02:12:57
     */
    List<BalabalaCourse> selectByExample(BalabalaCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月23日 02:12:57
     */
    BalabalaCourse selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月23日 02:12:57
     */
    int updateByExampleSelective(@Param("record") BalabalaCourse record, @Param("example") BalabalaCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月23日 02:12:57
     */
    int updateByExample(@Param("record") BalabalaCourse record, @Param("example") BalabalaCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月23日 02:12:57
     */
    int updateByPrimaryKeySelective(BalabalaCourse record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月23日 02:12:57
     */
    int updateByPrimaryKey(BalabalaCourse record);
}