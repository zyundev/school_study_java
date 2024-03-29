package java_407;

public class Thread_5 {
	
	public static void main(String[] args) {
		
		Thread_Exe_5 th1 = new Thread_Exe_5(); // 우선순위를 주지않으면 기본값은 5다.
		Thread_Exe_6 th2 = new Thread_Exe_6();
		
		th2.setPriority(10);
		
		System.out.println(" Priority of th1(-) : " + th1.getPriority());
		System.out.println(" Priority of th2(|) : " + th2.getPriority());
		
		th1.start();
		th2.start();
	}
}


class Thread_Exe_5 extends Thread
{
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			
			System.out.print("-");
			
			for (int j = 0; j < 10000000 ; j++);
				
			
		}
	}
}

class Thread_Exe_6 extends Thread
{
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			
			System.out.print("|");
			
			for (int j = 0; j < 10000000 ; j++);
				
			
		}
	}
}