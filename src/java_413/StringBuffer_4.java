package java_413;

public class StringBuffer_4 {

	public static void main(String[] args) {
		
		StringBuffer sb_1 = new StringBuffer("korea");
		StringBuffer sb_2 = new StringBuffer("korea");
		
		if (sb_1 == sb_2) {
			System.out.println("sb_1 == sb_2 = true");
		}
		else 
		{
			System.out.println("sb_1 == sb_2 = false");	
		}
		if(sb_1.equals(sb_2))
		{
			System.out.println("sb_1.equals(sb_2) = true");
		}
		else
		{
			System.out.println("sb_1.equals(sb_2) = false");
		}
		//  �ּҰ��� �ٸ����� ���ڿ��� ������ false�� ���� ������ StringBuffer Ŭ������ equals�� ���⿡
		// String Ŭ���� ���� equals��� �޼ҵ尡 �ְ�, �װ� �������̵� �Ͽ� ����
		// �׷��� �ּҰ��� �޶� ���ڿ��� ������ true���� ���´�.
		
		// StringBuffer �� ������ String ���� ��ȯ�Ѵ�.
		
		String s_1 = sb_1.toString();
		String s_2 = sb_2.toString();
		
		if (s_1.equals(s_2)) {
			System.out.println("s_1.equals(s_2) = true");
		}
		else
		{
			
			System.out.println("s_1.equals(s_2) = false");
		}

	}
}