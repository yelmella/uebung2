package h2;

public class H2_main {
	public static void main(String[] args){
		int i = 20;
		int j = 24;
		int k = 14;
		int min = 7;
		int max = 12;
		if(i<j && i<k) {
			min = i;
		}
		if(j<k && j<i) {
			min = j;
		}
		if(k<i && k<j) {
			min = k;
		}
		
		if(i>j && i>k) {
				max = i;
		}
		if(j>k && j>i) {
				max = j;
		}
		if(k>i && k>j) {
				max = k;
		}
		System.out.println("min: " + min);
		System.out.println("max: " + max);
	}
}
