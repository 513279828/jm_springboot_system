package com.qfedu.news.service;


import com.qfedu.common.vo.R;
import com.qfedu.dto.ArticleQueryDto;
import com.qfedu.news.entity.Article;

public interface ArticleService {
    //新增
    R save(Article article);
    //查询详情
    R queryById(int id);
    //查询列表--分页，条件，类型
    R queryPage(ArticleQueryDto queryDto);
    //删除
    R del(int id);

}
