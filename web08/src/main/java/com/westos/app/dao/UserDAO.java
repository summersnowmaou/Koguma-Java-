package com.westos.app.dao;

import com.westos.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserDAO {

    User getUserByUsernameAndPassword(User user);
}
