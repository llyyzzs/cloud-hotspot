package com.cloud.wemedia.service;

import com.cloud.model.common.dtos.PageResponseResult;
import com.cloud.model.common.dtos.ResponseResult;
import com.cloud.model.wemedia.dtos.StatisticsDto;

import java.util.Date;

public interface WmStatisticsService {

    /**
     * 图文统计
     * @param beginDate
     * @param endDate
     * @return
     */
    public ResponseResult newsDimension(String beginDate, String endDate);

    /**
     * 分页查询图文统计
     * @param dto
     * @return
     */
    PageResponseResult newsPage(StatisticsDto dto);
}
