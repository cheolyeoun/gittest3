// 세 개의 정수를 인자로 전달 받아서 평균을 반환하는 함수를 정의하라

public class Exam07_1 {

	public static void main(String[] args) {
		double result = T(30,10,15);
		
		System.out.println("30,10,15의 평균값은= " + result);
	}	
		
	public static double T(int A, int B, int C) {	
		double AVG = ((double)(A + B + C) /3) ;
		return AVG;					
	}			
}		