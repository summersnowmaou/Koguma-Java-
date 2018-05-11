package com.westos.todo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.westos.todo.contants.Contants;
import com.westos.todo.entity.Todo;
import com.westos.todo.entity.TodoClass;
import com.westos.todo.page.TodoClassVO;
import com.westos.todo.page.TodoVO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static TodoVO genvo(){
        TodoVO todoVO=new TodoVO();

        List<TodoClassVO> todoclasses=new ArrayList<>();
        TodoClassVO tv1=new TodoClassVO();
        TodoClassVO tv2=new TodoClassVO();
        TodoClass todoclass1=new TodoClass();
        todoclass1.setId(1);
        todoclass1.setName("学习1");
        TodoClass todoclass2=new TodoClass();
        todoclass2.setId(2);
        todoclass2.setName("生活1");
        tv1.setTodoclass(todoclass1);
        List<Todo> todos1=new ArrayList<>();
        Todo todo1=new Todo();
        todo1.setId(1);
        todo1.setTitle("学习JAVA");
        todo1.setState(Contants.TODO_NOOTFINISH);
        todo1.setCreate_dt(new Date());

        Todo todo2=new Todo();
        todo2.setId(2);
        todo2.setTitle("学习HTML");
        todo2.setState(Contants.TODO_FINISH);
        todo2.setCreate_dt(new Date());
        todos1.add(todo1);
        todos1.add(todo2);

        tv1.setTodos(todos1);

        List<Todo> todos2=new ArrayList<>();
        Todo todo3=new Todo();
        todo3.setId(3);
        todo3.setTitle("看电影");
        todo3.setState(Contants.TODO_NOOTFINISH);
        todo3.setCreate_dt(new Date());

        Todo todo4=new Todo();
        todo4.setId(4);
        todo4.setTitle("踢足球");
        todo4.setState(Contants.TODO_FINISH);
        todo4.setCreate_dt(new Date());

        todos2.add(todo3);
        todos2.add(todo4);
        tv2.setTodoclass(todoclass2);
        tv2.setTodos(todos2);

        todoclasses.add(tv1);
        todoclasses.add(tv2);

        todoVO.setTodoclasses(todoclasses);
        return todoVO;
    }
    public static void main(String [] args){
        System.out.println("hello");

        TodoVO todoVO=genvo();

        JSONObject result=new JSONObject();
        result.put("data",todoVO);
        System.out.println(todoVO);
        System.out.println(result.toJSONString());
        System.out.println(JSON.toJSONString(result, SerializerFeature.WriteSlashAsSpecial,SerializerFeature.PrettyFormat,SerializerFeature.WriteDateUseDateFormat));
    }
}
