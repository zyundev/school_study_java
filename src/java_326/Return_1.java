public class Return_1 
{
	public static void main(String[] args) 
	{
		int result1, result2 , result3;
		double result4;

		result1 = sum(10,20); //  sum (10,20); 리턴 받지 않는 메소드
		result2 = sub(10,20); 
		result3 = mul(30,10); 
		result4 = div(30,13); 

		System.out.println(" 10 + 20 = "+ result1); //
		System.out.println(" 10 + 20 = "+ result2); //
		System.out.println(" 30 * 10 = "+ result3); //
		System.out.println(" 30 / 13 = "+ result4); //
		System.out.println("Lee jiyoon"); //
	}

	static int sum(int x, int y) //2
	{
		return (x + y);
	}
		static int sub(int x, int y) //2
	{
		return (x - y);
	}
		static int mul(int x, int y) //2
	{
		return (x * y);
	}
		static double div(double x, double y) //2
	{
		return (x / y);
	}
}
