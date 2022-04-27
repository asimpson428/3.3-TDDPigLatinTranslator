
public class TDDPigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static boolean vowel(char first) {
		return (first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U'); 
	
	}
	
	
	public static String translate(String normal) {
		int stringlength = normal.length();
		int index = -1;
		for (int i = 0; i < stringlength; i++) {
			if (vowel(normal.charAt(i))) {
				index = i;
				break;
			}
			return normal.substring(index).toLowerCase() + normal.substring(0, index).toLowerCase() + "ay";
	}

}
}