package com.westos;

import com.westos.spring.util.ApplicationContextUtil;
import org.apache.ibatis.session.SqlSessionFactory;

public class Client {
    public static void main(String[] args) {

        SqlSessionFactory sqlSessionFactory=ApplicationContextUtil.getApplicationContext().getBean("sqlSessionFactory",SqlSessionFactory.class);
        System.out.println(sqlSessionFactory);
    }
}
