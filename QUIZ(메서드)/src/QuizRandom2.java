import java.util.Random;

public class QuizRandom2 {

	public static void main(String[] args) {
		Random rand = new Random(); 
		
		while(true) {		
		int num1 = rand.nextInt(10);  // 0~9
		int num2 = rand.nextInt(10);  // 0~9
		int num3 = rand.nextInt(10);  // 0~9
		
		if(num1 != 0&&num1 != num2 && num1 != num3 && num2 != num3){
			System.out.println(num1 +""+num2+""+num3); // 숫자랑 숫자를 더하기 때문에 ""을 통해 공백을 줌
			break;
		}
	}	
}
		
}
