public class Switch_6 
{
	public static void main(String[] args) throws Exception
	{
		int  ch;

		System.out.print("L,O,V,E 중 하나의 문자를 입력하시오 ");
		ch = System.in.read();

		switch(ch)
		{
			case 'L' :
				System.out.println("L");
			case  'O':
				System.out.println("O");
			case  'N':
				System.out.println("N");
			case  'G':
				System.out.println("G");	
		}
		System.out.println("Lee jiyoon");
	}
}
