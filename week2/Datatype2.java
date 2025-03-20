package week2;

public class Datatype2 {
	public static void main(String[] args) {
		//실수 데이터 타입
		float fValue = 3.14f;
		double dValue = 3.14; //실수 리터럴의 기본은 double [double은 d 생략 가능!] **
		System.out.println("fvalue = " + fValue);
		System.out.println("dvalue = " + dValue);
		
		//실수의 정밀도 테스트
		fValue = .01234567890123456789f;
		dValue = .01234567890123456789;
		System.out.println("fvalue = " + fValue);
		System.out.println("dvalue = " + dValue);
		
		// e 기호 사용하기 : 10의 제곱승 (ex. e7은 10의 7제곱)
		int		iData = 4500000;
		float	fData = 3e7f;
		double	dData1 = 3e7;
		double	dData2 = 3e-7;
		System.out.println("iData = " + iData);
		System.out.println("fData = " + fData);
		System.out.println("dData1 = " + dData1);
		System.out.println("dData2 = " + dData2);
		
		System.out.println();
		
		System.out.printf("iData = %d\n", iData);
		System.out.printf("fData = %f\n", fData);
		System.out.printf("dData1 = %f\n", dData1);
		System.out.printf("dData2 = %f\n", dData2);
		
		System.out.println();
		System.out.printf("fData = %.4f\n", fData);
		System.out.printf("dData1 = %.2f\n", dData1);
		System.out.printf("dData2 = %10.8f\n", dData2); //10.8: 전체자리 10자리중에 소수점 이하 8자리를 출력하겠다.
	}

}
