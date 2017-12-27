package com.newhead.balabala.modules.balabalatextbookhomework.base.repository.dao;

import com.newhead.balabala.modules.balabalatextbookhomework.base.repository.entity.BalabalaTextbookHomework;
import com.newhead.balabala.modules.balabalatextbookhomework.base.repository.entity.BalabalaTextbookHomeworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BalabalaTextbookHomeworkMapper {
    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_homework
     * @generated 2017年12月28日 12:00:27
     */
    long countByExample(BalabalaTextbookHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_homework
     * @generated 2017年12月28日 12:00:27
     */
    int deleteByExample(BalabalaTextbookHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_homework
     * @generated 2017年12月28日 12:00:27
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_homework
     * @generated 2017年12月28日 12:00:27
     */
    int insert(BalabalaTextbookHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_homework
     * @generated 2017年12月28日 12:00:27
     */
    int insertSelective(BalabalaTextbookHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_homework
     * @generated 2017年12月28日 12:00:27
     */
    List<BalabalaTextbookHomework> selectByExample(BalabalaTextbookHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_homework
     * @generated 2017年12月28日 12:00:27
     */
    BalabalaTextbookHomework selectByPrimaryKey(Long id);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_homework
     * @generated 2017年12月28日 12:00:27
     */
    int updateByExampleSelective(@Param("record") BalabalaTextbookHomework record, @Param("example") BalabalaTextbookHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_homework
     * @generated 2017年12月28日 12:00:27
     */
    int updateByExample(@Param("record") BalabalaTextbookHomework record, @Param("example") BalabalaTextbookHomeworkExample example);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_homework
     * @generated 2017年12月28日 12:00:27
     */
    int updateByPrimaryKeySelective(BalabalaTextbookHomework record);

    /**
     *  RudderFramework框架生成代码，请不要直接修改..
     *  balabala_textbook_homework
     * @generated 2017年12月28日 12:00:27
     */
    int updateByPrimaryKey(BalabalaTextbookHomework record);
}