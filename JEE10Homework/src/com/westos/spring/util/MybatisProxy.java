package com.westos.spring.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MybatisProxy implements InvocationHandler {

    private SqlSessionFactory sqlSessionFactory;
    private Class<?> targetclass;

    public MybatisProxy(SqlSessionFactory sqlSessionFactory, Class<?> targetclass) {
        this.sqlSessionFactory = sqlSessionFactory;
        this.targetclass = targetclass;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        SqlSession sqlSession = null;
        sqlSession = sqlSessionFactory.openSession();
        Object realobj = sqlSession.getMapper(targetclass);
        Object result = method.invoke(realobj,args);
        return result;
    }
}
