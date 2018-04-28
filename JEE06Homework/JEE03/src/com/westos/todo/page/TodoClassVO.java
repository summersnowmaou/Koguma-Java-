package com.westos.todo.page;

import com.westos.todo.entity.Todo;
import com.westos.todo.entity.TodoClass;
import java.util.List;

public class TodoClassVO {
    private List<Todo> todos;
    private TodoClass todoclass;
    private List<TodoClassVO> todoclassvolist;

    public List<Todo> getTodos() {
        return todos;
    }

    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }

    public TodoClass getTodoclass() {
        return todoclass;
    }

    public void setTodoclass(TodoClass todoclass) {
        this.todoclass = todoclass;
    }

    public List<TodoClassVO> getTodoclassvolist() {
        return todoclassvolist;
    }

    public void setTodoclassvolist(List<TodoClassVO> todoclassvolist) {
        this.todoclassvolist = todoclassvolist;
    }

    @Override
    public String toString() {
        return "TodoClassVO{" +
                "todos=" + todos +
                ", todoclass=" + todoclass +
                ", todoclassvolist=" + todoclassvolist +
                '}';
    }
}
