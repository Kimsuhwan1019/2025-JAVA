package week05homework;

import java.util.Scanner;

public class Updowngame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int guess;
		int random = (int)(Math.random() * 100 + 1);
		
		while(true) {
			//숫자 1~100 필요
			System.out.print("숫자를 맞춰 보세요(1~100) >> ");
			guess = sc.nextInt();
			
			if(guess > 100 || guess < 0) {
				System.out.println("1~100 사이의 값을 입력하세요.");
				continue;
			}
			
			if(guess > random) {
				System.out.println("숫자가 너무 큽니다.");
			}
			else if(guess < random) {
				System.out.println("숫자가 너무 작습니다.");
			}
			else {
				System.out.println("정답입니다. 랜덤 숫자는 " + random + " 입니다.");
				break;
			}
		}
		sc.close();
	}
}