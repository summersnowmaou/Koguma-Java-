package com.westos.app.dao;

import com.westos.app.service.impl.AbsServiceTest;
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
public class UserDAOTest extends AbsServiceTest {

    @Autowired
    private UserDAO userDAO;



    @Before
    public void init(){
      initdb();

    }

    @Test
    public void getUserByUsernameAndPassword() {
        assertNotNull(userDAO);
        User user1=new User();
        user1.setUsername("admin");
        user1.setPassword("123");
        User result = userDAO.getUserByUsernameAndPassword(user1);
        assertNotNull(result);
        assertEquals(1,result.getId().intValue());

        user1.setPassword("123456");
        result=userDAO.getUserByUsernameAndPassword(user1);
        assertNull(result);

        //边界检查
        result=userDAO.getUserByUsernameAndPassword(null);
        assertNull(result);

        //只有用户名，只有密码
        //参数中有中文、特殊字符
    }
}