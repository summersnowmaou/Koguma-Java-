package single;

public class Test {

	public static void main(String[] args) {
		HungrySingleInstance single1=HungrySingleInstance.getSingleInstance();
		HungrySingleInstance single2=HungrySingleInstance.getSingleInstance();
		System.out.println("����ʽ������"+(single1==single2));
		
		LazySingleInstance lazy1=LazySingleInstance.getSingleInstance();
		LazySingleInstance lazy2=LazySingleInstance.getSingleInstance();
		System.out.println("����ʽ����"+(lazy1==lazy2));

	}

}
