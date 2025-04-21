package StringPrograms;

import java.util.HashMap;

public class Stringcount {
	public static void main(String[] args) {
		String a = "java is a world java is great";
		String[] b = a.split("\\s");
		HashMap<String, Integer> occurance = new HashMap<>();
		for(String i: b){
			occurance.put(i, occurance.getOrDefault(i, 0)+1);
		}
		for(String i : occurance.keySet()) {
			int count = occurance.get(i);
			if(count>1) {
				System.out.println(i + " occurance of " +  count);
			}
		}

	}

}
