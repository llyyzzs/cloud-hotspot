package com.cloud.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.model.common.dtos.ResponseResult;
import com.cloud.model.wemedia.dtos.WmLoginDto;
import com.cloud.model.wemedia.pojos.WmUser;

public interface WmUserService extends IService<WmUser> {

    /**
     * 自媒体端登录
     * @param dto
     * @return
     */
    public ResponseResult login(WmLoginDto dto);

}