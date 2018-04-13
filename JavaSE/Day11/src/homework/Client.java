package homework;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		boolean flag=true;
		while(flag){
			Scanner scan = new Scanner(System.in);
			System.out.println("请选择： 1 登录   2  注册  3 退出");
			int choice=scan.nextInt();
			switch (choice) {
				case 1:
					System.out.print("请输入用户名：");
					String username=scan.next();
					System.out.println("请输入密码：");
					String pwd=scan.next();
					UserInfo userInfo=UserOperator.login(username, pwd);
					if(userInfo!=null){
						System.out.println("恭喜，"+userInfo.getUsername()+"登录成功！");
						System.out.println("您的格言是："+userInfo.getMotto());
					}else{
						System.out.println("用户名或密码错误，登录失败！");
					}
					break;
					
				case 2:
					System.out.print("请输入注册名：");
					String regName=scan.next();
					System.out.println("请输入注册密码：");
					String regPwd=scan.next();
					System.out.println("请输入格言：");
					String motto=scan.next();
					UserInfo info=new UserInfo(regName,regPwd,motto);
					boolean isRegester=UserOperator.register(info);
					if(isRegester){
						System.out.println("注册成功！");
					}
	                break;
	                
				default:
					flag=false;
					break;
			}
		}
	

	}

}
