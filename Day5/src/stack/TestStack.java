package stack;


public class TestStack {

	public static void main(String[] args) {
		String str="�л����񹲺͹�";
		MyStack stack=new MyStack(100);
		for (int i = 0; i < str.length(); i++) {   // �����ַ����е��ַ�
			stack.push(str.charAt(i));      // ���ַ��������ջ��
		}
		System.out.println("��ת����ַ���Ϊ��");
		while(!stack.isEmpty()){
			System.out.print(stack.pop());
		}

	}

}
