package week5;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);		//Scanner 객체 생성
		String inStr;
		
		do {
			System.out.print(">> ");
			inStr = sc.nextLine();					//키보드로 입력한 문자열을 얻음
			System.out.println(inStr);
		}
		//!inStr.equals("q"): 입력된 값이 q가 아니면,
		//조건식은 반복이 가능한 true 조건을 지정
		while(!inStr.equals("q"));	
			
		System.out.println("프로그램 종료");
		sc.close();
	}
}