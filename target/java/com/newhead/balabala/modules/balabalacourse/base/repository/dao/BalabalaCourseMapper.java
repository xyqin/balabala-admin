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
     * @generated 2017年12月28日 03:59:19
     */
    long countByExample(BalabalaCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月28日 03:59:19
     */
    int deleteByExample(BalabalaCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月28日 03:59:19
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月28日 03:59:19
     */
    int insert(BalabalaCourse record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月28日 03:59:19
     */
    int insertSelective(BalabalaCourse record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月28日 03:59:19
     */
    List<BalabalaCourse> selectByExample(BalabalaCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月28日 03:59:19
     */
    BalabalaCourse selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月28日 03:59:19
     */
    int updateByExampleSelective(@Param("record") BalabalaCourse record, @Param("example") BalabalaCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月28日 03:59:19
     */
    int updateByExample(@Param("record") BalabalaCourse record, @Param("example") BalabalaCourseExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月28日 03:59:19
     */
    int updateByPrimaryKeySelective(BalabalaCourse record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_course
     * @generated 2017年12月28日 03:59:19
     */
    int updateByPrimaryKey(BalabalaCourse record);
}