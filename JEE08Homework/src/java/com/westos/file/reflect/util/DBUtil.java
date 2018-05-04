package com.westos.file.reflect.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBUtil {

    private static ComboPooledDataSource ds;

    static {
        ds = new ComboPooledDataSource();
    }

    public static ComboPooledDataSource getDs() {
        return ds;
    }

}
