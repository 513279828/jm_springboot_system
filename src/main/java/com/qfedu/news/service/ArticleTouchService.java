package com.qfedu.news.service;

import com.qfedu.common.vo.R;
import com.qfedu.news.entity.ArticleTouch;

public interface ArticleTouchService {
    //点赞
    R save(ArticleTouch touch);
    //取消点赞
    R del(ArticleTouch touch);
    //我的
    R list(int mid);
}
