package week11;

public class AnimalEx {
	public static void main(String[] args) {
		//추상클래스는 객체 생성 불가
		//Animal animal = new Animal();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("\n");
		
		Animal animal = dog;
		animal.sound();
		animal = cat;
		animal.sound();
		System.out.println("\n");
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	//매개변수의 다형성 구현
	private static void animalSound(Animal animal) {
		animal.sound();
		animal.breathe();
		//부모 클래스 변수는 자기가 가지고 있는 필드나 메소드만 접근 가능
		//animal.dogLife();
		
		//객체 확인
		if (animal instanceof Dog) {
			System.out.println("Dog 객체로 변환 가능");
			Dog dog = (Dog)animal;
			dog.dogLife();
		} else if (animal instanceof Cat) {
			System.out.println("Cat 객체로 변환 가능");
			Cat cat = (Cat)animal;
			cat.catLife();
		}
	}
}
