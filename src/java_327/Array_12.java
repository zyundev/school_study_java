public class Array_12 
{
	public static void main(String[] args) 
	{
		if (args.length != 3)
		{
			System.out.println("usage : java Array_12 NUM1 op NUM2");
			System.exit(0); //���α׷� ���� exit(������ ������) 0 , 1�� ���̾�
		}

		int num1 =Integer.parseInt(args[0]); // ���ڸ� ���ڷ� ��ȯ
		char op = args[1].charAt(1); // ex) ���� /-----++++ ����         =>                /�� �������� ,                                    -�� ������
															// ���ڿ��� ����(char)�� ��ȯ <charAt(0) ù��°���� �������ڴ�, charAt(1) �ι�° ���� �������ڴ�.
		int num2 =Integer.parseInt(args[2]);	
		int result = 0;

		switch (op)
		{
		case '+':
						result = num1 + num2;
						break;
		case '-':
						result = num1 - num2;
						break;
		case 'x':
						result = num1 * num2;
						break;
		case '/':
						result = num1 / num2;
						break;
		case 'X':
						result = num1 % num2;
						break;
		default:
			System.out.println("�������� �ʴ� ������ �Դϴ�.");
		}

		System.out.println(" ��� : " + result);
		System.out.println("Lee jiyoon");
	}
}