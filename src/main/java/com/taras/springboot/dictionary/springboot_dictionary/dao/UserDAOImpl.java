package com.taras.springboot.dictionary.springboot_dictionary.dao;

import com.taras.springboot.dictionary.springboot_dictionary.entity.Translations;
import com.taras.springboot.dictionary.springboot_dictionary.entity.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {

        Session session = entityManager.unwrap(Session.class);

        Query<User> query = session.createQuery("from User", User.class);
        List<User> allUsers = query.getResultList();

        return allUsers;
    }

    @Override
    public List<Translations> getTranslationsOfUser(int id) {
        Session session = entityManager.unwrap(Session.class);

        User currentUser = session.get(User.class, id);

        List<Translations> currentUserTranslationsList = currentUser.getTranslationsList();


        return currentUserTranslationsList;
    }

//    @Override
//    public List<Translations> getTranslationsOfUser(User user) {
//        Session session = entityManager.unwrap(Session.class);
//
//        String name = user.getName();
//        String password = user.getPassword();
//
//        Query<User> query = session.createQuery("from User where name =:userName and password =:userPassword");
//        query.setParameter("userName", name);
//        query.setParameter("userPassword", password);
//
//        User currentUser = query.getSingleResult();
//
//        List<Translations> currentUserTranslationsList = currentUser.getTranslationsList();
//
//
//        return currentUserTranslationsList;
//    }
}
