import java.util.Random;
import java.util.Scanner;

public class HighLowGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); 
		
		while(true) {
			System.out.println("나는 지금 부터 0부터 100사이의 값 중에 하나를 생각하겠습니다.");
			System.out.println("당신은 그 숫자를 6회안에 맞추시면 됩니다.\n");
			
			int num2 = rand.nextInt(101);
			
			System.out.println(num2);
			
			for(int j =6; j > 0; j--) {
		
				System.out.println("몇이라고 생각합니까? < 0 to 100>");
				int num = sc.nextInt();
				
				if (num == num2)  {
					System.out.println("정답");
					break;
				} else if (num != num2 && j == 1) {
					System.out.println("틀림");
				}
				else if (num < num2) { 
					System.out.println(num + "은 제가 정한 숫자보다 작습니다.");
					System.out.printf("[%d]의 기회가 남았습니다\n", j-1);
				}
				else if (num > num2)  {
					System.out.println(num + "은 제가 정한 숫자보다 큽니다.");
					System.out.printf("[%d]의 기회가 남았습니다\n", j-1);
				//if(j!=0) break;
				}
					
			}
		}	
	}
		
}