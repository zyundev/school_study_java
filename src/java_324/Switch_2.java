public class Switch_2 
{
	public static void main(String[] args) throws Exception 
	{
		int score = (int)(Math.random() * 10) +1; //(Math.random() * (상한값 - 하한값 + 1) )+하한값

		switch (score*100 )
		{
		case 100:
			System.out.println("당신의 점수는  100 상품은 자전거 ");

		case 200:
			System.out.println("당신의 점수는  200 상품은 TV ");
		
		case 300:
			System.out.println("당신의 점수는  300 상품은 노트북 ");
			break;
		
		case 400:
			System.out.println("당신의 점수는  400 상품은 자동차 ");
			break;
		
		default : 
			System.out.println("죄송하지만 당신의 상품은 없습니다.");
		
		}
		System.out.println("Lee jiyoon");
	}
}
