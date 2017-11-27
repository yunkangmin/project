package example;

import javax.swing.JOptionPane;

public class Example01_StringPool {

	public static void main(String[] args) {
		String p=JOptionPane.showInputDialog(null,"설정할 비밀번호?");
		String rp=JOptionPane.showInputDialog(null,"설정할 비밀번호 확인?");
		
		JOptionPane.showMessageDialog(null, "예제창입니다.", "예제", JOptionPane.INFORMATION_MESSAGE);
		
		//p==rp X | p.equals(rp)//애는 배열일일이 비교
		if(p.equals(rp)) {//문자열길이가 길어지면 p.intern()==rp.intern()
			//같은 객체인지 아닌지만 비교하면된다.
			JOptionPane.showMessageDialog(null, "설정성공");
		}else {
			JOptionPane.showMessageDialog(null, "설정 실패\n비밀번호 불일치");
			
		}

	}

}
