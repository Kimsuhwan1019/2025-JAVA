package package1;

import week10.ClassA;

public class ClassC {
	//패키지가 다른 경우 import
	//아래의 ClassA 위에 마우스 올리고 import 생성(직접 쓰는게 아님!!!)
	ClassA c1 = new ClassA(true);
	
	//default 는 같은 패키지 안에서만 사용 가능
	//ClassA c2 = new ClassA(10);
	
	//ClassA c3 = new ClassA("홍길동");

}
