package com.westos.file.reflect;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.westos.file.reflect.entity.NewClass;
import com.westos.file.reflect.resultset.ResultSetToBean;
import com.westos.file.reflect.resultset.resultsetimpl.ResultSetToBeanImpl;
import com.westos.file.reflect.util.DBUtil;

import java.sql.ResultSet;
import java.util.List;

/**
 * @Author: Koguma
 * @Date: 2018/5/4 17:53
 */
public class Client {

    public static void main(String [] args) {
        ComboPooledDataSource ds = DBUtil.getDs();
        ResultSetToBeanImpl rst = new ResultSetToBeanImpl();
        ResultSet rs = rst.getRs(ds);
        List<Object> list = rst.resultsettoBean(rs,NewClass.class);

        System.out.println(list);
        ds.close();
    }
}
