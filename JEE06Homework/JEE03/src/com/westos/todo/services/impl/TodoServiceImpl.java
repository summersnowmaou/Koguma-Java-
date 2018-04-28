package com.westos.todo.services.impl;

import org.apache.ibatis.session.SqlSession;

import com.westos.todo.dao.TodoDAO;
import com.westos.todo.entity.Todo;
import com.westos.todo.entity.TodoClass;
import com.westos.todo.page.TodoClassVO;
import com.westos.todo.services.TodoService;
import com.westos.todo.utils.MybatisUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TodoServiceImpl implements TodoService {
    @Override
    public List<TodoClassVO> listTodoClasses(Integer parentid) {
        SqlSession sqlSession = MybatisUtil.getInstance().getSqlSessionFactory().openSession();
        TodoDAO dao=sqlSession.getMapper(TodoDAO.class);
        List<TodoClassVO> result = new ArrayList<>();
        try {
            List<TodoClass> root = dao.listTodoClassesByParentid(parentid);
            for (TodoClass tc:root) {
                TodoClassVO todoClassVO=new TodoClassVO();
                todoClassVO.setTodoclass(tc);
                todoClassVO.setTodos(dao.listTodosByClassid(tc.getId()));
                todoClassVO.setTodoclassvolist(listTodoClasses(tc.getId()));
                result.add(todoClassVO);
            }
            return result;
        } finally {
            sqlSession.close();
        }

    }

    @Override
    public TodoClass saveTodoClass(TodoClass todoclass) {
        return null;
    }

    @Override
    public TodoClass saveTodoClass(String todoClassName) {
        TodoClass tc = new TodoClass();
        tc.setName(todoClassName);
        return saveTodoClass(tc);
    }

    @Override
    public Todo saveTodo(Todo todo) {
        todo.setCreate_dt(new Date());
        return null;
    }

    @Override
    public Todo saveTodo(String title, Integer todoClassid) {
        return null;
    }

    @Override
    public Boolean addTodoClass(TodoClass todoclass) {
        SqlSession sqlSession = MybatisUtil.getInstance().getSqlSessionFactory().openSession();
        TodoDAO dao = sqlSession.getMapper(TodoDAO.class);
        int result = 0;
        try {
            result= dao.addTodoClass(todoclass);
            sqlSession.commit();
            return result>0;
        }finally {
            sqlSession.close();
        }
    }

    @Override
    public Boolean addTodo(Todo todo) {
        SqlSession sqlSession = MybatisUtil.getInstance().getSqlSessionFactory().openSession();
        TodoDAO dao = sqlSession.getMapper(TodoDAO.class);
        int result = 0;
        try {
            result= dao.addTodo(todo);
            sqlSession.commit();
            return result>0;
        }finally {
            sqlSession.close();
        }
    }

    @Override
    public Boolean updateTodo(Integer todoid) {
        SqlSession sqlSession = MybatisUtil.getInstance().getSqlSessionFactory().openSession();
        TodoDAO dao = sqlSession.getMapper(TodoDAO.class);
        int result = 0;
        try {
            result= dao.updateTodoState(todoid);
            sqlSession.commit();
            return result>0;
        }finally {
            sqlSession.close();
        }
    }
}
