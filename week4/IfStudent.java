package week4;

import java.util.Scanner;	//java 안에 있는 util 안의 Scanner을 가져다 쓰겠다!

public class IfStudent {
	public static void main(String[] args) {
		//외부로부터 데이터 입력 => Scanner 클래스 이용 / import 자동 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 연도 입력 >> ");
		int year = sc.nextInt();
		
		System.out.println(year);
		
		//나이 계산
		int age = 2025 - year;
		System.out.println("나이: " + age);
		
		//조건문을 이용해서 학생의 종류 출력
		if(age >= 20 && age <= 26)
			System.out.println("대학생");
		else if(age >= 17 && age < 20)
			System.out.println("고등학생");
		else if(age >= 14 && age < 17)
			System.out.println("중학생");
		else if(age >= 8 && age < 14)
			System.out.println("초등학생");
		else
			//age < 8 ||(or) age >= 27 경우에 실행
			System.out.println("학생이 아니다.");
		
		sc.close();	//Scanner 닫아주기
		}
	}
