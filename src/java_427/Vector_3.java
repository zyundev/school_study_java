package java_427;

import java.util.ArrayList;
import java.util.Iterator;

public class Vector_3 {

	public static void main(String[] args) {
		
		int kor, eng, math, total;
		
		double avg;
		
		String[] �̸� = {"����Ź","����","�賲��","�����","�����",
					   "�輺��","�����","������","��ä��","������"};
		
		int[] ���� = {56, 78, 34, 66, 90, 47, 88, 65, 78, 45};
		int[] ���� = {78, 49, 77, 89, 57, 95, 45, 12, 80, 55};
		int[] ���� = {45, 12, 78, 54, 68, 42, 45, 98, 98, 80};
		
//		Vector vv = new Vector();
		ArrayList vv = new ArrayList();
		
		for (int i = 0; i < 10; i++) {
			vv.add((String)�̸�[i]);
			vv.add(new Integer(����[i]));
			vv.add(new Integer(����[i]));
			vv.add(new Integer(����[i]));
		}
		
		System.out.println("========�л� ���� ��ȸ ���α׷� ===========");
		System.out.println("\n �̸�\t����\t����\t����\t����\t���");
		
//		Enumeration enu = vv.elements();
		
//		while (enu.hasMoreElements()) {
//			
//			System.out.print("\n" + enu.nextElement());
//			kor = ((Integer)enu.nextElement()).intValue();
//			eng = ((Integer)enu.nextElement()).intValue();
//			math = ((Integer)enu.nextElement()).intValue();
			
			Iterator itt = vv.iterator();
			
			while (itt.hasNext()) {
				
				System.out.print("\n" + itt.next());
				
				kor = ((Integer)itt.next()).intValue();
				eng = ((Integer)itt.next()).intValue();
				math = ((Integer)itt.next()).intValue();
			
			
			total = kor + eng + math;
			
			avg = total / 3.0;
			
			System.out.print("\t" + kor + "\t" + eng + "\t" + math);
			System.out.printf("\t  %3d %5.1f ", total, avg);
			}
		}
		
	}
