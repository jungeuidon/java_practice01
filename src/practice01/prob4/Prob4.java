package practice01.prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String word = scan.nextLine(); //next 하면 스페이스바 XX => 안먹는다
		
		
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j<=i ; j++) {
			System.out.print(word.charAt(j));
			}
			System.out.println();
		}
	}
}
