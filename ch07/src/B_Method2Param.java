
public class B_Method2Param {

	public static void main(String[] args) {
		double myHeight = 175.9;
		
		hieveryone(12, 12.5);
		hieveryone(13, myHeight);
		
		byEveryone();
		
		
	}

	
	public static void hieveryone(int age, double height) {
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("저의 키는 " +height + "cm 입니다.");
	}

	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}
	
}
