package java_409;

public class Wrapper_8 {

	public static void main(String[] args) {
		
		int bb_data = 0;
		
		Byte bb = new Byte("111");
		
		bb_data = bb.byteValue() + Byte.MAX_VALUE; // int Ÿ������ ���
		
		Byte bb_2 = (byte)(bb.byteValue() + Byte.MAX_VALUE); 
		// byte Ÿ������ ��� -128~127�Ѿ�� �����÷ο�Ǿ� ��ġ�ʴ� ���� ���ü� ����
		
		System.out.println("bb.byteValue() + Byte.MAX_VALUE = " + bb_data);
		System.out.println("(byte)(bb.byteValue() "
							+ "+ Byte.MAX_VALUE) =  " + bb_2);
		
		byte bbb = 0;
		int ii = 0;
		
		for (int i = 0; i < 300; i++) {
			System.out.println("byte : " + ++bbb + ", int : " + ++ii);
		}
		
		System.out.println();
		
		Byte bbb_2 = new Byte("0");
		int ii_2 = 0;
		
		for (int i = 0; i < 300; i++) {
			System.out.println("BByte : " + ++bbb_2 + ", int : " + ++ii_2);
		}
	}
}
// wrapperŬ������ �⺻ Ÿ�԰� ������ �Ȱ���.