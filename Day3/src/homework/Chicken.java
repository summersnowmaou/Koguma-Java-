package homework;

public class Chicken {

	public static void main(String[] args) {
		/**����һ��
		for (int cock = 0; cock <=20; cock++) {   // �������ܵ�����
			for (int hen = 0; hen <=33; hen++) {   // ĸ��������
				for (int chicken = 0; chicken <=300; chicken++) {   // С��������
					if(chicken%3==0 && cock+hen+chicken==100 && 5*cock+3*hen+chicken/3*1==100){
						System.out.println("����"+cock+"ֻ;ĸ��"+hen+"ֻ;С��"+chicken+"ֻ");
					}
				}
			}
		}
		**/
		
		/**��������
		for (int cock = 0; cock <=20; cock++) {   // �������ܵ�����
			for (int hen = 0; hen <=33; hen++) {   // ĸ��������
				int chicken=100-cock-hen;   // С���ĸ���
				if(chicken%3==0 && 5*cock+3*hen+chicken/3*1==100){
					System.out.println("����"+cock+"ֻ;ĸ��"+hen+"ֻ;С��"+chicken+"ֻ");
				}
			}
		}
		**/
		
		// ��������
		for (int cock = 0; cock <=20; cock++) {   // �������ܵ�����
			for (int hen = 0; hen <=33-cock; hen++) {   // ĸ��������
				int chicken=100-cock-hen;   // С���ĸ���
				if(chicken%3==0 && 5*cock+3*hen+chicken/3*1==100){
					System.out.println("����"+cock+"ֻ;ĸ��"+hen+"ֻ;С��"+chicken+"ֻ");
				}
			}
		}
	}

}
