package com.dhx.service;

import com.dhx.domain.Article;

public interface ArticleService {

    /**
     * 根据id获取文章对象
     * @param id
     * @return
     */
    public abstract Article findArticle(int id);

    /**
     * 添加文章
     * @param article
     * @return
     */
    public abstract int addArticle(Article article);

    /**
     * 删除文章
     * @param article
     * @return
     */
    public abstract int delArticle(int id);

    /**
     * 修改文章
     * @param id
     * @return
     */
    public abstract int updateArticle(int id);
}
