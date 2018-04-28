package com.westos.todo.services;

import com.westos.todo.page.TodoClassVO;
import com.westos.todo.entity.Todo;
import com.westos.todo.entity.TodoClass;

import java.util.List;

public interface TodoService {
    List<TodoClassVO> listTodoClasses(Integer parentid);  //获取所有的Todo分类

    /**
     * 保存Todo分类
     * @param todoclass
     * @return
     */
    TodoClass saveTodoClass(TodoClass todoclass);
    TodoClass saveTodoClass(String todoClassName);
    Todo saveTodo(Todo todo);
    Todo saveTodo(String title,Integer todoClassid);

    Boolean updateTodo(Todo todo);
    Boolean updateTodo(Integer todoid);

}
