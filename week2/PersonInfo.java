package week2;

public class PersonInfo {
	public static void main(String[] args) {
		
		//변수 선언
		String name = "김수환";
		int		age = 25;
		double	height = 175.5;
		char	gender = 'M';
		boolean is_Student = true;
		
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.printf("키: %.1fcm\n", height);
		System.out.printf("성별: %c\n", gender);
		System.out.printf("학생 여부: %b\n", is_Student);
	}
}
