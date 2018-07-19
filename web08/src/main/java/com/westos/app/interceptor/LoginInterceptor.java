package com.westos.app.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.westos.app.anno.LoginRequired;
import com.westos.app.constants.Constants;
import com.westos.app.dto.ApiResult;
import com.westos.bean.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.MediaType;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("objname:"+o.getClass().getName());
        LoginRequired anno = ((HandlerMethod) o).getMethodAnnotation(LoginRequired.class);
        System.out.println("LoginRequired:"+anno);
        String url=httpServletRequest.getServletPath();
        if(anno==null){
            return true;
        }else{
            User user = (User)httpServletRequest.getSession().getAttribute(Constants.SESSION_LOGINEDUSER);
            if(user==null){
                ApiResult<String> apiResult=new ApiResult<>();
                apiResult.setStatus(Constants.STATUS_NOTLOGINED);
                apiResult.setMsg("未登录前不允许执行该操作");
                JSONObject json=new JSONObject();
                json.put("data",apiResult);
                httpServletResponse.setContentType(MediaType.APPLICATION_JSON_VALUE+";charset=utf-8");
                httpServletResponse.getWriter().println(json.getJSONObject("data").toJSONString());
                return false;
            }else{
                return true;
            }
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
