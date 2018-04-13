package homework;

import java.util.*;

public class UserOperator {

	private static List<UserInfo> list;   // �����洢ע���û���Ϣ�ļ���
	static{
		list=new ArrayList<UserInfo>();
	}
	
	// ע�᷽��
	public static boolean register(UserInfo info){
		return list.add(info);
	}
	
	// ��¼����
	public static UserInfo login(String username,String password){
		if(username!=null && password!=null){
			for(UserInfo info:list){
				if(username.equals(info.getUsername()) && password.equals(info.getPassword())){
					return info;
				}
			}
		}
		return null;		
	}
}
