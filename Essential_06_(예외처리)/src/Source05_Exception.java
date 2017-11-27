
/*
 * 흐름을 짜다보면, 여러가지 익셉션을 동시에 처리해야되는 상황이 생김.
 * 
 * 
 * 
 */
import java.io.IOException;
import java.net.*;//네트워크 통신시 사용

import javax.swing.JOptionPane;

public class Source05_Exception {
	public static void main(String[] args) {
		//여러 익셉션을 동시에 처리해야 되는 경우가 있음 멀티캐치
		//동시처리를 하고 싶으면 catch(익셉션 | 익셉션 | 익셉션 변수명한개)
		long t1=System.currentTimeMillis();
		
		try {
			String port=JOptionPane.showInputDialog(null,"개방할 포트?");
			//esc를 누르면 객체가 생성이 안됨 nullPointException
			
			
			
			
			/**/if(port.matches("1\\d+")) {//1로시작하는 수이면
				throw new IndexOutOfBoundsException();
				//강제 에러발생
			}
			
			
			int iport=Integer.parseInt(port);
		ServerSocket server=new ServerSocket(iport);//문의 종류가 1번부터존재 65535까지
		//SecurityException, IOException, IllegalArgumentException
		System.out.println("추가 진행가능..");
		/*long t2=System.currentTimeMillis();
		System.out.println(t2-t1+"ms");*/
		}catch(NumberFormatException e) {//숫자가아닌것
			System.out.println("수치형태로 입력 바람");
			
			//우리들이 확인하기 어려운것들만 막아서 처리해라(if else문으로 처리하기 어려운것들)
		}/*catch(IllegalArgumentException e) {//범위에 없는 포트번호
			System.out.println("1~65535 수치로 입력");//멀티익셉션처리 익셉션종류가 많으면 멀티 캐치하면된다.
		
		}*/catch(IOException | IllegalArgumentException e){//점유중인 포트 //애만 잡아도 쓸수는 있다. //445
			System.out.println("1~65535번중 안쓰는 포트로 설정");
			System.out.println(e.getMessage());//왜 터트렸는지 이유가 나온다.
		}/**/finally {
			//try가 정상적으로 처리되던, catch에 의해 잡혔든 못잡혔든 무조건 작동
			long t2=System.currentTimeMillis();
			System.out.println(t2-t1+"ms");
			//finally는 절대적
		}
		
		
		
		System.out.println("프로그램 종료");
		}
}
//익셉션들도 패키지가 있다.
//안잡아도 되는익셉션들은 if else로 잡을수있다.