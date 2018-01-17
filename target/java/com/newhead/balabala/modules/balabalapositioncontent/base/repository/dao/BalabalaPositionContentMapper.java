package com.newhead.balabala.modules.balabalapositioncontent.base.repository.dao;

import com.newhead.balabala.modules.balabalapositioncontent.base.repository.entity.BalabalaPositionContent;
import com.newhead.balabala.modules.balabalapositioncontent.base.repository.entity.BalabalaPositionContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaPositionContentMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position_content
     * @generated 2018年1月17日 05:42:33
     */
    long countByExample(BalabalaPositionContentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position_content
     * @generated 2018年1月17日 05:42:33
     */
    int deleteByExample(BalabalaPositionContentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position_content
     * @generated 2018年1月17日 05:42:33
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position_content
     * @generated 2018年1月17日 05:42:33
     */
    int insert(BalabalaPositionContent record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position_content
     * @generated 2018年1月17日 05:42:33
     */
    int insertSelective(BalabalaPositionContent record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position_content
     * @generated 2018年1月17日 05:42:33
     */
    List<BalabalaPositionContent> selectByExample(BalabalaPositionContentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position_content
     * @generated 2018年1月17日 05:42:33
     */
    BalabalaPositionContent selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position_content
     * @generated 2018年1月17日 05:42:33
     */
    int updateByExampleSelective(@Param("record") BalabalaPositionContent record, @Param("example") BalabalaPositionContentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position_content
     * @generated 2018年1月17日 05:42:33
     */
    int updateByExample(@Param("record") BalabalaPositionContent record, @Param("example") BalabalaPositionContentExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position_content
     * @generated 2018年1月17日 05:42:33
     */
    int updateByPrimaryKeySelective(BalabalaPositionContent record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_position_content
     * @generated 2018年1月17日 05:42:33
     */
    int updateByPrimaryKey(BalabalaPositionContent record);
}