package com.qfedu.news.dao;

import com.qfedu.news.entity.ArticleAction;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleActionMapper {
    int insert(ArticleAction record);

    int insertSelective(ArticleAction record);
}