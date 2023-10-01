package com.cloud.behavior.service;

import com.cloud.model.behavior.dtos.ReadBehaviorDto;
import com.cloud.model.common.dtos.ResponseResult;

public interface ApReadBehaviorService {

    /**
     * 保存阅读行为
     * @param dto
     * @return
     */
    public ResponseResult readBehavior(ReadBehaviorDto dto);
}
