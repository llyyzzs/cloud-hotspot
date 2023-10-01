package com.cloud.model.wemedia.dtos;

import com.cloud.model.common.dtos.PageRequestDto;
import lombok.Data;

import java.util.Date;

@Data
public class StatisticsDto extends PageRequestDto {

    private String beginDate;
    private String endDate;
    private Integer wmUserId;
}
