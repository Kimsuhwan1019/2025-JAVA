package week4;

public class Switch3 {
	public static void main(String[] args) {
		String grade = "B";
		
		int score1 = 0;
		
		switch(grade) {
		case "A":
			score1 = 100;
			break;
		case "B":
			score1 = 100 - 20;	// 연산 처리
			break;
		default:
			score1 = 60;
		}
		System.out.println("score1 = "+ score1 + "점");
		
		//표현식을 이용한 변수값 설정
		//switch 문장이 대입 연산자 우측에 올 수 있다. (java 12ver 이상부터)
		int score2 = switch(grade) {
			case "A" -> 100;
			case "B" -> {
				//연산 처리
				int result = 100 - 20;
				yield result; //yield: 연산식이 있을때 !!  result 값을 score2에게 양보해라
			}
			default -> 60;
		};
		System.out.println("score2 = " + score2 + "점");
	}
}
