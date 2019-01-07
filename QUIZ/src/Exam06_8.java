
public class Exam06_8 {

	public static void main(String[] args) {
		for(int i = 2; i< 9; i++) {           
						
			while(true) {
			   if((i % 2) == 0)  // if문 참이면 실행
			   break;  // break 문이 수행되면 이 while }까지 수행되지 않고 while 문을 벗어난다. 				
			   i++;  }
					
			for(int j = 1; j <= i; j++)
		     System.out.println(i + " x " + j + " = " + (i * j));				
	  
		System.out.println();
		}
		// int nMax = i  를 사용해서 풀어보자. 
	}
}