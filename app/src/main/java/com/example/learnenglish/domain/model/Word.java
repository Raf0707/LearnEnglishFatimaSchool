package com.example.learnenglish.domain.model;

public class Word {
    public String englishWord;
    public String translateWord;

    public Word(String englishWord, String translateWord) {
        this.englishWord = englishWord;
        this.translateWord = translateWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getTranslateWord() {
        return translateWord;
    }

    public void setTranslateWord(String translateWord) {
        this.translateWord = translateWord;
    }
}
