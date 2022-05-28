package com.taras.springboot.dictionary.springboot_dictionary.service;

import com.taras.springboot.dictionary.springboot_dictionary.dao.TranslationDAO;
import com.taras.springboot.dictionary.springboot_dictionary.entity.Translations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TranslationServiceImpl implements TranslationService{

    @Autowired
    private TranslationDAO translationDAO;


    @Override
    @Transactional
    public List<Translations> getAllTranslations() {

        return translationDAO.getAllTranslations();
    }
}
