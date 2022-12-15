package com.example.listview;

import java.io.Serializable;

public class Article implements Serializable {
    private String articleImage;
    private String articleName;
    private int articlePrice;

    public Article(String articleImage, String articleName, int articlePrice) {
        this.articleImage = articleImage;
        this.articleName = articleName;
        this.articlePrice = articlePrice;
    }

    public String getArticleImage() {
        return articleImage;
    }

    public void setArticleImage(String articleImage) {
        this.articleImage = articleImage;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public int getArticlePrice() {
        return articlePrice;
    }

    public void setArticlePrice(int articlePrice) {
        this.articlePrice = articlePrice;
    }

    @Override
    public String toString() {
        return this.articleImage +" (Name : "+ this.articleName+" " + "Price : "+ this.articlePrice+ ")";
    }
}
