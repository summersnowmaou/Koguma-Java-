package com.westos.app.controller;

import com.alibaba.fastjson.JSONObject;
import com.westos.app.anno.LoginRequired;
import com.westos.app.constants.Constants;
import com.westos.app.dto.ApiResult;
import com.westos.app.service.UserService;
import com.westos.bean.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RequestMapping("/my")
@Controller
public class MyController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test",produces = {MediaType.APPLICATION_JSON_VALUE+";charset=utf-8"})
    @ResponseBody
    public String test(){
        return "你好";

    }

    @RequestMapping(value = "/login",produces = {MediaType.APPLICATION_JSON_VALUE+";charset=utf-8"})
    @ResponseBody
    public ApiResult<String> login(@RequestBody User user, HttpSession session){
        ApiResult apiResult=new ApiResult();

        User result = userService.loginByUserNameAndPassword(user);
        if(result==null){
            apiResult.setStatus(Constants.STATUS_ERROR);
            apiResult.setMsg("用户名或密码错误");
        }else{
            apiResult.setStatus(Constants.STATUS_SUCCESS);
            //保存用户信息到session
            session.setAttribute(Constants.SESSION_LOGINEDUSER,result);
        }
        return apiResult;
    }

    @RequestMapping(value = "/main",produces = {MediaType.APPLICATION_JSON_VALUE+";charset=utf-8"})
    @ResponseBody
    @LoginRequired
    public ApiResult<User> main(HttpSession session){
        ApiResult<User> apiResult=new ApiResult();
        apiResult.setStatus(Constants.STATUS_SUCCESS);
        apiResult.setData((User)session.getAttribute(Constants.SESSION_LOGINEDUSER));
        return apiResult;
    }

    @RequestMapping(value = "/loginout")
    @ResponseBody
    public ApiResult<String> logout(HttpServletRequest request,HttpServletResponse response, HttpSession session) throws IOException {
        session.removeAttribute(Constants.SESSION_LOGINEDUSER);
        response.sendRedirect(request.getContextPath()+"/login.html");
        return null;
    }

    @RequestMapping(value = "/ctx")
    @ResponseBody
    @LoginRequired
    public String getctx(HttpServletRequest request){
        return "var _APPROOT='"+request.getContextPath()+"';";
    }
}
