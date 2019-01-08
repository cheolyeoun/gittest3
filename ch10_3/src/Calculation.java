abstract class Calc
{
	int a;
	int b;
	abstract void answer(); // 추상 클레스(반, 학급) 이기 때문에 무얼하듯 꼭 answer을 구현하라는 뜻.
	
	void setData(int m, int n)
	{
		
		a = m;
		b = n;
	}
}

class Plus extends Calc
{
	void answer()
	{
		System.out.println(a + " + " + b + " = " + (a+b) );
	}
}

class Calculation 
{
	public static void main(String[] args) {
	
		Plus plus = new Plus();
		plus.setData(27, 32);
		plus.answer();

	}

}
