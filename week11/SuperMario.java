package week11;

public class SuperMario extends Game {

	public SuperMario(String title, String version) {
		super(title, version); //부모 생성자 호출 => 초기화
	}

	@Override
	public void gameDesc() {
		System.out.println("슈퍼마리오는 닌텐도의 대표 비디오 게임 시리즈이다.");
	}
}
