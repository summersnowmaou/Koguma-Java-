package inner.anonymity;

public class TestAnonumity {

	public static void main(String[] args) {
		Jumping j=new Jumping(){

			@Override
			public void jump() {
				System.out.println("Ä³ÈËÌøÂ¥ÁË...");
			}
			
		};
		j.jump();

	}

}
