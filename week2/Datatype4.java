package week2;

public class Datatype4 {
	public static void main(String[] args) {
		
		//byte = 1byte(-128~127 표현가능)
		byte	bData = 127;
		
		//char :음수가 없다.
		char	cData = 90;
		
		//float : 끝에 f를 써줘야함.
		float	fData = 3.14f;
		
		//
		long	lData = 10000000000L;	//정수: int로 정의됨 [끝에 대문자 L 써주기]
		boolean boolD = true;				//boolean은 숫자가 올 수 없음.
		
		System.out.println("bData = " + bData);
		System.out.println("cData = " + cData);
		System.out.println("fData = " + fData);
		System.out.println("lData = " + lData);
		System.out.println("boolD = " + boolD);
	}
}
