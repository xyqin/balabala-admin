package com.newhead.barablah.modules.barablahposition.base.repository.dao;

import com.newhead.barablah.modules.barablahposition.base.repository.entity.BarablahPosition;
import com.newhead.barablah.modules.barablahposition.base.repository.entity.BarablahPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahPositionMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月10日 07:58:13
     */
    long countByExample(BarablahPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月10日 07:58:13
     */
    int deleteByExample(BarablahPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月10日 07:58:13
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月10日 07:58:13
     */
    int insert(BarablahPosition record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月10日 07:58:13
     */
    int insertSelective(BarablahPosition record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月10日 07:58:13
     */
    List<BarablahPosition> selectByExample(BarablahPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月10日 07:58:13
     */
    BarablahPosition selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月10日 07:58:13
     */
    int updateByExampleSelective(@Param("record") BarablahPosition record, @Param("example") BarablahPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月10日 07:58:13
     */
    int updateByExample(@Param("record") BarablahPosition record, @Param("example") BarablahPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月10日 07:58:13
     */
    int updateByPrimaryKeySelective(BarablahPosition record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月10日 07:58:13
     */
    int updateByPrimaryKey(BarablahPosition record);
}