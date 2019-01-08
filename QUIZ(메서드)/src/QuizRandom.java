import java.util.Random; //control+ shift+ o 단축키

/*
QuizRandom or ExamRandom

랜덤한 세자리 수를 표시합니다.
단 100의 자리와 수와 10의 자리의 수 1의 자리의 수는 같아서는 안됩니다.

Ex ) 
101 등 안됨 : 1이 두개임
777 등 안됨 : 7이 세개임

224 등 안됨 : 2가 두개임
233 등 안됨 : 3이 두개임
*/


public class QuizRandom {

	public static void main(String[] args) {
		Random rand = new Random();  //  외부에서 가져옴 control+ shift+ o 단축키
		//100 ~ 999, 서로 다른
		// 102 ~ 987
		while(true) {
		int num = rand.nextInt(988); // 0~999
		if(num<=102) {
			continue;
		}
		// 987 이 나왔다고 가정했을때
		int num1 = num / 100;  //9
		int numT = num - num1 * 100; // 87
		int num2 = numT / 10; //8
		int num3 = numT % 10; //8
		if(num1 != num2 && num1 != num&& num!= num3) {
			System.out.println(num1+""+num2+""+num3);
			break;
			
		}

	  }
	}
}
