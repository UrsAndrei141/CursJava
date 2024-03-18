package curs5;

//palindrom ==> cuvant ce are acelasi sens indiferent din ce parte este citit (radar, abba, apa)

public class Palindrom {

	public static void main(String[] args) {
		
		String cuvant = "masina";//cuvant.length() == 5
		//               01234
		
		String cuvantIntors = "";
		/* cuvantIntors = "";
		 * cuvantIntors = cuvant.charAt(4) = 4
		 * cuvantIntors = cuvantIntors + cuvant.charAt(4)
		 * cuvantIntor (r) = r + cuvant.charAt(3) = a
		 * ra = ra + cuvant.charAt(3) --> d
		 */
		
		for(int i = cuvant.length()-1;i >= 0; i--) {
			
			cuvantIntors = cuvantIntors + cuvant.charAt(i);
			System.out.println(cuvantIntors);
			
		}
		
		System.out.println(cuvantIntors);
		
		if(cuvant.equals(cuvantIntors)) {
			System.out.println("Este palindrom");
		}else {
			System.out.println("Nu este palindrom");
		}

	}

}
