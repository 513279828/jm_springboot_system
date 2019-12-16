package com.qfedu.news.service.impl;

import com.qfedu.common.vo.R;
import com.qfedu.news.dao.ArticleTouchMapper;
import com.qfedu.news.entity.ArticleTouch;
import com.qfedu.news.service.ArticleTouchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleTouchServiceImpl  implements ArticleTouchService {
    @Autowired
    private ArticleTouchMapper touchMapper;

    @Override
    public R save(ArticleTouch touch) {
        if(touchMapper.insert(touch)>0){
            return R.Ok();
        }else {
            return R.fail();
        }
    }

    @Override
    public R del(ArticleTouch touch) {
        if(touchMapper.del(touch)>0){
            return R.Ok();
        }else {
            return R.fail();
        }
    }

    @Override
    public R list(int mid) {
        return R.Ok(touchMapper.selectAll(mid));
    }
}
