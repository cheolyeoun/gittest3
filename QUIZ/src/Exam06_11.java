
public class Exam06_11 {

	public static void main(String[] args) {
		int i = 1;       // 초기화를 해주지 않으면, 비교 나 수를 쓸수 없다. 하지않으면 null이므로..//
        int nSum = 0;	 // 초기화를 해주지 않으면, 비교 나 수를 쓸수 없다. 하지않으면 null이므로..//
		
	    do {
            if( (i % 2==0)){
	    	   nSum = nSum + i; 
            
            }
            	i++;
	    	
            } while ( i < 101);
	     System.out.println("짝수의 합 : " + nSum);
	}
}