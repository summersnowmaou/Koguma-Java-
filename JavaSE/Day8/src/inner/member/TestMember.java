package inner.member;

public class TestMember {

	public static void main(String[] args) {
		Outer out=new Outer();
		out.getMemberInstance().method();   // ͨ�����ⲿ���еĳ�Ա�����л�ȡ�ڲ������
        
		// �ⲿ��.�ڲ���  �ڲ������=�ⲿ��ʵ��.new �ڲ���();
		Outer.MemberInner in=out.new MemberInner();
		in.method();
	}

}
