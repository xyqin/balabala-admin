package com.newhead.balabala.modules.balabalaposition.base.repository.dao;

import com.newhead.balabala.modules.balabalaposition.base.repository.entity.BalabalaPosition;
import com.newhead.balabala.modules.balabalaposition.base.repository.entity.BalabalaPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaPositionMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position
     * @generated 2018年1月17日 05:42:33
     */
    long countByExample(BalabalaPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position
     * @generated 2018年1月17日 05:42:33
     */
    int deleteByExample(BalabalaPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position
     * @generated 2018年1月17日 05:42:33
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position
     * @generated 2018年1月17日 05:42:33
     */
    int insert(BalabalaPosition record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position
     * @generated 2018年1月17日 05:42:33
     */
    int insertSelective(BalabalaPosition record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position
     * @generated 2018年1月17日 05:42:33
     */
    List<BalabalaPosition> selectByExample(BalabalaPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position
     * @generated 2018年1月17日 05:42:33
     */
    BalabalaPosition selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position
     * @generated 2018年1月17日 05:42:33
     */
    int updateByExampleSelective(@Param("record") BalabalaPosition record, @Param("example") BalabalaPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position
     * @generated 2018年1月17日 05:42:33
     */
    int updateByExample(@Param("record") BalabalaPosition record, @Param("example") BalabalaPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position
     * @generated 2018年1月17日 05:42:33
     */
    int updateByPrimaryKeySelective(BalabalaPosition record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position
     * @generated 2018年1月17日 05:42:33
     */
    int updateByPrimaryKey(BalabalaPosition record);
}