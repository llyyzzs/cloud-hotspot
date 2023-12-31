package com.cloud.comment.service;

import com.cloud.model.comment.dtos.CommentDto;
import com.cloud.model.comment.dtos.CommentLikeDto;
import com.cloud.model.comment.dtos.CommentSaveDto;
import com.cloud.model.common.dtos.ResponseResult;
import org.springframework.web.bind.annotation.RequestBody;

public interface CommentService {

    /**
     * 保存评论
     * @param dto
     * @return
     */
    public ResponseResult saveComment(CommentSaveDto dto);

    /**
     * 点赞
     * @param dto
     * @return
     */
    public ResponseResult like(CommentLikeDto dto);

    /**
     * 加载评论列表
     * @param dto
     * @return
     */
    public ResponseResult findByArticleId(CommentDto dto);


}
