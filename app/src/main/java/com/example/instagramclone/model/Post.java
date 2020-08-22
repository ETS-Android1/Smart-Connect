package com.example.instagramclone.model;

public class Post {
    private  String PostId;
    private  String ImageUrl;
    private  String Description;
    private  String publisher;

    public Post() {
    }

    public Post(String postId, String imageUrl, String description, String publisher) {
        PostId = postId;
        ImageUrl = imageUrl;
        Description = description;
        this.publisher = publisher;
    }

    public String getPostId() {
        return PostId;
    }

    public void setPostId(String postId) {
        PostId = postId;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
