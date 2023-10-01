package com.cloud.search.service;

import com.cloud.model.common.dtos.ResponseResult;
import com.cloud.model.search.dtos.HistorySearchDto;

public interface ApUserSearchService {

    /**
     * 保存用户搜索历史记录
     * @param keyword
     * @param userId
     */
    public void insert(String keyword,Integer userId);

    /**
     * 查询搜索历史
     * @return
     */
    public ResponseResult findUserSearch();

    /**
     * 删除历史记录
     * @param dto
     * @return
     */
    public ResponseResult delUserSearch(HistorySearchDto dto);
}
