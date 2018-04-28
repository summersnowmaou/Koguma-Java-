package com.westos.todo.entity;

public class TodoClass {
    private Integer id;
    private String name;
    private Integer parentid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    @Override
    public String toString() {
        return "TodoClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentid=" + parentid +
                '}';
    }
}
