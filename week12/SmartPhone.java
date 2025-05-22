package week12;

public class SmartPhone {
	
	//인터페이스 변수로 속성(필드) 선언
	Earphone earPhone;
	
	public void musicOn(Earphone ep) {
		ep.play();
	}
	
	public void musicOff(Earphone ep) {
		ep.stop();
	}

}
