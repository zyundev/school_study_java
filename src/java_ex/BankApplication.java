package java_ex;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while (true) {
			System.out.println("==============================================");
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ���� ");
			System.out.println("==============================================");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				createAccount();
				
			} else if (selectNo == 2) {
				accountList();
				
			} else if (selectNo == 3) {
				deposit();
				
			} else if (selectNo == 4) {
				withdrow();
				
			} else if (selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");
	}
	
	//���»����ϱ�
	private static void createAccount() {
		Account obj = new Account("111-111", "Ȧ�浿", 10000);
		
		System.out.println("==============");
		System.out.println("���»���");
		System.out.println("==============");
		System.out.println("���¹�ȣ : " + obj.getAno());
		System.out.println("������ : " + obj.getOwner());
		System.out.println("�ʱ��Աݾ� : " + obj.getBalance());
		System.out.println("���°� �����Ǿ����״�.");
	}
	
	//���� ��Ϻ���
	private static void accountList() {
		
	}
	
	//�����ϱ�
	private static void deposit() {
		
	}
	
	//����ϱ�
	private static void withdrow() {
		
	}
	
	//Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		
		
	}
}