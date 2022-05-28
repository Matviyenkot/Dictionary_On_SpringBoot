package com.taras.springboot.dictionary.springboot_dictionary.dao;

import com.taras.springboot.dictionary.springboot_dictionary.entity.Translations;
import com.taras.springboot.dictionary.springboot_dictionary.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

    public List<Translations> getTranslationsOfUser(int id);
}
