import java.util.*;

public class Factorial_1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int fact = 1;

		System.out.print(" 정수를 입력하시오");
		int number = input.nextInt();

		for (int i = 1; i <= number  ;i++ )
		{
			fact *= i;
		}

		System.out.printf("  %d!  는  %d 입니다. ", number, fact);
		System.out.println("Lee jiyoon");
	}
}
