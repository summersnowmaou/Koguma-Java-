package com.westos.app.controller;

import com.alibaba.fastjson.JSONObject;
import com.westos.app.service.UserService;
import com.westos.bean.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mvc.xml"})
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class MyControllerTest {

    @InjectMocks
    private MyController myController;

    @Mock
    private UserService userService;

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        this.mockMvc= MockMvcBuilders.standaloneSetup(myController).build();
    }

    @Test
    public void test1() throws Exception {
        String url="/my/test";

        MvcResult result = this.mockMvc.perform(get(url)).andExpect(status().isOk()).andDo(print()).andReturn();
        String str = result.getResponse().getContentAsString();
        assertEquals("你好",str);
    }

    @Test
    public void login() throws Exception {
        String url="/my/login";
        JSONObject json=new JSONObject();
        json.put("username","admin");
        json.put("password","123");
        User returnuser=new User();
        returnuser.setId(1);
        returnuser.setUsername("admin");
        returnuser.setPassword("123");
        User p1=new User();
        p1.setUsername("admin");
        p1.setPassword("123");
        System.out.println(json.toJSONString());
        when(userService.loginByUserNameAndPassword(eq(p1))).thenReturn(returnuser);
        MvcResult result = this.mockMvc.perform(post(url)

                .content(json.toJSONString())).andDo(print()).andReturn();
        String str = result.getResponse().getContentAsString();
        System.out.println(str);

    }

    @Test
    public void main() {
    }

    @Test
    public void logout() {
    }

    @Test
    public void getctx() {
    }
}