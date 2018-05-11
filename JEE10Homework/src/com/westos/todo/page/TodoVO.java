package com.westos.todo.page;

import java.util.List;

public class TodoVO {
    private List<TodoClassVO> todoclasses;

    public List<TodoClassVO> getTodoclasses() {
        return todoclasses;
    }

    public void setTodoclasses(List<TodoClassVO> todoclasses) {
        this.todoclasses = todoclasses;
    }

    @Override
    public String toString() {
        return "TodoVO{" +
                "todoclasses=" + todoclasses +
                '}';
    }
}
