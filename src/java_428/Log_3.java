package java_428;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Log_3 {

	private static final Logger logger = Logger.getLogger(Log_3.class.getName());
	
	public static void main(String[] args) throws IOException{
		
		Handler handler = new FileHandler("loggingTest_1.txt");
		
		logger.addHandler(handler);
		logger.setLevel(Level.FINEST);
		logger.info("info 레벨 메시지11");
		
		logger.fine("fine 레벨 메시지22");
		logger.finest("finest 레벨 메시지33");
		
		handler.flush();
		/* 
		 * buffer가 다 차기 전에 프로그램을 종료하면
		 * buffer에 들어있는 내용은 파일에 쓰여지지 않는다.
		 * 그 때 flush()를 호출하면 buffer의 내용이 파일에 쓰여짐
		 * 사용자가 원할 때 버퍼를 비워주는 것으로 버퍼를  비우는 것은
		 * IO 에서는 출력하는 것이고, 네트워크에서는 버퍼의 내용을
		 * 클라이언트나 서버로 보내는 것  사용자가 원할 때라는 말이 포인트
		 * */
		
		handler.close();
		/* 
		 * flush()와 close()를 같이 쓰는데
		 * 사실 close 함수가 내부적으로 flush함수를 호출
		 * flush할 때 close가 된다
		 * */
		
	}
}

// log기록을 남기는 방법 ( 실행 후 왼쪽 first_java 패키지 Refresh 후 txt파일 찾기) 








