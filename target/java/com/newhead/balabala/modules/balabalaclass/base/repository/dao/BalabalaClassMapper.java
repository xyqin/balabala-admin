package com.newhead.balabala.modules.balabalaclass.base.repository.dao;

import com.newhead.balabala.modules.balabalaclass.base.repository.entity.BalabalaClass;
import com.newhead.balabala.modules.balabalaclass.base.repository.entity.BalabalaClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaClassMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class
     * @generated 2017年12月28日 03:59:19
     */
    long countByExample(BalabalaClassExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class
     * @generated 2017年12月28日 03:59:19
     */
    int deleteByExample(BalabalaClassExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class
     * @generated 2017年12月28日 03:59:19
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class
     * @generated 2017年12月28日 03:59:19
     */
    int insert(BalabalaClass record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class
     * @generated 2017年12月28日 03:59:19
     */
    int insertSelective(BalabalaClass record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class
     * @generated 2017年12月28日 03:59:19
     */
    List<BalabalaClass> selectByExample(BalabalaClassExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class
     * @generated 2017年12月28日 03:59:19
     */
    BalabalaClass selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class
     * @generated 2017年12月28日 03:59:19
     */
    int updateByExampleSelective(@Param("record") BalabalaClass record, @Param("example") BalabalaClassExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class
     * @generated 2017年12月28日 03:59:19
     */
    int updateByExample(@Param("record") BalabalaClass record, @Param("example") BalabalaClassExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class
     * @generated 2017年12月28日 03:59:19
     */
    int updateByPrimaryKeySelective(BalabalaClass record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_class
     * @generated 2017年12月28日 03:59:19
     */
    int updateByPrimaryKey(BalabalaClass record);
}