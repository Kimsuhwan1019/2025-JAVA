package week4;

import java.util.Scanner;

public class DiscountCal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 구매 가격 입력: ");
		int price = sc.nextInt();
		
		int rate = 0;		// 5만원 미만인 경우 할인율이 0이기 때문에, 0으로 초기화
		int finalAmt;
		
		//할인 조건 적용
		if(price >= 100000) 
			rate = 10;
		else if(price >= 50000) 
			rate = 5;
		
		//할인 금액 계산
		int discountAmt = price * rate / 100;
		finalAmt = price - discountAmt;
		
		//결과 출력				
		System.out.println("원래 가격: " + price);
		System.out.println("할인율: " + rate + "%");
		System.out.println("최종 가격: "+ finalAmt + "원");
		
		sc.close();	//Scanner 닫아주기
	}
}