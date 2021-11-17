package com.dhx.domain;

import java.util.Date;

public class Article {
    private int articleId;
    private String articleName;
    private Date articleDate;
    private String articleAuthor;
    private String articleTag;
    private String articleImage;
    private String articleVideo;
    private String articleContent;
    private int userId;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public Date getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public String getArticleTag() {
        return articleTag;
    }

    public void setArticleTag(String articleTag) {
        this.articleTag = articleTag;
    }

    public String getArticleImage() {
        return articleImage;
    }

    public void setArticleImage(String articleImage) {
        this.articleImage = articleImage;
    }

    public String getArticleVideo() {
        return articleVideo;
    }

    public void setArticleVideo(String articleVideo) {
        this.articleVideo = articleVideo;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Article() {
    }

    public Article(int articleId, String articleName, Date articleDate, String articleAuthor, String articleTag, String articleImage, String articleVideo, String articleContent, int userId) {
        this.articleId = articleId;
        this.articleName = articleName;
        this.articleDate = articleDate;
        this.articleAuthor = articleAuthor;
        this.articleTag = articleTag;
        this.articleImage = articleImage;
        this.articleVideo = articleVideo;
        this.articleContent = articleContent;
        this.userId = userId;
    }
}
