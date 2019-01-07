//세 개의 정수를 인자로 전달 받아서 그중 가장 큰 수를 반환하는 함수를 정의하라

public class Exam07_2 {

	public static void main(String[] args) {
		int result = getMaxNumber(5, 10, 15);
		
		System.out.println("5,10,15의 가장 큰 값은= " + result);
	}	
		
	public static int getMaxNumber(int A, int B, int C) {	
		
		if(A<B && B>C) {  //if문은 2개 가지만 비교
			return (B);
		}
		else if(C<A && A>B){
			return (A);
		}
		else if(A<C && C>B){
			return (C);
		}
		else return (C);  // else 값에는 조건을 주면안됨.
	}
}
	