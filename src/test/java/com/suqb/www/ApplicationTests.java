package com.suqb.www;

import com.suqb.www.controller.RouteController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private RouteController routeController;

    @Test
    void contextLoads() {
    }

    @Test
    void test() {
        String login = routeController.login();
        System.out.println(login);
    }
}
