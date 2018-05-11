package com.westos.todo.servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WestosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, UnsupportedEncodingException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String url=req.getServletPath();
        String[] paths = StringUtils.split(url, "/");
        System.out.println(paths.length);
        System.out.println(paths[0]);
        System.out.println(paths[1]);
        String classname=paths[0];
        String methodname=paths[1];
        classname=StringUtils.lowerCase(classname);
        classname=StringUtils.capitalize(classname);
        classname=classname+"Controller";
        System.out.println(classname);
        methodname=StringUtils.lowerCase(methodname);
        methodname=StringUtils.remove(methodname,".wst");
        System.out.println(methodname);
        String packagename="com.westos.todo.controllers";
        System.out.println(packagename+"."+classname);

        //动态执行controller中的方法
        //1.创建一个对象

        try {
            Class<?> cls = Class.forName(packagename + "." + classname);

            Object obj = cls.newInstance();

            Method method = obj.getClass().getMethod(methodname, HttpServletRequest.class, HttpServletResponse.class);
            //执行函数
            Object result = method.invoke(obj, req, resp);
            if(result instanceof String){
                resp.setContentType("text/html;charset=utf-8");
                req.getRequestDispatcher((String)result).forward(req,resp);
            }else if(result instanceof JSONObject || result instanceof JSONArray){
                resp.setContentType("application/json;charset=utf-8");
                resp.getWriter().print(JSON.toJSONString(result));
            }else if(result!=null){
                resp.setContentType("application/json;charset=utf-8");
                JSONObject tmpjson=new JSONObject();
                tmpjson.put("data",result);
                resp.getWriter().print(JSON.toJSONString(tmpjson.get("data")));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
