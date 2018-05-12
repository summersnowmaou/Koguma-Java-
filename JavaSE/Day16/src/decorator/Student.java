package decorator;
/*
 * 具体构建角色
 * */
public class Student implements Love{

	@Override
	public void love() {
       System.out.println("学生正在谈恋爱...");		
	}

}
