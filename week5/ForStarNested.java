package week5;

public class ForStarNested {
	public static void main(String[] args) {
		
		//일단 ★을 5개 찍어놓고(안쪽 루프) 줄을 바꾼다(바깥쪽 루프).
		for(int i=1; i<=3; i++) {			//행
			for(int j=1; j <=5; j++)		//열
			{
				System.out.print("★ ");		//별 출력
			}
			System.out.print("\n");			//줄 바꿈
		}
	}
}