class Car{
	int 연료량;
	int 속도;
	
	
	Car() {
		연료량 = 10;
		속도 = 0;
	}
	
	void 엑셀레이터() {
		속도 = 속도 + 1;
		연료량 = 연료량 - 1;
		
	}

	void  브레이크() {
		속도 = 속도 - 1;
	}
	void 상태() {
		System.out.println("연료량"  + 연료량);
		System.out.println("속도"  + 속도);
	}
}


public class Car1 {

	public static void main(String[] args) {
		Car mycar1 = new Car();
		mycar1. 상태();
		
		mycar1. 엑셀레이터();
		mycar1. 엑셀레이터();
		mycar1. 상태();
		
		mycar1. 브레이크();
		mycar1. 상태();	
		
		Car mycar2 = new Car();
		mycar2. 엑셀레이터();
		mycar2. 엑셀레이터();
		mycar2. 엑셀레이터();
		mycar2. 엑셀레이터();
		mycar2.상태();
		
		mycar1.상태();
	}

}
