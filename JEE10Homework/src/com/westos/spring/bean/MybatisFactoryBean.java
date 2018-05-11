package com.westos.spring.bean;

import com.westos.spring.util.MybatisProxy;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

public class MybatisFactoryBean<T> implements FactoryBean<T> {

    private SqlSessionFactory sqlSessionFactory;
    private Class<T> targetclass;

    @Override
    public T getObject() throws Exception {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{targetclass}, new MybatisProxy(sqlSessionFactory,targetclass));
    }

    @Override
    public Class<?> getObjectType() {
        return targetclass;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public Class<T> getTargetclass() {
        return targetclass;
    }

    public void setTargetclass(Class<T> targetclass) {
        this.targetclass = targetclass;
    }
}
