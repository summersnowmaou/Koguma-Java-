package register_login;

import java.util.*;

public class TestRegister {

	public static void main(String[] args) {
		
		HashSet<Register> set=new HashSet<Register>(); 
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			Register per = new Register();
			System.out.println("请输入用户名：");
			per.setName(scan.next());
			System.out.println("请输入密码：");
			per.setPassword(scan.next());
			System.out.println("请输入个人格言：");
			per.setMotto(scan.next());
			
			if(set.add(per)) {
				System.out.println("注册成功！");
				System.out.println("继续注册请输入y否则按任意键退出注册");
				String str = scan.next();
				if(!str.equals("y"))break;
			}else {
				System.out.println("该用户已存在");
				
			}
		}		
			Log(set);
		
		
		
	}

	private static void Log(HashSet<Register> set) {
		System.out.println("欢迎登陆");
		Scanner scan = new Scanner(System.in);
		Register per = new Register();
		System.out.println("请输入用户名：");
		per.setName(scan.next());
		System.out.println("请输入密码：");
		per.setPassword(scan.next());
//		System.out.println("请输入个人格言：");
//		per.setMotto(scan.next());
		scan.close();
		boolean log=true;
		for (Register e : set) {
				if (e.getName().equals(per.getName()) && e.getPassword().equals(per.getPassword())) {
					System.out.println(e.getName()+"欢迎你!你的格言是："+e.getMotto());
					log=false;
					break;
				}
		} 
		if(log==true) {
			System.out.println("登录失败");
		}
	}

}
