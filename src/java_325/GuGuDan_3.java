import java.io.*;

public class GuGuDan_3 
{
	public static void main(String[] args) throws Exception
	{
		int i =2, j =1;

		while (i <= 9)
		{
			while (j  <= 9)
			{
				System.out.println(i + "*" + j + "=" + (i*j) );
				j++; // �̰͸� �ϰ� �Ǹ� j = 10�����θ� ����Ǿ� 2�� �ۿ� ����� �ȵ�
			}
			 j=1;// ���� �ʱ�ȭ�� �ؾ� �ݺ�
			i++;
			System.out.println();
		}
		System.out.println("Lee jiyoon");
	}
}