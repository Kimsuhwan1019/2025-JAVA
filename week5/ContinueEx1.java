package week5;

public class ContinueEx1 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			//짝수만 출력 ==> 홀수는 제외
			if(i%2 == 1)	//홀수 체크
				continue;
			
			System.out.println(i);
		}
		
	}

}
