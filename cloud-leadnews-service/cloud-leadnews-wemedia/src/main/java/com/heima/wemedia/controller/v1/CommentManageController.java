package com.cloud.wemedia.controller.v1;

import com.cloud.apis.article.IArticleClient;
import com.cloud.model.article.dtos.ArticleCommentDto;
import com.cloud.model.comment.dtos.CommentConfigDto;
import com.cloud.model.comment.dtos.CommentLikeDto;
import com.cloud.model.comment.dtos.CommentManageDto;
import com.cloud.model.comment.dtos.CommentRepaySaveDto;
import com.cloud.model.common.dtos.PageResponseResult;
import com.cloud.model.common.dtos.ResponseResult;
import com.cloud.model.wemedia.pojos.WmUser;
import com.cloud.utils.thread.WmThreadLocalUtil;
import com.cloud.wemedia.service.CommentManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/comment/manage")
public class CommentManageController {

    @Autowired
    private CommentManageService commentManageService;

    @PostMapping("/list")
    public ResponseResult list(@RequestBody CommentManageDto dto){
        return commentManageService.list(dto);
    }

    @DeleteMapping("/del_comment/{commentId}")
    public ResponseResult delComment(@PathVariable("commentId") String commentId){
        return commentManageService.delComment(commentId);
    }

    @DeleteMapping("/del_comment_repay/{commentRepayId}")
    public ResponseResult delCommentRepay(@PathVariable("commentRepayId") String commentRepayId){
        return commentManageService.delCommentRepay(commentRepayId);
    }

    @PostMapping("/find_news_comments")
    public PageResponseResult findNewsComments(@RequestBody ArticleCommentDto dto){
        return commentManageService.findNewsComments(dto);
    }

    @PostMapping("/update_comment_status")
    public ResponseResult updateCommentStatus(@RequestBody CommentConfigDto dto){
        return commentManageService.updateCommentStatus(dto);
    }

    @PostMapping("/comment_repay")
    public ResponseResult saveCommentRepay(@RequestBody CommentRepaySaveDto dto){
        return commentManageService.saveCommentRepay(dto);
    }

    @PostMapping("/like")
    public ResponseResult like(@RequestBody CommentLikeDto dto){
        return commentManageService.like(dto);
    }

}