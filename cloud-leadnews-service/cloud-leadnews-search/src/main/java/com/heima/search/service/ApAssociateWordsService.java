package com.cloud.search.service;

import com.cloud.model.common.dtos.ResponseResult;
import com.cloud.model.search.dtos.UserSearchDto;

public interface ApAssociateWordsService {

    /**
     * 搜索联想词
     * @param dto
     * @return
     */
    public ResponseResult search(UserSearchDto dto);
}
