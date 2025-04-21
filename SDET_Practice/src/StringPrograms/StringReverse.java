package StringPrograms;

public class StringReverse {
	public static void main(String[] args) {
		String a = "Selenium is used to automate the UI flow";
		String b ="";
		for(int i =0; i<a.length();i++) {
			b = a.charAt(i) +b;
		}
		System.out.println(b);
	}

}
