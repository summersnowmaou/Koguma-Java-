package homework;

public class Chicken {

	public static void main(String[] args) {
		/**方法一：
		for (int cock = 0; cock <=20; cock++) {   // 公鸡可能的数量
			for (int hen = 0; hen <=33; hen++) {   // 母鸡的数量
				for (int chicken = 0; chicken <=300; chicken++) {   // 小鸡的数量
					if(chicken%3==0 && cock+hen+chicken==100 && 5*cock+3*hen+chicken/3*1==100){
						System.out.println("公鸡"+cock+"只;母鸡"+hen+"只;小鸡"+chicken+"只");
					}
				}
			}
		}
		**/
		
		/**方法二：
		for (int cock = 0; cock <=20; cock++) {   // 公鸡可能的数量
			for (int hen = 0; hen <=33; hen++) {   // 母鸡的数量
				int chicken=100-cock-hen;   // 小鸡的个数
				if(chicken%3==0 && 5*cock+3*hen+chicken/3*1==100){
					System.out.println("公鸡"+cock+"只;母鸡"+hen+"只;小鸡"+chicken+"只");
				}
			}
		}
		**/
		
		// 方法三：
		for (int cock = 0; cock <=20; cock++) {   // 公鸡可能的数量
			for (int hen = 0; hen <=33-cock; hen++) {   // 母鸡的数量
				int chicken=100-cock-hen;   // 小鸡的个数
				if(chicken%3==0 && 5*cock+3*hen+chicken/3*1==100){
					System.out.println("公鸡"+cock+"只;母鸡"+hen+"只;小鸡"+chicken+"只");
				}
			}
		}
	}

}
