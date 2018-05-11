package com.westos.todo.controllers;

import com.alibaba.fastjson.JSONObject;
import com.westos.todo.Main;
import com.westos.todo.entity.Todo;
import com.westos.todo.entity.TodoClass;
import com.westos.todo.page.TodoClassVO;
import com.westos.todo.page.TodoVO;
import com.westos.todo.services.TodoService;
import com.westos.todo.services.impl.TodoServiceImpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
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
    public boolean addtodoclass(HttpServletRequest req, HttpServletResponse response){
        TodoService todoservice = new TodoServiceImpl();
        String todoClassName=req.getParameter("todoClassName");
        TodoClass todoClass=new TodoClass();
        todoClass.setName(todoClassName);
        boolean result=todoservice.addTodoClass(todoClass);
        return result;
    }

    // xxx/todo/addtodo.wst
    public boolean addtodo(HttpServletRequest req, HttpServletResponse response){
        TodoService todoService=new TodoServiceImpl();
        String title=req.getParameter("title");
        int todoclassid=Integer.parseInt(req.getParameter("todoclassid"));
        Todo todo=new Todo();
        todo.setCreate_dt(new Date());
        todo.setState(0);
        todo.setTitle(title);
        todo.setTodoclassid(todoclassid);
        boolean result=todoService.addTodo(todo);
        return result;
    }

    // xxx/todo/updatetodo.wst
    public boolean updatetodo(HttpServletRequest req, HttpServletResponse response){
        TodoService todoService=new TodoServiceImpl();
        Integer id=Integer.parseInt(req.getParameter("id"));
        boolean result=todoService.updateTodo(id);
        return result;
    }
}
