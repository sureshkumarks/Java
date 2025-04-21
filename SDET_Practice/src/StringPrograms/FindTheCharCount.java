package StringPrograms;

import java.util.HashMap;

public class FindTheCharCount {
	public static void main(String args[]) {
		String a = "test java test count";
		char[] chars = a.toCharArray();
		HashMap<Character, Integer> occ = new HashMap<>();

		for(char i : chars) {
			if(i != ' ') {
				occ.put(i, occ.getOrDefault(i, 0)+1);
			}
		
		}
		for(Character i : occ.keySet()) {
			int count = occ.get(i);
			if(count>1) {
				System.out.println(i + " occurance is " + count);
			}
		}
	
		
			
	
	}

}
