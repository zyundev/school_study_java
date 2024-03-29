package java_420;

import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_5 extends Frame implements ActionListener{

	List  list;
	Label lbl_info;
	TextArea txt;
	Panel panel;
	
	public ActionEvent_5(String title) {

		super(title);
		panel = new Panel();
		list = new List(5, true);
		
		list.add("서울");
		list.add("대구");
		list.add("대전");
		list.add("부산");
		list.add("광주");
		list.add("전주");
		list.add("울산");
		list.add("인천");
		list.add("제주");
		
		panel.add(list);
		
		lbl_info = new Label("                ");
		txt = new TextArea("~");
		list.addActionListener(this);
		
		add("Center", panel);
		add("South", txt);
		
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		new ActionEvent_5("ActionEvent Test!!!");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		String[] list_1 = list.getSelectedItems();
		txt.setText("");
		for (int i = 0; i < list_1.length; i++) {
			txt.append(list_1[i] + " 을 찍고 \n");
			System.out.println(list_1[i] + " 을 찍고");
		}
	}

}
