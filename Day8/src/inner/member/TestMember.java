package inner.member;

public class TestMember {

	public static void main(String[] args) {
		Outer out=new Outer();
		out.getMemberInstance().method();   // 通过在外部类中的成员方法中获取内部类对象
        
		// 外部类.内部类  内部类对象=外部类实例.new 内部类();
		Outer.MemberInner in=out.new MemberInner();
		in.method();
	}

}
