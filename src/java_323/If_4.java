public class If_4 
{
	public static void main(String args[]) 
	{
		int visitCount = 0;
		
		if (visitCount < 1)
		{
			System.out.println("처음 오셨군요. 방문해 주셔서 감사합니다.");
		}
		else
		{
		System.out.println("다시 방문해 주셔서 감사합니다. ");		
		}

		System.out.println("방문 횟수는 " + ++visitCount + " 회 입니다.");
		System.out.println("Lee jiyoon");
	}
}
