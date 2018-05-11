package com.westos.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringUtil {

    private static MySpringUtil me = new MySpringUtil();
    private ApplicationContext context;

    private MySpringUtil() {
        this.init();
    }

    private void init() {
        String filename = "spring.xml";
        context = new ClassPathXmlApplicationContext(filename);
    }

    public static MySpringUtil getInstance() {
        return me;
    }

    public Object getBean(String beanid) {
        return context.getBean(beanid);
    }
}
