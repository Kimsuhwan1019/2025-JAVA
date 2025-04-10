package week6;

public class Reference1 {
	public static void main(String[] args) {
		//기본 데이터 타입: 스택 영역에 변수와 값이 갈이 저장.
		int iVal1 = 100;
		int iVal2 = 100;
		System.out.println("iVal1==iVal2 : " + (iVal1==iVal2? true : false));	// == : 값이 같다.
		
		//참조 타입: 변수는 스택영역에 생성되고 해당 객체는 힙 영역에 생성
		//스택영역의 변수에는 주소가 저장
		//대표적인 클래스 변수 : String
		String sVal1 = "Java";
		String sVal2 = "Java";
		//문자 리터럴이 동일한 경우 >> 같은 객체를 공유(동일한 주소 참조)
		System.out.println("sVal1==sVal2 : " + (sVal1==sVal2? "참조가 같다" : "참조가 다르다"));	//== : 주소(참조)가 같다.
		
		String sVal3 = new String("Java");
		String sVal4 = new String("Java");
		System.out.println("sVal3==sVal4 : " + (sVal3==sVal4? "참조가 같다" : "참조가 다르다"));	//== : 주소(참조)가 같다.
		
		//참조타입 변수는 초기값으로 null 값을 사용할 수 있다.
		//변수만 스택에 생성
		//NullPointerException 주의!!
		String sVal5 = null;
		//System.out.println("sVal5.length = " + sVal5.length());
		
		sVal5 = "Java";
		System.out.println("sVal1==sVal5 : " + (sVal1==sVal5? "참조가 같다" : "참조가 다르다"));	//== : 주소(참조)가 같다.
		
		//문자열의 값을 비교하고자 할때는
		//반드시 equals() 메소드를 사용
		//if(!sVal3.equals(sVal4)) : sVal3와 sVal4가 다른가? 를 묻고싶다면, 가장 앞에 ! 붙히기. 
		if(sVal3.equals(sVal4))
			System.out.println("sVal3과 sVal4의 문자열 값은 같다.");
		else 
			System.out.println("sVal3과 sVal4의 문자열 값은 다르다.");
		
	}

}
