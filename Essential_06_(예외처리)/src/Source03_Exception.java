/*
 * Exception - 프로그램상의 문제로 발생하는 것들.
 * 
 * 
 * 
 */
import javax.swing.JOptionPane;
public class Source03_Exception {
public static void main(String[] args) {
	//String[]ar=new String[-3];

	
	while(true) {
	int n1=(int)(Math.random()*999);
	int n2=(int)(Math.random()*999);
	
	String qz="돌발퀴즈!\n "+n1+" - "+n2+" 는? ";
	String in=JOptionPane.showInputDialog(null,qz);
	//정답인지 아닌지
	try {
	if(Integer.parseInt(in)==(n1-n2)) {
		JOptionPane.showConfirmDialog(null, "환영합니다\n좋은하루되세요.");
		break;
	}
	}catch(NumberFormatException num) {
		JOptionPane.showConfirmDialog(null, "부적절한 데이터입니다.ss");
	}
	
	}
	while(true) {
	Object[] ar=new Object[] {"봄","여름","가을","겨울"};
	Object oo=JOptionPane.showInputDialog(null, "좋아하는계절은?", null,0,null, ar,"봄");

	}
	
	
	
	
	
	
	}
}
