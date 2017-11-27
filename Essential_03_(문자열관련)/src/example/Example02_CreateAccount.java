package example;
import java.io.*;
import java.util.Scanner;
public class Example02_CreateAccount {

	public static void main(String[] args) {
		while(true) {
			int cnt=0;
			Console console=System.console();
			//System.out.println(console==null);
			//무조건 문자열을 입력받는다
			//스트링포맷잡듯이 %s해서 사용하는것 ==>null
			System.out.println("CREATE ACCOUNT..!");
			String id=console.readLine("account id>",null);
			char[] pw=console.readPassword("account pass>",null);
			if((id.length()<=8&&id.length()>=4)&&(pw.length<=8&&pw.length>=4)) {
				System.out.println("아이디 비밀번호 자릿수 적합!");
				cnt++;
			}
			else {
				System.out.println("아이디 비밀번호 자릿수 부적합!");
				continue;
			}
			//입력해도 흔적이 안남는다.
			char[] rpw=console.readPassword("account repass>",null);
			String p1=new String(pw);
			String p2=new String(rpw);
			if(p1.equals(p2)) {
				System.out.println("비밀번호 일치");
				cnt++;
			}
			else {
				System.out.println("비밀번호 불일치");
				continue;
			}
			//자바는 다양한 방법으로 입력을 받을수있다.
			//이클립스에서는 콘솔객체가 안잡혀서 테스트를 할수가 없다.

			/*System.out.println(id);
			System.out.println(pw);
			System.out.println(rpw);*/
			String ss="";
			for(int i=0;i<id.length()-2;i++) {
				ss+="*";
			}
			String ss1="";
			for(int i=0;i<pw.length-2;i++) {
				ss1+="*";
			}
			if(cnt==2) {
				System.out.println("성공");
				System.out.println(id.substring(0,2)+ss);
				String m=new String(pw,0,2);
				System.out.println(m.substring(0,2)+ss1);
				break;
			}
			else {
				System.out.println("실패");
				continue;
			}
			//성공인지 실패인지
			//id와 pw는 4글자~8글자사이
			//PW와 RPW는 일치해야한다.

			//성공했을 경우는 .. 앞에 두글자만 제대로 나머진 전부 *처리
			//master, 1q2e3e4r==>ma*****/1q*****
		}

	}

}
