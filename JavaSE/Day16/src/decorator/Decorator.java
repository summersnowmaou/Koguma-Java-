package decorator;
/*
 * ����װ�ν�ɫ
 * */
public abstract class Decorator implements Love{
   private Love love;   // ���г��󹹽���ɫ������
   
   public Decorator(Love love){
	   this.love=love;
   }
   
   @Override
   public void love() {
	  this.love.love();		
   }
   
}
