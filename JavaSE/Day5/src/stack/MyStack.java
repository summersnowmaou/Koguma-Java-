package stack;
/*
 * 自定义的栈
 * */
public class MyStack {
   int top;   // 栈顶位置
   char[] array;   // 栈的容器
   int maxSize;    // 栈的最大容量
   
   public MyStack(){
	   
   }
   
   public MyStack(int max){
	   maxSize=max;  
	   array=new char[maxSize];
	   top=-1;
   }
   
   // 入栈
   public void push(char c){
	   if(isFull()){
		   System.out.println("已经满栈，不能再存入新数据！");
	   }else{
		   array[++top]=c;   // 将数据存入数组中
	   }
   }
   
   // 出栈
   public char pop(){
	   if(isEmpty()){
		   System.out.println("已经为空栈，无法弹出~~~");
		   return (char)-1;
	   }else{
		   return array[top--];   // 弹出栈顶数据
	   }
   }
   
   // 判断是否为满栈
   public boolean isFull(){
	   return top==maxSize-1;
   }
   
   // 判断是否为空栈
   public boolean isEmpty(){
	   return top==-1;
   }
   
   
}
