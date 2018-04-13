package homework;

import java.util.*;

public class UserOperator {

	private static List<UserInfo> list;   // 用来存储注册用户信息的集合
	static{
		list=new ArrayList<UserInfo>();
	}
	
	// 注册方法
	public static boolean register(UserInfo info){
		return list.add(info);
	}
	
	// 登录方法
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
