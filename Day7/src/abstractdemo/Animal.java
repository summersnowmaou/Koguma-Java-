package abstractdemo;

public abstract  class Animal {
   private String name;
   private String food;
   
   public Animal(){
   }
   
   public Animal(String name, String food) {
	  this.name = name;
	  this.food = food;
   }

   public abstract void eat();   // ���󷽷�ֻ��������ʵ��
}
