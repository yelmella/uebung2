package h2;

public class H2_main {
	public static void main(String[] args){
		int i = 15;
		int j = 9;
		int k = 14;
		int min = 7;
		int max = 12;
		if(i<j) {
			if(i<k) {
				min = i;
			}
		}
		if(j<k) {
			if(j<i) {
				min = j;
			}
		}
		if(k<i) {
			if(k<j) {
				min = k;
			}
		}


		if(i>j) {
			if(i>k) {
				max = i;
			}
		}
		if(j>k) {
			if(j>i) {
				max = j;
			}
		}
		if(k>i) {
			if(k>j) {
				max = k;
			}
		}
		System.out.println("min: " + min);
		System.out.println("max: " + max);
	}
}
