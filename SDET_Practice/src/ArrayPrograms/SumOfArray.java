package ArrayPrograms;

public class SumOfArray {
	public static void main(String args[]) {
		int[] a = {1,3,3};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum +=a[i];
		}System.out.println(sum);
	}

}
