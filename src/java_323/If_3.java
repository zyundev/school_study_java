import java.io.*;

public class If_3 
{
	public static void main(String[] args)  throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int grade = 0;
		System.out.print("점수를 입력");
		grade = Integer.parseInt(in.readLine());
	
		 String cc = "";

		if (grade >= 90)
		{
			cc = "A";
			
			if(grade >= 97)
			{
				cc += "++";
			} 
			else if (grade <=93)
			{
				cc += "--";
			}

		} else if (grade >= 80)
		{
			cc = "B";
		} else if (grade >= 70)
		{
			cc = "C";
		} else if (grade >= 60)
		{
			cc = "D";
		} else
		{
			cc = "F";
		}
		System.out.println("성적은 " + cc + " 입니다.");
	}
}
