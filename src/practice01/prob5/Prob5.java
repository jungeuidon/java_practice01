package practice01.prob5;

public class Prob5 {
	public static void main (String args[]) {
		
		for (int i = 1; i < 100; i++) {
			int gu = i % 10;
			if(gu ==3 || gu==6 || gu==9) {
				System.out.println(i + "짝");
			}
			
		}
	}
}
