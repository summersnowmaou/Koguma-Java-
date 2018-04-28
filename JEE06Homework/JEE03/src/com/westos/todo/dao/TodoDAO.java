package com.westos.todo.dao;

import com.westos.todo.entity.Todo;
import com.westos.todo.entity.TodoClass;

import java.util.List;

public interface TodoDAO {
    List<Todo> listTodosByClassid(Integer todoclassid);
    List<TodoClass> listTodoClassesByParentid(Integer parentid);


    //插入操作
    Integer saveTodoClass(TodoClass todoClass);
    Integer saveTodo(Todo todo);

    //更新操作
    Integer updateTodoState(Integer id);

    //删除操作(没有必要使用，只需要更新State不显示就可以，删除反而会增加工作量)
    //Integer deleteTodo(Integer id);
}
