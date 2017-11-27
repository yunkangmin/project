package Example;
import javax.swing.JOptionPane;
public class Example03_Valid_ID {

	public static void main(String[] args) {
		String pre=JOptionPane.showInputDialog(null,"주민번호 앞 6자리");  //6자리
		String suff=JOptionPane.showInputDialog(null,"주민번호 뒤 7자리"); //7자리
		
		JOptionPane.showInputDialog(null,"검증을 시작합니다.");
        //toCharArray
		//주민번호 매직넘버
		//mspaint
		//자바의 모든데이터는 거진90%는 String으로 처리된다.
		//그리고 분석
		//공개 주민번호
		//주민번호 검증...
		//생년월일6자리,7자리(성별1자리/지역번호2자리/동사무소번호2/출생신고1/매직넘버1)
		//6자리와 6자리를 더해서 숫자생성
		//몇번째로 신고됫나
		//한동네에서 오래살면 앞5자리가 같을수도 있다.
		String total=pre+suff;
		System.out.println(total);
		//char[] prevAr1=pre.toCharArray();
		int result=0;
		/*for(int i=0;i<prevAr1.length;i++) {
			result+=prevAr1[i]*(1+i);
		}*/
		char[] total1=total.toCharArray();
		for(int i=0;i<total1.length-1;i++) {
			if(i<=7)
			result+=(total1[i]-48)*(2+i);
			else
			result+=(total1[i]-48)*(i-6);
		}
		result=11-(result%11);
		result%=10;
		System.out.println(result);
		System.out.println(total1[12]);
		if(result==total1[12]-48)
		  {
		   System.out.println("주민등록번호가 확인되었습니다.");
		  }
		  else
		  {       
		 System.out.println("주민등록번호가 틀렸습니다.");
		  }

	}

}
