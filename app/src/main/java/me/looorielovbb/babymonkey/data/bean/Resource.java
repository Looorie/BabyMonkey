package me.looorielovbb.babymonkey.data.bean;

import java.util.List;

public class Resource {

    /**
     * _id : 5b8502f69d21224824a6f954
     * createdAt : 2018-08-28T16:08:22.486Z
     * desc : 适用于iOS的照片库， 与Facebook照片浏览器类似的功能。
     * images : ["https://ww1.sinaimg.cn/large/0073sXn7ly1fuphoh7z5hj308w0fsgr5","https://ww1.sinaimg.cn/large/0073sXn7ly1fuphohc7rxj308w0fs101","https://ww1.sinaimg.cn/large/0073sXn7ly1fuphohp0vjj308w0fs7ah","https://ww1.sinaimg.cn/large/0073sXn7ly1fuphoht0ihj308w0fsq6f","https://ww1.sinaimg.cn/large/0073sXn7ly1fuphoitpsoj308w0fswk7"]
     * publishedAt : 2018-08-28T00:00:00.0Z
     * source : chrome
     * type : iOS
     * url : https://github.com/EddyBorja/EBPhotoPages
     * used : true
     * who : lijinshanmx
     */

    private String _id;
    private String createdAt;
    private String desc;
    private String publishedAt;
    private String source;
    private String type;
    private String url;
    private boolean used;
    private String who;
    private List<String> images;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
