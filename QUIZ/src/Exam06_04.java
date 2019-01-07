
public class Exam06_04 {

	public static void main(String[] args) {
        int num = 1;
		int result = 0;
        
        do {
        
        	System.out.printf("%d+", num); 
            result +=num; 
            num++;
        } while (num < 1001);
        
        System.out.printf("=1부터 1,000까지의 합 %d" ,result);
     }
}




///*Do~While문을 이용하여 1~1000까지 더해서 결과를 출력하는 프로그램을 작성하시오.
//실행결과도 아래와같이 출력하시오.
//예)1+2+3.......+1000 = 500500
//