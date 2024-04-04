package curs10;

public class AgeVerifierTest {

	public static void main(String[] args) {
	
		AgeVerifier obj = new AgeVerifier();
		
		try {
			obj.checkAgeLimit(18);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
