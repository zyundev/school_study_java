import java.util.*;

public class Factorial_1 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int fact = 1;

		System.out.print(" ������ �Է��Ͻÿ�");
		int number = input.nextInt();

		for (int i = 1; i <= number  ;i++ )
		{
			fact *= i;
		}

		System.out.printf("  %d!  ��  %d �Դϴ�. ", number, fact);
		System.out.println("Lee jiyoon");
	}
}