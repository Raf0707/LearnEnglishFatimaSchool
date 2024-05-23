package com.example.learnenglish.domain.model;

public class DictionaryEntry {
    private String english;
    private String russian;

    public DictionaryEntry(String english, String russian) {
        this.english = english;
        this.russian = russian;
    }

    public String getEnglish() {
        return english;
    }

    public String getRussian() {
        return russian;
    }
}
