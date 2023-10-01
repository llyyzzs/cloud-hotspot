package com.cloud.article.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.model.article.pojos.ApArticleConfig;
import com.cloud.model.comment.dtos.CommentConfigDto;
import com.cloud.model.common.dtos.ResponseResult;

import java.util.Map;

public interface ApArticleConfigService extends IService<ApArticleConfig> {

    /**
     * 修改文章配置
     * @param map
     */
    public void updateByMap(Map map);

    /**
     * 修改文章评论状态
     * @return
     */
    public ResponseResult updateCommentStatus(CommentConfigDto dto);
}