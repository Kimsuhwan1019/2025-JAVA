package week11;

public abstract class Game {
	//부모 클래스
	//추상 클래스 => 객체 생성 불가, 단 상속은 가능!
	private String title;
	private String version;
	
	//private 필드 초기화
	public Game(String title, String version) {
		this.title = title;
		this.version = version;
	}
	
	//모든 자식 클래스에서 공통적으로 쓰는 메소드
	public void start() {
		System.out.println("제목 : " + title);
		System.out.println("버전 : " + version);
		System.out.println(title + "게임을 시작합니다.");
	}
	
	//게임 설명이 필요!
	//게임마다 내용이 다르다. 
	//재정의 해서 사용!
	//추상 메소드로 정의
	public abstract void gameDesc();
}