package common;

public class Person {
	// �ڶ���JVM��gc����֮ǰ�����ȵ����������
    @Override
    protected void finalize() throws Throwable {
    	System.out.println("���󱻻���֮ǰ��������...");
    }
}
