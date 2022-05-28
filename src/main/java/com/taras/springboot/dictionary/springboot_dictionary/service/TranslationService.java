package com.taras.springboot.dictionary.springboot_dictionary.service;

import com.taras.springboot.dictionary.springboot_dictionary.entity.Translations;

import java.util.List;

public interface TranslationService {

    public List<Translations> getAllTranslations();
}
