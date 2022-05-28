package com.taras.springboot.dictionary.springboot_dictionary.dao;

import com.taras.springboot.dictionary.springboot_dictionary.entity.Translations;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TranslationDAOImpl implements TranslationDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Translations> getAllTranslations() {

        Session session = entityManager.unwrap(Session.class);

        Query<Translations> query = session.createQuery("from Translations", Translations.class);
        List<Translations> allTranslations = query.getResultList();

        return allTranslations;
    }
}

