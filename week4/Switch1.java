package week4;

public class Switch1 {
	public static void main(String[] args) {
		char grade = 'A';
		
		switch (grade) {
		case 'A': case 'a':				//grade = 'A or a' 이면,
			System.out.println("A 등급"); //"A 등급" 을 출력하겠다.
			break;
		case 'B': case 'b':				//grade = 'B or b' 이면,
			System.out.println("B 등급"); //"B 등급" 을 출력하겠다.
			break;
		default:
			System.out.println("기타 등급");
		}
	}

}
