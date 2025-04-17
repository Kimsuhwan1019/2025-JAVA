package week7;

public class PetEx {
	public static void main(String[] args) {
		
		//
		Pet mypet = new Pet("바둑이", "강아지", 3); 
		System.out.println("<애완동물 정보>");
		
		//필드 값 출력
		System.out.println("이름 : " + mypet.name);
		System.out.println("종류 : " + mypet.type);
		System.out.println("나이 : " + mypet.age + "살");
		
		//생성자 오버로딩을 이용해서 객체 초기화
		Pet pet1 = new Pet("초코", "고양이");
		
		Pet pet2 = new Pet("구름", "강아지", 2, "흰색");
	}
}