package week4;

import java.util.Scanner;

public class BodyBMI {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요:");
		String name = sc.next();		//String > sc.next(), int > sc.nextint()
		
		System.out.print("키(cm)를 입력하세요:");
		int height = sc.nextInt();
		
		System.out.print("몸무게(kg)를 입력하세요:");
		int weight = sc.nextInt();
		
		//bmi 계산
		double mHeight = height / 100.0;
		double bmi = weight / (mHeight * mHeight);
		
		//비만 분류(type)
		String type = "";
		
		if(bmi >= 18.5 && bmi < 23)
			type = "정상";
		else if(bmi >= 23 && bmi < 25)
			type = "과체중";
		else if(bmi >= 25 && bmi < 30)
			type = "비만";
		else if(bmi >= 30) 
			type = "고도비만";
		
		sc.close();	//Scanner 닫아주기
		
		System.out.println(name + "님의 키는" + height + "cm이고 몸무게는" + weight + "kg입니다.");
		System.out.printf("bmi 지수는 %.2f이고 %s입니다.", bmi, type);
	}
}
