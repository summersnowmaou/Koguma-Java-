package com.westos.todo.controllers;

import com.alibaba.fastjson.JSONObject;
import com.westos.todo.Main;
import com.westos.todo.page.TodoClassVO;
import com.westos.todo.page.TodoVO;
import com.westos.todo.services.TodoService;
import com.westos.todo.services.impl.TodoServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class TodoController {
    //  xxx/todo/listtodoclasses.wst
    public TodoVO listtodoclasses(HttpServletRequest req, HttpServletResponse response){
        TodoService todoService=new TodoServiceImpl();
        List<TodoClassVO> result = todoService.listTodoClasses(null);
        TodoVO todoVO=new TodoVO();
        todoVO.setTodoclasses(result);
        return todoVO;
    }

    // xxx/todo/addtodoclass.wst
    public JSONObject addtodoclass(HttpServletRequest req, HttpServletResponse response){
        return null;
    }

    // xxx/todo/addtodo.wst
    public JSONObject addtodo(HttpServletRequest req, HttpServletResponse response){
        return null;
    }

    // xxx/todo/updatetodo.wst
    public JSONObject updatetodo(HttpServletRequest req, HttpServletResponse response){
        return null;
    }
}
