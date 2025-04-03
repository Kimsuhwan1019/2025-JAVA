package week5;

public class WhileEx1 {
	public static void main(String[] args) {
		//1~100까지의 합 구하기
		//누적 값을 저장하기 위해서는 변수 초기화 필수!!
		int num = 1;
		int sum = 0;
		
		while(num <= 100) {
			sum += num;
			//num = num + 1;
			num++;
		}
		System.out.println(sum);
	}

}
