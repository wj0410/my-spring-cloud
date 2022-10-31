package com.wj.dictionary.query;

import io.github.wj0410.core.tools.restful.annotation.Keyword;
import io.github.wj0410.core.tools.restful.annotation.Query;
import io.github.wj0410.core.tools.restful.dto.PageQuery;
import lombok.Data;

@Data
public class DictionaryQuery extends PageQuery {
    // 通过code查询，默认eq
    @Query()
    private String code;
    // 正序排序
    @Query(Keyword.order_asc)
    private String sort;
}
