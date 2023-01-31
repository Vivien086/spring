package com.leven.spring.service;

import com.leven.spring.pojo.User;

import java.util.List;

public interface IUserService {
    List<User> getAll();

    User getUserByName(String name);

    User getUserById(Integer id);

    void insertUser(User user);

    void deleteUser(Integer id);

    void updata(Integer id);
}
