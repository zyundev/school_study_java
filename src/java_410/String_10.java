package java_410;

public class String_10 {

	public static void main(String[] args) {
		
		String str_1 = "korea";
		String str_2 = "korea";
		
		String str_3 = new String("korea");
		
		System.out.println("str_1 : " + System.identityHashCode(str_1));
		System.out.println("str_2 : " + System.identityHashCode(str_2));
		System.out.println("str_3 : " + System.identityHashCode(str_3));
		
		
		System.out.println("String str_1 = \"korea\"");
		System.out.println("String str_2 = \"korea\"");
		System.out.println("String str_3 = \"korea\"");
	
		System.out.println();
		
		if (str_1 == str_2) {
			System.out.println("str_1 == str_2 = true");
		}
		else
		{
			System.out.println("str_1 == str_2 = false");
		}
		
		if (str_1 == str_3) {
			System.out.println("str_1 == str_3 = true");
		}
		else
		{
			System.out.println("str_1 == str_3 = false");
		}

		if (str_1.equals(str_2)) {
			System.out.println("str_1.equals(str_2) = true");
		}
		else
		{
			System.out.println("str_1.equals(str_2) = false");
		}
		
		if (str_1.equals(str_3)) {
			System.out.println("str_1.equals(str_3) = true");
		}
		else
		{
			System.out.println("str_1.equals(str_3) = false");
		}
		
		System.err.println("str_1 : " + System.identityHashCode(str_1));
		System.err.println("str_2 : " + System.identityHashCode(str_2)); //  스레드가 돌고 있기때문에 이 줄은 어디든지 간다.
		System.err.println("str_3 : " + System.identityHashCode(str_3));
	}
}
// System. in, out 
// err- 색깔만 빨갓게 보여서 out과 똑같아 (임의적으로 나오는건 스레드가 돌고 있기때문)