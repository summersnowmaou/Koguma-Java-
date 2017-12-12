package day6;

public class Assassinate {
	String assassin;
	String president;
	
	public Assassinate(String assassin,String president) {
		this.assassin = assassin;
		this.president = president;
		int x=(int)(Math.random()*2);
	
		if(x==1) {
			System.out.println(president+"被"+assassin+"刺杀了！");
		}else {
			System.out.println("刺杀失败..."+assassin+"已经被控制");
		}
	}
	
	public static void main(String[] args) {
		new Assassinate("荆轲","秦始皇");
		
	}
}
