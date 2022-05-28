package com.taras.springboot.dictionary.springboot_dictionary.entity;

import javax.persistence.*;

@Entity
@Table(name = "translation_words")
public class Translations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "english_word")
    private String englishWord;

    @Column(name = "ukrainian_word")
    private String ukrainianWord;

    public Translations(){}

    public Translations(String englishWord, String ukrainianWord) {
        this.englishWord = englishWord;
        this.ukrainianWord = ukrainianWord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getUkrainianWord() {
        return ukrainianWord;
    }

    public void setUkrainianWord(String ukrainianWord) {
        this.ukrainianWord = ukrainianWord;
    }

    @Override
    public String toString() {
        return "Translations{" +
                "id=" + id +
                ", Word on English: '" + englishWord + '\'' +
                ", Word on Ukrainian: '" + ukrainianWord + '\'' +
                '}';
    }
}
