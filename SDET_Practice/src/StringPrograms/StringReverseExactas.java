package StringPrograms;

public class StringReverseExactas {
	public static void main(String args[]) {
		String wor = "tamil is the oldest lanugage";
		String[] a = wor.split("\\s");
		StringBuilder s = new StringBuilder();
		for(String i : a) {
			StringBuilder y = new StringBuilder(i);
			s.append(y.reverse().toString()).append(" ");
		}
		System.out.println(s.toString().trim());
	}

}
