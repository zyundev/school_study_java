package java_409;

public class Wrapper_2 {

	public static void main(String[] args) {
		
		Integer abc_1 = new Integer(789);
		Integer abc_2 = new Integer(456);
		
		int kbs_1 = (int)abc_1; // UnBoxing
		int kbs_2 = abc_2; 		// auto UnBoxing
		
		Integer cnn_1 = (Integer)378; // Boxing
		Integer cnn_2 = 573; // auto Boxing
		
		Integer king_1 = abc_1 + abc_2; // Wrapper ���� ����
		Integer king_2 = kbs_1 + kbs_2; // �⺻������ ���� �� wrapperŬ������ �� auto Boxing 
		
		int queen_1 = abc_1 + kbs_1; //�⺻����  Wrapper �� ����
		
		System.out.println("abc_1 : " + abc_1);
		System.out.println("abc_2 : " + abc_2);
		System.out.println("kbs_1 : " + kbs_1);
		System.out.println("kbs_2 : " + kbs_2);
		System.out.println("cnn_1 : " + cnn_1);
		System.out.println("cnn_2 : " + cnn_2);
		System.out.println("king_1 : " + king_1);
		System.out.println("king_2 : " + king_2);
		System.out.println("queen_1 : " + queen_1);
		
		/*
		 * �׷��ٸ� ����ü ���� ����ڽ̰� ��ڽ��� ����ؾ� �ұ��?
		 * ����(��ü) Ÿ�԰� �⺻ Ÿ�� ������ "���Ǵ���(�� ����) ����ġ(=��Ȯ�Ǽ��� ����)" �� �ִ�
		 * ��쿡�� ����ϼ���(�⺻ Ÿ���� ���� ���� ��쿡�� ������)
		 * ���� ��� Map�̳� Set ���� Java Collection ����
		 * �⺻ Ÿ���� �� �����ϱ�
		 * �̷���쿡�� ����(��ü) Ÿ���� ���� �˴ϴ�.
		 * ������ ���� ����̳�, ���ɿ� �ΰ��� ��� �ڵ忡
		 * ����ڽ�/ ��ڽ���  ����ϴ� �� �������� ����
		 * Integer�� int�� �Ϻ��� ��ü �Ҽ� ����
		 * ����ڽ̰� ��ڽ��� �⺻ Ÿ�԰� ���� Ÿ�� ������ ������ �帴�ϰ� �����������,
		 * �� ���̸� �Ϻ��� ���ִ� �� �ƴ�
		 * */
	}
}