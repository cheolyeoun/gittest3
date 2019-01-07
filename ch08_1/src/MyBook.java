
class Book
{

	String title;
	String author;
	int money;
}	

class 사람 // 클레스명과 변수 명에 한글로 쓰면 안됨... 예시 일뿐
{
	int 키;
	int 나이;
	String 이름;
}


class MyBook 
{

	public static void main(String[] args) {
		사람 man1 = new 사람();
		man1.키 = 175;
		man1.나이 = 25;
		man1.이름 = "홍길동";
		
		System.out.println("그 사람의 키는 "+ man1.키 + 
				" 나이는 " + man1.나이 +
				" 이름은 " + man1.이름+"입니다.");
			
		
		Book book1 = new Book();
		book1.title = "자바 프로그래밍";
		book1.author = "홍길동";
		book1.money = 15000;
		
		System.out.println("책이름 " + book1.title +
						   " 저자는 " + book1.author +
						   " 가격은 " + book1.money);
	}

}
