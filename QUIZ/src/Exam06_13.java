
public class Exam06_13 {

	public static void main(String[] args) {
		
		System.out.println("가로\n");
		
		for(int i = 1; i< 10; i++) {           // 안쪽 for문
			for(int j = 2; j < 10; j++) {
		        System.out.print( j + " x " + i + " = " + (i * j)+"\t");
			}
				System.out.println();
		}
	
		System.out.println("세로\n");
		
		for(int i = 2; i< 10; i++) {           // 안쪽 for문
			for(int j = 1; j < 10; j++) {
		        System.out.print( i + " x " + j + " = " + (j * i)+"\t");
			}
				System.out.println();
		}		
	}

}

	