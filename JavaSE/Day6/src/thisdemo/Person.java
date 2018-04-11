package thisdemo;

public class Person {
    String name;
    int age;
    String sex;
    public Person(){
    	System.out.println("无参构造...");
    }
    
    public Person(String name,int age){
    	this();
    	System.out.println("调用了两参的构造方法");
    	this.name=name;
    	this.age=age;
    }
    
    public Person(String name,int age,String sex){
    	this(name,age);
    	System.out.println("调用了三参的构造方法");
    	this.sex=sex;
    }
    
    public void say(){
    	System.out.println("我叫"+this.name+"；今年"+this.age+"岁了,性别："+this.sex);
    }
}
