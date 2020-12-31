package java_422;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key_1 extends Frame implements KeyListener{

	TextArea txt_info;
	TextField txt;

	
	public Key_1(String title) {
		super(title);
		
		txt = new TextField();
		txt.addKeyListener(this);
		
		add("Center", txt_info = new TextArea());
		add("South", txt);
		
		txt_info.setFocusable(false);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Key_1("Key Event Test");
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		txt_info.append(e.getKeyChar() + " 가 입력되었습니다. !!!!!\n");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		txt_info.append(e.getKeyChar() + " 가 눌렸습니다. @@@@@@\n");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		txt_info.append(e.getKeyChar() + " 를 놓았습니다. #########\n");
		
	}

	
}

