package com.newhead.barablah.modules.barablahpositioncontent.base.repository.dao;

import com.newhead.barablah.modules.barablahpositioncontent.base.repository.entity.BarablahPositionContent;
import com.newhead.barablah.modules.barablahpositioncontent.base.repository.entity.BarablahPositionContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BarablahPositionContentMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年1月26日 03:39:46
     */
    long countByExample(BarablahPositionContentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年1月26日 03:39:46
     */
    int deleteByExample(BarablahPositionContentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年1月26日 03:39:46
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年1月26日 03:39:46
     */
    int insert(BarablahPositionContent record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年1月26日 03:39:46
     */
    int insertSelective(BarablahPositionContent record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年1月26日 03:39:46
     */
    List<BarablahPositionContent> selectByExample(BarablahPositionContentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年1月26日 03:39:46
     */
    BarablahPositionContent selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年1月26日 03:39:46
     */
    int updateByExampleSelective(@Param("record") BarablahPositionContent record, @Param("example") BarablahPositionContentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年1月26日 03:39:46
     */
    int updateByExample(@Param("record") BarablahPositionContent record, @Param("example") BarablahPositionContentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年1月26日 03:39:46
     */
    int updateByPrimaryKeySelective(BarablahPositionContent record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年1月26日 03:39:46
     */
    int updateByPrimaryKey(BarablahPositionContent record);
}