package package1;

import week10.ClassD;

public class ClassF {
	public ClassF() {
		ClassD dd = new ClassD();
		dd.field1 = 20;		//public
//      dd.field2 = 20;		//default(같은 패키지에서만 가능)
//		dd.field3 = 20;		//private
		
		dd.method1();		//public
//		dd.method2();		//default(같은 패키지에서만 가능)
//		dd.method3();		//private
	}
}
