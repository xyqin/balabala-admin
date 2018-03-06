package com.newhead.barablah.modules.barablahtextbook.ext;

import com.newhead.barablah.modules.barablahtextbook.base.AbstractBarablahTextbookService;
import com.newhead.barablah.modules.barablahtextbook.base.repository.dao.BarablahTextbookMapper;
import com.newhead.barablah.modules.barablahtextbook.base.repository.entity.BarablahTextbook;
import com.newhead.barablah.modules.barablahtextbook.base.repository.entity.BarablahTextbookExample;
import com.newhead.barablah.modules.barablahtextbook.ext.protocol.SimpleBarablahTextbookQueryResponse;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * RudderFramework 自动生成
 * 教材表服务
 * 2018年02月07日 10:47:07
 */
@Api(tags = "教材表", description = "相关的API")
@Service
public class SimpleBarablahTextbookService extends AbstractBarablahTextbookService {

    @Autowired
    private BarablahTextbookMapper mapper;

    @Override
    protected BarablahTextbookMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahTextbook entity) {

    }


    /**
     * 查询
     * @param
     * @return
     */
    public long getChildNums(long id) {
        //结果
        List<SimpleBarablahTextbookQueryResponse> results = new ArrayList<SimpleBarablahTextbookQueryResponse>();

        //构造查询对象
        BarablahTextbookExample example = new BarablahTextbookExample();
        BarablahTextbookExample.Criteria c = example.createCriteria();
        c.andDeletedEqualTo(false);
        c.andCategoryIdEqualTo(id);

        long count = getMapper().countByExample(example);
        return count;
    }

}
