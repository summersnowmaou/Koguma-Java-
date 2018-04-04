package oop;

public class Student {
    String name;  // 姓名属性(成员变量)
    int age;  // 年龄属性
    double score;  // 成绩属性
    
    public void study(){
    	System.out.println("姓名为"+name+"，年龄为"+age+"的学生,正在学习...");
    }
    
    public void exam(){
    	System.out.println(name+"正在考试...");
    }
}
