package inner.anonymity;

public class TestAnonumity {

	public static void main(String[] args) {
		Jumping j=new Jumping(){

			@Override
			public void jump() {
				System.out.println("ĳ����¥��...");
			}
			
		};
		j.jump();

	}

}
