package com.cloud.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.model.admin.dtos.AdUserDto;
import com.cloud.model.admin.pojos.AdUser;
import com.cloud.model.common.dtos.ResponseResult;

public interface AdUserService extends IService<AdUser> {

    /**
     * 登录
     * @param dto
     * @return
     */
    public ResponseResult login(AdUserDto dto);
}
