class 거인 {
	
	//필드, 멤버, 변수
	private String name;
	String 체형; //큰놈, 작은놈, 뚱뚱한넘
	String 타입; //남성형, 여성형
	int 키;
	
	private int height;
	
	//매서드, 멤버 함수
	int getHeight() {
	return height;
	}
		
	void setHeight(int n) {
	height = n;
	}

	거인(String str) {
		name = str;
	}	
	//메서드, 멤버 함수
	void 걷기() {
		System.out.println(name + "걷기");
	}
	void 뛰기() {
		System.out.println(name + "뛰기");
		
	}
	void 공격() {
		System.out.println(name + "공격");
	}
	void 방어() {
		System.out.println(name + "방어");
	
	}
}

public class MyExample {

	public static void main(String[] args) {
		거인 aaa1 = new 거인("김춘삼");
		aaa1.공격();		

		거인 aaa2 = new 거인("홍길동");
		aaa2.걷기();
			}

	}
