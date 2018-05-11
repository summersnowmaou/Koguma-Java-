package com.westos.todo.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisUtil {
    private static MybatisUtil me;
    private SqlSessionFactory sqlSessionFactory;

    private MybatisUtil() {
        String resource="mybatis.xml";
        try {
            InputStream in = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MybatisUtil getInstance() {
        if (me==null) {
            me=new MybatisUtil();
        }
        return me;
    }

    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
