package com.example.learnenglish.domain.model;

public class Book {
    private String title;
    private int coverResource;
    private String downloadUrl;

    public Book(String title, int coverResource, String downloadUrl) {
        this.title = title;
        this.coverResource = coverResource;
        this.downloadUrl = downloadUrl;
    }

    public String getTitle() {
        return title;
    }

    public int getCoverResource() {
        return coverResource;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }
}
