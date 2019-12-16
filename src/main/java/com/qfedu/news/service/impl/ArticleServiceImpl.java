package com.qfedu.news.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qfedu.common.vo.R;
import com.qfedu.dto.ArticleQueryDto;
import com.qfedu.news.dao.ArticleActionMapper;
import com.qfedu.news.dao.ArticleMapper;
import com.qfedu.news.entity.Article;
import com.qfedu.news.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper mapper;
    @Autowired
    private ArticleActionMapper actionMapper;

    @Override
    public R save(Article article) {
        if(mapper.insert(article)>0){
            return R.Ok();
        }else {
            return R.fail();
        }
    }

    @Override
    public R queryById(int id) {
        return R.Ok(mapper.selectById(id));
    }

    @Override
    public R queryPage(ArticleQueryDto queryDto) {
        if(queryDto.getTitle()!=null){
            queryDto.setTitle("%"+queryDto.getTitle()+"%");
        }
        //设置分页 当前的页码  每页显示的数量
        PageHelper.startPage(queryDto.getPage(), queryDto.getSize());
        //查询数据
        List<Article> list=mapper.selectAll(queryDto);
        PageInfo<Article> page=new PageInfo<>(list);
        return R.Ok(page);
    }

    @Override
    public R del(int id) {
        if(mapper.update(id)>0){
            return R.Ok();
        }else {
            return R.fail();
        }
    }
}
