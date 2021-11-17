package com.dhx.dao;

public interface ArticleDao {

    /**
     * 根据id获取文章对象
     * @param id
     * @return
     */
    public abstract com.dhx.domain.Article findArticle(int id);

    /**
     * 添加文章
     * @param article
     * @return
     */
    public abstract int addArticle(com.dhx.domain.Article article);

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
