package week7;

public class Car {
	//자동차 객체를 만들기 위한 라이브러리용 클래스(설계도)
	//객체의 속성 >> 필드
	String company = "현대자동차";
	String model; // = " 그랜저";
	String color; // = "black";
	int maxSpeed; // = 350;
	int speed;
	
	//생성자가 선언되지 않으면 기본 생성자가 자동으로 만들어짐
	
	//생성자 오버로딩(Overloading) => 생성자를 다양하게 제공
	Car(){
		//기본 생성자
	}
	
	Car(String model){
		//this.model = model;
		//this.color = "black";
		//this.maxSpeed = 300;
		this(model, "black", 300);
	}
	
	Car(String model, String color){
		//this.model = model;
		//this.color = color;
		//this.maxSpeed = 250;
		this(model, color, 250);
	}
	
	//매개변수로 초기값을 받아서 초기화하는 생성자 선언
	//생성자 선언되면 기본 생성자는 자동으로 만들어지지 않음
	Car(String model, String color, int maxSpeed) { 
		
		//this가 붙으면 객체 자기 자신을 가리킨다. (클래스의 필드와 지역 변수의 이름이 같을 때 구분)
		//this.model = 클래스의 필드, model = 생성자의 매개변수
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}