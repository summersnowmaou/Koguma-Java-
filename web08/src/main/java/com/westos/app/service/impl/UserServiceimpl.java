package com.westos.app.service.impl;

import com.westos.app.dao.UserDAO;
import com.westos.app.service.UserService;
import com.westos.bean.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceimpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User loginByUserNameAndPassword(String username, String password) {
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        return loginByUserNameAndPassword(user);
    }

    @Override
    public User loginByUserNameAndPassword(User user) {
        User result = userDAO.getUserByUsernameAndPassword(user);
        return result;


    }
}
