package practice01.prob5;

public class Prob5 {
	public static void main (String args[]) {
		
		for (int i = 1; i < 100; i++) {
			int count =0;
			int mok = i/10;
			int na = i%10;
			if (mok == 3 || mok == 6 || mok==9) {
				count++;
				if(na== 3 || na == 6 || na == 9) {
					count++;
				}
				if(count==1) {
					System.out.println(i + "짝");
				}else if(count==2) {
					System.out.println(i + "짝짝");
				}
				count=0;
			}else if(na ==3 || na ==6 || na ==9) {
				System.out.println(i + "짝");
			}else {
				System.out.println(i);
			}
		}
	}
		
}

