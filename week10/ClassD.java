package week10;

public class ClassD {
	//필드와 메소드에 접근제한자 적용
	public int field1;
	int field2;			//접근제한자를 생략 => default
	private int field3;
	
	public ClassD() {
		//클래스 내부에서는
		//접근 제한자의 영향을 받지 않는다.
		field1 = 10;
		field2 = 10;
		field3 = 10;
		
		method1();
		method2();
		method3();
	}
	
	public void method1() {}
	void method2() {}	//default
	private void method3() {}
}
