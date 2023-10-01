package com.cloud.article.service;

import com.cloud.model.article.dtos.CollectionBehaviorDto;
import com.cloud.model.common.dtos.ResponseResult;

public interface ApCollectionService {

    /**
     * 收藏
     * @param dto
     * @return
     */
    public ResponseResult collection(CollectionBehaviorDto dto);
}
