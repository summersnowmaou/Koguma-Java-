package right2;

import right.Person;

public class Student extends Person{
   public void say(){
	   // 在子类中可以跨包访问父类的protected属性
	   System.out.println("性别是："+this.sex);   
   }
}
