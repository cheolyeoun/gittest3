class Cat{
	static int  a = 5;  // ★★ static은 data영역 메서드영역에 저장 구분만 해준것, 프로그램이 시작되면서 매서드 영역에서 삭제되고, cat 만 기억하고 알고 있기때문에 cat만 사용 할 수 있음.
	int num = 0;
}

public class MyTest {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		
		Cat cat1 = new Cat();
		cat1.num = 1;
		cat1.a = 10;
		System.out.println(cat1.num);
		System.out.println(cat1.a);

		
		Cat cat2 = new Cat();  // new 는 힙 영역에 저장됨 cat의 객체
		cat2.num = 2;			// cat2, num, num1, num2 은 스텍 영역에  저장됨. 지역변수	
		cat2.a = 11;
		System.out.println(cat2.num);
		System.out.println(cat2.a);
		System.out.println(cat1.a); //★★ a는 전역 변수가 되버림.
	}								//★★ 스태틱의 이해 및 책 강의 음성 보고 공부하자.

}
