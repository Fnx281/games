package com.dhx.service.impl;

import com.dhx.dao.ArticleDao;
import com.dhx.dao.impl.ArticleDaoImpl;
import com.dhx.domain.Article;
import com.dhx.service.ArticleService;

public class ArticleServiceImpl implements ArticleService {
    ArticleDao ad = new ArticleDaoImpl();

    //根据id获取文章对象
    @Override
    public Article findArticle(int id) {
        return ad.findArticle(id);
    }

    //添加文章
    @Override
    public int addArticle(Article article) {
        return ad.addArticle(article);
    }

    //删除文章
    @Override
    public int delArticle(int id) {
        return ad.delArticle(id);
    }

    //修改文章
    @Override
    public int updateArticle(int id) {
        return ad.updateArticle(id);
    }
}
