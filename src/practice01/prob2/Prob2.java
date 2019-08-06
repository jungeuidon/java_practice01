package practice01.prob2;

public class Prob2 {
	
	public static void main (String args[]) {
		int cnt;
//		for (int i = 1; i <= 10; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		for (int i = 2; i <= 11; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		for (int i = 3; i <= 12; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		for (int i = 4; i <= 13; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		for (int i = 5; i <= 14; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		for (int i = 6; i <= 15; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		for (int i = 7; i <= 16; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		for (int i = 8; i <= 17; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		for (int i = 9; i <= 18; i++) {
//			System.out.print(i + " ");
//		}
		
		System.out.println("\n=================");
		for (int i = 1; i <= 9; i++) {
			
			for (int j = 0; j <= 9; j++) {
				System.out.print(i + j + " ");
				if(j==9) {
					System.out.println();
				}
			}
		}
	}
}
