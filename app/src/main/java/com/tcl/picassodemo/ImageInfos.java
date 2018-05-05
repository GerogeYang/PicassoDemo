package com.tcl.picassodemo;

/**
 * 项目名：   PicassoDemo
 * 包名：     com.tcl.picassodemo
 * 文件名：   ImageInfos
 * 创建者：   Mr Yang
 * 创建时间： 2018/5/3 18:10
 * 描述：     使用Builder模式构建
 */


public class ImageInfos {
    //标题
    private String title;
    //作者
    private String author;
    //大小
    private long size;
    //图片url
    private String picUrl;

    public ImageInfos(String picUrl) {
        this.picUrl = picUrl;
    }

    public ImageInfos(String title, String author, String picUrl) {
        this.title = title;
        this.author = author;
        this.picUrl = picUrl;
    }

    public ImageInfos(String title, String author, long size, String picUrl) {
        this.title = title;
        this.author = author;
        this.size = size;
        this.picUrl = picUrl;
    }

    private ImageInfos(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.size = builder.size;
        this.picUrl = builder.picUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public static final class Builder {
        //标题
        private String title;
        //作者
        private String author;
        //大小
        private long size;
        //图片url
        private String picUrl;

        public Builder(String picUrl) {
            this.picUrl = picUrl;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setSize(long size) {
            this.size = size;
            return this;
        }

        public Builder setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }

        public ImageInfos build() {
            return new ImageInfos(this);
        }
    }
}
