package day6;

public class Assassinate {
	String assassin;
	String president;
	
	public Assassinate(String assassin,String president) {
		this.assassin = assassin;
		this.president = president;
		int x=(int)(Math.random()*2);
	
		if(x==1) {
			System.out.println(president+"��"+assassin+"��ɱ�ˣ�");
		}else {
			System.out.println("��ɱʧ��..."+assassin+"�Ѿ�������");
		}
	}
	
	public static void main(String[] args) {
		new Assassinate("����","��ʼ��");
		
	}
}
