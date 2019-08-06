package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		int sum =0;
		
		if(num%2==0) { //짝수
			for (int i = 0; i <= num; i++) {
				if(i%2==0) {
					sum += i ;
				}
			}
			System.out.print("결과값 : " + sum);
		}else { //홀수
			for (int i = 0; i <= num; i++) {
				if(i%2!=0) {
					sum += i ;
				}
			}
			System.out.println("결과값 : " + sum);
		}
	}
}
