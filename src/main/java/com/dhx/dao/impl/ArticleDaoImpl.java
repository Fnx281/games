package com.dhx.dao.impl;

import com.dhx.Utils.JDBCUtils;
import com.dhx.dao.ArticleDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class ArticleDaoImpl implements ArticleDao {
    JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());

    //根据id获取文章对象
    @Override
    public com.dhx.domain.Article findArticle(int id) {
        String sql="select * from article where id=?";
        return jt.queryForObject(sql, new BeanPropertyRowMapper<>(com.dhx.domain.Article.class), id);
    }

    //添加文章
    @Override
    public int addArticle(com.dhx.domain.Article article) {
        String sql="insert into article values(?,?,?,?,?,?,?,?,?)";
        return jt.update(sql,
            article.getArticleId(),
            article.getArticleName(),
            article.getArticleDate(),
            article.getArticleAuthor(),
            article.getArticleTag(),
            article.getArticleImage(),
            article.getArticleVideo(),
            article.getArticleContent(),
            article.getUserId());
    }

    //删除文章
    @Override
    public int delArticle(int id) {
        String sql = "delete from article where id=?";
        return jt.update(sql, id);
    }

    //修改文章
    @Override
    public int updateArticle(int id) {
        com.dhx.domain.Article article = findArticle(id);
        String sql="update article set articleId=?,articleName=?,articleDate=?,articleAuthor=?," +
            "articleTag=?,articleImage=?,articleVideo=?,articleContent=?,user_id=?";

        return jt.update(sql,
            article.getArticleId(),
            article.getArticleName(),
            article.getArticleDate(),
            article.getArticleAuthor(),
            article.getArticleTag(),
            article.getArticleImage(),
            article.getArticleVideo(),
            article.getArticleContent(),
            article.getUserId());
    }
}
