package com.taras.springboot.dictionary.springboot_dictionary.controllers;

import com.taras.springboot.dictionary.springboot_dictionary.entity.Translations;
import com.taras.springboot.dictionary.springboot_dictionary.entity.User;
import com.taras.springboot.dictionary.springboot_dictionary.service.TranslationService;
import com.taras.springboot.dictionary.springboot_dictionary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private TranslationService translationService;

    @Autowired
    private UserService userService;

    @GetMapping("/translations")
    public List<Translations> getAllTranslations(){

        List<Translations> allTranslations = translationService.getAllTranslations();

        return allTranslations;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){

        List<User> allUsers = userService.getAllUsers();

        return allUsers;
    }

    @GetMapping("/users/{id}")
    public List<Translations> getTranslationsOfUser(@PathVariable int id){

        return userService.getTranslationsOfUser(id);
    }

}
