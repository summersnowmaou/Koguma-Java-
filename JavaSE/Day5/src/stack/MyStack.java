package stack;
/*
 * �Զ����ջ
 * */
public class MyStack {
   int top;   // ջ��λ��
   char[] array;   // ջ������
   int maxSize;    // ջ���������
   
   public MyStack(){
	   
   }
   
   public MyStack(int max){
	   maxSize=max;  
	   array=new char[maxSize];
	   top=-1;
   }
   
   // ��ջ
   public void push(char c){
	   if(isFull()){
		   System.out.println("�Ѿ���ջ�������ٴ��������ݣ�");
	   }else{
		   array[++top]=c;   // �����ݴ���������
	   }
   }
   
   // ��ջ
   public char pop(){
	   if(isEmpty()){
		   System.out.println("�Ѿ�Ϊ��ջ���޷�����~~~");
		   return (char)-1;
	   }else{
		   return array[top--];   // ����ջ������
	   }
   }
   
   // �ж��Ƿ�Ϊ��ջ
   public boolean isFull(){
	   return top==maxSize-1;
   }
   
   // �ж��Ƿ�Ϊ��ջ
   public boolean isEmpty(){
	   return top==-1;
   }
   
   
}
