package com.westos.file.reflect.resultset;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: Koguma
 * @Date: 2018/5/4 16:19
 */
public interface ResultSetToBean {
    public List<Object> resultsettoBean(ResultSet rs, Class<?> clazz) throws SQLException;
}
