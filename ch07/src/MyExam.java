
public class MyExam {

	public static void main(String[] args) {
		// 파라미터 없고 반환 없는 매서드
      Hello();
      
      
      
      // 파라미터 있고 반환 없는 매서드
      MyAdd(1, 2);
      
      
      // 파라미터 없고 반환 있는 매서드
      int temper = Temper();
      System.out.println(temper);
      System.out.println(Temper() );
      
      
      //파라미터 있고 반환 있는 매서드
        int sum = TwoNumAdd(1, 2);
        System.out.println("합은" + sum);	  
	}

	public static void Hello() {
		System.out.println("Hello");
	
	}
	public static void MyAdd(int num1, int num2) {
		
		int nResult = num1 + num2;
		System.out.println(nResult);
	
	
	}
	public static int Temper() {
		
		return 16;
			
	
	}	
	
	public static int TwoNumAdd(int num1, int num2) {
		
		return  num1 + num2;
		
	
	
	
	}

}
