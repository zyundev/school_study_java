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
				j++; // 이것만 하게 되면 j = 10값으로만 저장되어 2단 밖에 출력이 안됨
			}
			 j=1;// 따라서 초기화를 해야 반복
			i++;
			System.out.println();
		}
		System.out.println("Lee jiyoon");
	}
}
