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
     * @generated 2018年3月13日 12:41:30
     */
    long countByExample(BarablahPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月13日 12:41:30
     */
    int deleteByExample(BarablahPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月13日 12:41:30
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月13日 12:41:30
     */
    int insert(BarablahPosition record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月13日 12:41:30
     */
    int insertSelective(BarablahPosition record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月13日 12:41:30
     */
    List<BarablahPosition> selectByExample(BarablahPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月13日 12:41:30
     */
    BarablahPosition selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月13日 12:41:30
     */
    int updateByExampleSelective(@Param("record") BarablahPosition record, @Param("example") BarablahPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月13日 12:41:30
     */
    int updateByExample(@Param("record") BarablahPosition record, @Param("example") BarablahPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月13日 12:41:30
     */
    int updateByPrimaryKeySelective(BarablahPosition record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年3月13日 12:41:30
     */
    int updateByPrimaryKey(BarablahPosition record);
}