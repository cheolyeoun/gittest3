/* 
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와
 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
 화씨 = 1.8 * 섭씨 + 32
 섭씨 = (화씨 - 32) / 1.8
*/



public class Exam07_4 {

	public static void main(String[] args) {
		double addResult = Fahrenheit(5);
		double f = Centigrade(5);
		
		Fahrenheit(5);  //화씨  변수로 입력하면 안됨
		Centigrade(5); //섭씨   변수로 입력하면 안됨
		
		System.out.println("섭씨 = " + addResult);
		System.out.println("화씨 = " + f);
	}	
		
		public static double Fahrenheit(double num) {	
			double addResult = (num-32)/1.8;
			return addResult;
						
	}

		public static double Centigrade(int num) {	
			double f = (num *1.8) + 32;
			return f; 
	}
}
