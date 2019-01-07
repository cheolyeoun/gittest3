
public class MyExam2 {

//	매개변수의 여부,  return 값의 여부 각 항목별로 차이점 확실히 알아두자.
	
	public static void main(String[] args) {
		
		Add1();
		int nResult = Add2();
		Add3(10,20);
		int nResult2 = Add4(1, 2);
		
		
		
		
	}

	public static void Add1() {
		System.out.println(1+2);	
	}
	
	public static int Add2() {
		return(1 + 2);	
	}
	
	public static void Add3(int num1, int num2) {
		System.out.println(num1 + num2);
	
	}
	
	public static int Add4(int num1, int num2) {
		return (num1+num2);
	
	}

}