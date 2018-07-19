package com.westos.app.service.impl;


import com.westos.app.dao.UserDAO;
import com.westos.app.service.UserService;
import com.westos.bean.User;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;


@ContextConfiguration(locations = {"classpath:spring.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceimplTest {

    @Mock
    private UserDAO userDAO;


    @InjectMocks
    private UserServiceimpl us;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        System.out.println(userDAO.getClass().getName());
        System.out.println(us.getClass().getName());
    }


    @org.junit.Test
    public void loginByUserNameAndPassword() {

        User returnuser=new User();
        returnuser.setId(1);
        returnuser.setUsername("admin");
        returnuser.setPassword("123");

        when(userDAO.getUserByUsernameAndPassword(any(User.class))).thenReturn(returnuser);
        User result = us.loginByUserNameAndPassword("admin", "123");
        assertNotNull(result);
        assertEquals(1,result.getId().intValue());

        User p1=new User();
        p1.setUsername("admin");
        p1.setPassword("123456");
        when(userDAO.getUserByUsernameAndPassword(eq(p1))).thenReturn(null);
        result = us.loginByUserNameAndPassword("admin", "123456");
        assertNull(result);

        User p2=new User();
        p2.setUsername("java");
        p2.setPassword("123");
        returnuser.setId(2);
        when(userDAO.getUserByUsernameAndPassword(eq(p2))).thenReturn(returnuser);
        result=us.loginByUserNameAndPassword("java", "123");
        assertNotNull(result);
        assertEquals(2,result.getId().intValue());


    }

}
