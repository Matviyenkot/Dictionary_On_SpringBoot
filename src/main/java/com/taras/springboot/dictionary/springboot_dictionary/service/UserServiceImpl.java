package com.taras.springboot.dictionary.springboot_dictionary.service;


import com.taras.springboot.dictionary.springboot_dictionary.dao.UserDAO;
import com.taras.springboot.dictionary.springboot_dictionary.entity.Translations;
import com.taras.springboot.dictionary.springboot_dictionary.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;


    @Override
    @Transactional
    public List<User> getAllUsers() {


        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public List<Translations> getTranslationsOfUser(int id) {

        return userDAO.getTranslationsOfUser(id);
    }
}
