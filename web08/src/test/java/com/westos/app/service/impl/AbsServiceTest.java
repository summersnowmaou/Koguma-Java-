package com.westos.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(locations = {"classpath:spring.xml"})
public abstract class AbsServiceTest {

    @Autowired
    protected JdbcTemplate jdbcTemplate;

    protected void initdb(){
        String sql="";
        sql="delete from todouser";
        jdbcTemplate.update(sql);
        sql="insert into todouser(id,username,password) values(1,'admin','123')";
        jdbcTemplate.update(sql);

    }
}
