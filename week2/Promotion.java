package week2;

public class Promotion {
	public static void main(String[] args) {
		//자동 타입 변환
		//큰 데이터 타입 변수 = 작은 데이터 타입 변수를 대입 [작은 데이터 변수 타입을 큰 데이터 변수 타입에 적용은 가능!]
		byte bValue = 25;
		int iValue = bValue;
		System.out.println(iValue);
		
		char cValue = '가';
		iValue = cValue;
		System.out.println(iValue);
		
		long lValue = iValue;
		System.out.println(lValue);
		
		double dValue = iValue;
		System.out.println(dValue);
	}

}
