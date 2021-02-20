package com.gasparbarancelli.mysqlnativequery.to;

public class PostTO {

    private String postTitle;
    private String tagDescription;
    private String authorName;

    @Deprecated
    public PostTO() {
    }

    public String getPostTitle() {
        return postTitle;
    }

    public String getTagDescription() {
        return tagDescription;
    }

    public String getAuthorName() {
        return authorName;
    }
}
