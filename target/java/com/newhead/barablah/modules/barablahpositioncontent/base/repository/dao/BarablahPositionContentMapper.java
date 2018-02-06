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
     * @generated 2018年2月6日 03:55:36
     */
    long countByExample(BarablahPositionContentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年2月6日 03:55:36
     */
    int deleteByExample(BarablahPositionContentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年2月6日 03:55:36
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年2月6日 03:55:36
     */
    int insert(BarablahPositionContent record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年2月6日 03:55:36
     */
    int insertSelective(BarablahPositionContent record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年2月6日 03:55:36
     */
    List<BarablahPositionContent> selectByExample(BarablahPositionContentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年2月6日 03:55:36
     */
    BarablahPositionContent selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年2月6日 03:55:36
     */
    int updateByExampleSelective(@Param("record") BarablahPositionContent record, @Param("example") BarablahPositionContentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年2月6日 03:55:36
     */
    int updateByExample(@Param("record") BarablahPositionContent record, @Param("example") BarablahPositionContentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年2月6日 03:55:36
     */
    int updateByPrimaryKeySelective(BarablahPositionContent record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  barablah_position_content
     * @generated 2018年2月6日 03:55:36
     */
    int updateByPrimaryKey(BarablahPositionContent record);
}