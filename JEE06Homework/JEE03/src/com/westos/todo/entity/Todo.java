package com.westos.todo.entity;

import java.util.Date;

public class Todo {
    private Integer id;
    private String title;
    private Integer todoclassid;
    private Integer state;
    private Date create_dt;
    private Date modify_dt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTodoclassid() {
        return todoclassid;
    }

    public void setTodoclassid(Integer todoclassid) {
        this.todoclassid = todoclassid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreate_dt() {
        return create_dt;
    }

    public void setCreate_dt(Date create_dt) {
        this.create_dt = create_dt;
    }

    public Date getModify_dt() {
        return modify_dt;
    }

    public void setModify_dt(Date modify_dt) {
        this.modify_dt = modify_dt;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", todoclassid=" + todoclassid +
                ", state=" + state +
                ", create_dt=" + create_dt +
                ", modify_dt=" + modify_dt +
                '}';
    }
}
