package com.westos.app.service;

import com.westos.bean.User;

public interface UserService {

    User loginByUserNameAndPassword(String username, String password);
    User loginByUserNameAndPassword(User user);
}
