
public class F_ReculFactorial {

	public static void main(String[] args) {
		System.out.println("3 factorial: " + factorial(3));
		System.out.println("12 factorial: " + factorial(12));		
		
	}

	public static int factorial(int n) {
		if(n==1)
			return 1;
		
		else
			return n * factorial(n-1);
	}
	
	
}


// 변수 값을 쓰지 않고 매서드 이름이랑 같게 쓰면 재귀 호출된다.