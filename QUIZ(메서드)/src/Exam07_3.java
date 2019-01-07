
public class Exam07_3 {

	public static void main(String[] args) {
		int result;
		result = T(5,10,15);
		
		System.out.println("5,10,15의 가장 작은 값은= " + result);
	}	
		
	public static int T(int A, int B, int C) {	
		
		if(A>B && B>C) {  //if문은 2개 가지만 비교
			return (B);
		}
		else if(C>A && A<B){
			return (A);
		}
		else if(A>C && C<B){
			return (C);
		}
		else return (C);  // else 값에는 조건을 주면안됨.
	}
}
	