public class ShiftText_1 
{
	public static void main(String[] args) 
	{

		//77숫자의 7번째 비트는 무엇인가?
		// 01001101  =  77

		int num = 77;

		num = num >> 5;
		num = num | 1;

		System.out.println("20의 3번째 비트는 : " + num);
	}
}
