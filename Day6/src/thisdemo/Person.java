package thisdemo;

public class Person {
    String name;
    int age;
    String sex;
    public Person(){
    	System.out.println("�޲ι���...");
    }
    
    public Person(String name,int age){
    	this();
    	System.out.println("���������εĹ��췽��");
    	this.name=name;
    	this.age=age;
    }
    
    public Person(String name,int age,String sex){
    	this(name,age);
    	System.out.println("���������εĹ��췽��");
    	this.sex=sex;
    }
    
    public void say(){
    	System.out.println("�ҽ�"+this.name+"������"+this.age+"����,�Ա�"+this.sex);
    }
}
