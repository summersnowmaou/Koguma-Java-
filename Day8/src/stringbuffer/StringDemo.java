package stringbuffer;

public class StringDemo {

	public static void main(String[] args) {
		String str="hello";
		// ����������ġ������������Ҳ��ϡ��Ͽ�-���ӡ���������
		long start=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
        	str+=i;   // str=str+i
        }
        long end=System.currentTimeMillis();
        System.out.println("ʹ��String��ʱ��"+(end-start));
        System.out.println(str.length());
	}

}
