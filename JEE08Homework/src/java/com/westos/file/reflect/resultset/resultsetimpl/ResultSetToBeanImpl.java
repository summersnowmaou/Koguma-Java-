package com.westos.file.reflect.resultset.resultsetimpl;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.westos.file.reflect.resultset.ResultSetToBean;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Koguma
 * @Date: 2018/5/4 16:23
 */
public class ResultSetToBeanImpl implements ResultSetToBean {

    //调用数据库连接池并生成ResultSet
    public ResultSet getRs(ComboPooledDataSource ds) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;
        String sql = "select * from newclass";
        try{
            conn = ds.getConnection();
            ps = conn.prepareCall(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return rs;
    }

    @Override
    public List<Object> resultsettoBean(ResultSet rs, Class<?> clazz) {
        List<Object> list = new ArrayList<>();
        Field[] fields = clazz.getDeclaredFields();  //用来获取对应属性（对象）
        try{
            while(rs.next()) {
                Object obj = clazz.newInstance();
                for(int i = 0;i<fields.length;i++) {
                    String methodname = "";
                    methodname = "set"+StringUtils.capitalize(fields[i].getName());
                    Method method = clazz.getDeclaredMethod(methodname,fields[i].getType());
                    method.invoke(obj,converttype(rs.getObject(fields[i].getName()),fields[i].getType()));
                }
                list.add(obj);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    private static Object converttype(Object value,Class<?> clazz) {
        if(StringUtils.equals(value.getClass().getName(),clazz.getName())){
            return value;
        }
        if(StringUtils.equals(clazz.getName(),"java.lang.String")){
            return String.valueOf(value);
        }
        if(StringUtils.equals(clazz.getName(),"java.lang.Integer")){
            return Integer.valueOf((String)value);
        }

        return null;
    }
}
