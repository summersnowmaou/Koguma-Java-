package homework;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		boolean flag=true;
		while(flag){
			Scanner scan = new Scanner(System.in);
			System.out.println("��ѡ�� 1 ��¼   2  ע��  3 �˳�");
			int choice=scan.nextInt();
			switch (choice) {
				case 1:
					System.out.print("�������û�����");
					String username=scan.next();
					System.out.println("���������룺");
					String pwd=scan.next();
					UserInfo userInfo=UserOperator.login(username, pwd);
					if(userInfo!=null){
						System.out.println("��ϲ��"+userInfo.getUsername()+"��¼�ɹ���");
						System.out.println("���ĸ����ǣ�"+userInfo.getMotto());
					}else{
						System.out.println("�û�����������󣬵�¼ʧ�ܣ�");
					}
					break;
					
				case 2:
					System.out.print("������ע������");
					String regName=scan.next();
					System.out.println("������ע�����룺");
					String regPwd=scan.next();
					System.out.println("��������ԣ�");
					String motto=scan.next();
					UserInfo info=new UserInfo(regName,regPwd,motto);
					boolean isRegester=UserOperator.register(info);
					if(isRegester){
						System.out.println("ע��ɹ���");
					}
	                break;
	                
				default:
					flag=false;
					break;
			}
		}
	

	}

}
