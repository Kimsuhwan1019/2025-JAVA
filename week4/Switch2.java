package week4;

public class Switch2 {
	public static void main(String[] args) {
		//Switch 표현식 1) case를 연결할 때 그냥 ,(콤마)로 연결 2)실행할 때 '->' 사용 3)break 안써도 됨
		char grade = 'B';
		
		switch(grade) {
		case 'A', 'a' -> {
			System.out.println("A 등급");
			System.out.println("우수 회원");
		}
		case 'B', 'b' -> {
			System.out.println("B 등급");
			System.out.println("우수 회원");
		}
		default -> {
			System.out.println("손님");
		}
	}
		System.out.println();
		
		switch(grade) {
		case 'A', 'a' -> System.out.println("우수회원");
		case 'B', 'b' -> System.out.println("일반회원");
		default -> System.out.println("손님");
		}
	}
}
