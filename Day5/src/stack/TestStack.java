package stack;


public class TestStack {

	public static void main(String[] args) {
		String str="中华人民共和国";
		MyStack stack=new MyStack(100);
		for (int i = 0; i < str.length(); i++) {   // 遍历字符串中的字符
			stack.push(str.charAt(i));      // 将字符逐个存入栈中
		}
		System.out.println("反转后的字符串为：");
		while(!stack.isEmpty()){
			System.out.print(stack.pop());
		}

	}

}
