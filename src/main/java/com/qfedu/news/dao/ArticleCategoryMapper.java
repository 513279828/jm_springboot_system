package com.qfedu.news.dao;


import com.qfedu.news.entity.ArticleCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleCategoryMapper {
    int insert(ArticleCategory record);

    int insertSelective(ArticleCategory record);
}