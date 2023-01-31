package com.leven.spring;

import com.leven.spring.pojo.User;
import com.leven.spring.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private IUserService userService;

    @Test
    void getAll() {
        List<User> all = userService.getAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

    @Test
    void insert() {
        User user = new User();
        user.setUsername("李四");
        user.setPassword("456");
        userService.insertUser(user);
    }

    @Test
    void delete() {
        userService.deleteUser(3);
    }

    @Test
    void update() {
        userService.deleteUser(3);
    }

}
