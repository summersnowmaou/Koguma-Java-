package com.westos.app.service.impl;

import com.westos.app.service.UserService;
import com.westos.bean.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceimpljichengTest extends AbsServiceTest {

    @Autowired
    private UserService userService;

    @Before
    public void init(){
        initdb();
    }

    @Test
    public void loginByUserNameAndPassword() {
        assertNotNull(userService);
        User result = userService.loginByUserNameAndPassword("admin", "123");
        assertEquals(1,result.getId().intValue());
        result = userService.loginByUserNameAndPassword("admin", "123456");
        assertNull(result);
    }
}