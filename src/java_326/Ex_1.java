public class Ex_1 
{
	public static void main(String[] args) 
	{
		
		sum(10,20); //  sum (10,20); ���� ���� �ʴ� �޼ҵ�
		sub(10, 20);
		mul(30,10);
		div(30,10);
		
		System.out.println("Lee jiyoon"); 
	}

	static void sum(int x, int y) 
	{
		System.out.println(" 10 + 20 = "+ (x + y) );
		
	}
	static void sub(int x, int y) 
	{
		System.out.println(" 10 - 20 = "+ (x - y) );
		
	}	
	static void mul(int x, int y) 
	{
		System.out.println(" 30 * 10 = "+ (x * y) );

	}
	static void div(int x, int y) 
	{
		System.out.println(" 30 / 10 = "+ (x/y) );
		
	}
}