import javax.swing.JOptionPane;
public class Source03 {
	public static void main(String[] args) {
		System.out.println(2.7%1.0);
		//if ~else /(데이터 상태에 따른 분기 작업 구현에 사용되는 문법)
		//if 구현시 항상 else가 필요한건 아니다.
		//if 만 설정해서 , 추가 작업을 하는 형태로 사용이 가능
		
		//1.if
		//소수점 2째자리에서 끊어서 데이터 출력했던 작업
		//3000->3015변경됨  전일대비 몇프로 상승 소수점 아래 둘째자리
		int y=3000;
		int t=3015;//2000-가 두개 붙는다.
		double change=(t-y)/(y*1.0)*100;
		double rChange=(int)(change*100)/100.0;
		System.out.println(rChange);
		String r=rChange>0?"+":"";//양수인지 음수인지
		r+=rChange;//String변수는 +밖에 안된다.
		if((int)(rChange*100)%10==0)//double형은 ==자체가 위험하다. 실수계산은 항상오차가 발생하므로
			r+="0";//소수점아래두째자리가 0이면은 String형으로 붙여서 출력해야한다.
		System.out.println(r);
		//JOptionPane.showConfirmDialog(null, r);//창이 뜨면서문자열 출력
		
	}
}
