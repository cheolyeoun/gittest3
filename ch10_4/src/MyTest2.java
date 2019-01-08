abstract class Animal {
	abstract void cry(); // 추상 클레스 abstract 넣음.
	void walk() {}  // 중과로를 넣어 주므로 써 아래에서 자세히 만들어 줘라.
	void run() {}
}

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}


class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
}

public class MyTest2 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.cry();
		
		Cat cat = new Cat();
		cat.cry();

	}

}
