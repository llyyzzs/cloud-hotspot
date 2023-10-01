package com.cloud.behavior.service;

import com.cloud.model.behavior.dtos.LikesBehaviorDto;
import com.cloud.model.common.dtos.ResponseResult;

public interface ApLikesBehaviorService {

    /**
     * 存储喜欢数据
     * @param dto
     * @return
     */
    public ResponseResult like(LikesBehaviorDto dto);
}
