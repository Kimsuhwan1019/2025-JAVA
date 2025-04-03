package week5;

public class ContinueEx2 {
	public static void main(String[] args) {
		
		int sum1 = 0;
		for(int i=1; i<=100; i++) {
			
			if(i%3 == 0)
				continue;
			
			sum1 += i;
		}
		System.out.println("sum1 = " + sum1);
		
		int sum2 = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0)		//3의 배수만 더하기
			sum2 += i;
			
		}
		System.out.println("sum2 = " + sum2);
		System.out.println("sum1 + sum2 = " + (sum1 + sum2));
	}
}