package week6;

public class ReferenceString {
	public static void main(String[] args) {
		//문자열은 0번부터 인덱스 부여. 따라서, 성별은 6번.
		String ssn = "0507201895612"; //ssn : 주민번호
		
		//문자열에서 문자 추출
		//성별 판단(문자열에서 6번째 문자 추출)
		char gender = ssn.charAt(6);
		switch(gender) {
		case '1','3' -> System.out.println("남자");
		case '2','4' -> System.out.println("여자");
		}
		
		//문자열의 길이
		//주민번호가 올바른지, 잘못됐는지 판단(문자열 길이가 13자리인지 판단)
		int length = ssn.length();
		if(length == 13)
			System.out.println("올바른 주민번호");
		else
			System.out.println("잘못된 주민번호");
		
		//문자열 대체
		String oldStr = "자바 프로그래밍";
		//**.replace(A,B); : 전체 문자열 중에 A를 B로 문자를 변환
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		//문자열 추출하기(잘라내기)
		//**.substring(0,6); : 전체 문자열중에 일부분(0번 인덱스부터 6번 앞 인덱스까지)만 가져오겠다!
		//0번 인덱스부터 6번 앞 인덱스까지 가져오기(주민번호 중 생년월일)
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		//**.substring(6); : 인덱스 6부터 문자열 끝까지 가져오겠다!
		String secondNum = ssn.substring(6);
		System.out.println(secondNum);
		
		//문자열 찾기
		//**.indexOf() : 문자열이 시작하는 인덱스 반환
		//String oldStr = "자바 프로그래밍";
		int index = oldStr.indexOf("프로그래밍");
		if (index == -1)
			System.out.println("프로그래밍 단어가 포함되어 있지 않음");
		else
			System.out.println(index + "번 인덱스에 단어가 있음");
		
		
		//문자열이 포함되어 있는지 없는지 여부 확인 => contains()
		boolean result = oldStr.contains("자바");
		
		//boolean result의 결과값이 true or false이기에 if 문 안에 들어올 수 있음
		if(result)
			System.out.println("자바와 관련된 문자열");
		else
			System.out.println("자바와 관련 없는 문자열");
		
		//문자열 분리하기
		//**.split : 
		String board = "1,자바학습,참조타입 String 클래스, 홍길동";
		String[] tokens = board.split(",");
		//배열? >> for문
		for (int i=0; i<tokens.length; i++)
			System.out.println(tokens[i]);
		
		//향상된 for문 사용(교재 p.189)
		//향상된 for문 >> index를 사용하지 않음!
		for (String str : tokens)
			System.out.println(str);
	}
}
