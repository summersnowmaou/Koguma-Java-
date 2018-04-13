package exception;

import java.io.IOException;

public class CheckException {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		
		try {
			r.exec("calc");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
