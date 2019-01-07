class Book
{
	int price;
	String title;
	
	Book(String t, int p)
	{
		title = t;
		price = p;
	}
	//복제 생성자   // 디폴트 값 파라미터 도 없고, 지정되지도 않은 값.
	Book(Book abc)  // abc는 변수와 같은 개념. Book book1같다고 보면 됨.
	{
		title = abc.title;
		price = abc.price;
	}

	void print()
	{
		System.out.println("제   목 : " + title);
		System.out.println("가   격 : " + price);
	}
}	
class MyBook 
{

	public static void main(String[] args) 
	{
	
		Book book1 = new Book("자바 프로그래밍",10000);
		book1.print();
		
		Book book2 = new Book(book1);
		book2.title = "자바 디자인패턴";
		book2.print();

	}

}
