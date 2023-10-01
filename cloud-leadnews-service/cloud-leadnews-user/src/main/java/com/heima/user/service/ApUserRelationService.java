package com.cloud.user.service;


import com.cloud.model.common.dtos.ResponseResult;
import com.cloud.model.user.dtos.UserRelationDto;


public interface ApUserRelationService {
    /**
     * 用户关注/取消关注
     * @param dto
     * @return
     */
    public ResponseResult follow(UserRelationDto dto);
}