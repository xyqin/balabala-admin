package com.newhead.barablah.modules.barablahclass.base.repository.dao;

import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahClassMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class
     * @generated 2018年2月6日 03:58:37
     */
    long countByExample(BarablahClassExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class
     * @generated 2018年2月6日 03:58:37
     */
    int deleteByExample(BarablahClassExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class
     * @generated 2018年2月6日 03:58:37
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class
     * @generated 2018年2月6日 03:58:37
     */
    int insert(BarablahClass record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class
     * @generated 2018年2月6日 03:58:37
     */
    int insertSelective(BarablahClass record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class
     * @generated 2018年2月6日 03:58:37
     */
    List<BarablahClass> selectByExample(BarablahClassExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class
     * @generated 2018年2月6日 03:58:37
     */
    BarablahClass selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class
     * @generated 2018年2月6日 03:58:37
     */
    int updateByExampleSelective(@Param("record") BarablahClass record, @Param("example") BarablahClassExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class
     * @generated 2018年2月6日 03:58:37
     */
    int updateByExample(@Param("record") BarablahClass record, @Param("example") BarablahClassExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class
     * @generated 2018年2月6日 03:58:37
     */
    int updateByPrimaryKeySelective(BarablahClass record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_class
     * @generated 2018年2月6日 03:58:37
     */
    int updateByPrimaryKey(BarablahClass record);
}