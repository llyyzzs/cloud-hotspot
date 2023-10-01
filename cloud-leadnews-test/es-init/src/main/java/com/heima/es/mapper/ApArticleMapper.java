package com.cloud.es.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.es.pojo.SearchArticleVo;
import com.cloud.model.article.pojos.ApArticle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApArticleMapper extends BaseMapper<ApArticle> {

    List<SearchArticleVo> loadArticleList();

}
