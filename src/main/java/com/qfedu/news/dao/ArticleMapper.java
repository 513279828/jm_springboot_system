package com.qfedu.news.dao;

import com.qfedu.dto.ArticleQueryDto;
import com.qfedu.news.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleMapper {
    int insert(Article record);
    Article selectById(int id);
    List<Article> selectAll(ArticleQueryDto queryDto);
    int update(int id);
}