package register_login;

import java.util.*;

public class TestRegister {

	public static void main(String[] args) {
		
		HashSet<Register> set=new HashSet<Register>(); 
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			Register per = new Register();
			System.out.println("�������û�����");
			per.setName(scan.next());
			System.out.println("���������룺");
			per.setPassword(scan.next());
			System.out.println("��������˸��ԣ�");
			per.setMotto(scan.next());
			
			if(set.add(per)) {
				System.out.println("ע��ɹ���");
				System.out.println("����ע��������y����������˳�ע��");
				String str = scan.next();
				if(!str.equals("y"))break;
			}else {
				System.out.println("���û��Ѵ���");
				
			}
		}		
			Log(set);
		
		
		
	}

	private static void Log(HashSet<Register> set) {
		System.out.println("��ӭ��½");
		Scanner scan = new Scanner(System.in);
		Register per = new Register();
		System.out.println("�������û�����");
		per.setName(scan.next());
		System.out.println("���������룺");
		per.setPassword(scan.next());
//		System.out.println("��������˸��ԣ�");
//		per.setMotto(scan.next());
		scan.close();
		boolean log=true;
		for (Register e : set) {
				if (e.getName().equals(per.getName()) && e.getPassword().equals(per.getPassword())) {
					System.out.println(e.getName()+"��ӭ��!��ĸ����ǣ�"+e.getMotto());
					log=false;
					break;
				}
		} 
		if(log==true) {
			System.out.println("��¼ʧ��");
		}
	}

}
