package com.qfedu.news.dao;

import com.qfedu.dto.ArticleTouchDto;
import com.qfedu.news.entity.ArticleTouch;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleTouchMapper {
    int insert(ArticleTouch record);
    int del(ArticleTouch touch);
    List<ArticleTouchDto> selectAll(int mid);
}