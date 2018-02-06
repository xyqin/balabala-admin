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
     * @generated 2018年2月6日 02:50:55
     */
    long countByExample(BarablahPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年2月6日 02:50:55
     */
    int deleteByExample(BarablahPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年2月6日 02:50:55
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年2月6日 02:50:55
     */
    int insert(BarablahPosition record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年2月6日 02:50:55
     */
    int insertSelective(BarablahPosition record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年2月6日 02:50:55
     */
    List<BarablahPosition> selectByExample(BarablahPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年2月6日 02:50:55
     */
    BarablahPosition selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年2月6日 02:50:55
     */
    int updateByExampleSelective(@Param("record") BarablahPosition record, @Param("example") BarablahPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年2月6日 02:50:55
     */
    int updateByExample(@Param("record") BarablahPosition record, @Param("example") BarablahPositionExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年2月6日 02:50:55
     */
    int updateByPrimaryKeySelective(BarablahPosition record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position
     * @generated 2018年2月6日 02:50:55
     */
    int updateByPrimaryKey(BarablahPosition record);
}