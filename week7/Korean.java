package week7;

public class Korean {
	//객체를 만들기 위한 클래스(설계도)
	//객체의 속성(필드, field)
	String nation = "대한민국";
	String name;
	String ssn;
	String phone;
	
	//매개변수가 있는 생성자
	Korean(String name, String ssn, String phone){
		//필드명 = 매개변수 형식으로 초기화
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
	}
}