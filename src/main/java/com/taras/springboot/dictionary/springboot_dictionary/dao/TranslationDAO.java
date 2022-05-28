package com.taras.springboot.dictionary.springboot_dictionary.dao;

import com.taras.springboot.dictionary.springboot_dictionary.entity.Translations;

import java.util.List;

public interface TranslationDAO {
    public List<Translations> getAllTranslations();
}
