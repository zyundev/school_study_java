public class ShiftText_1 
{
	public static void main(String[] args) 
	{

		//77������ 7��° ��Ʈ�� �����ΰ�?
		// 01001101  =  77

		int num = 77;

		num = num >> 5;
		num = num | 1;

		System.out.println("20�� 3��° ��Ʈ�� : " + num);
	}
}