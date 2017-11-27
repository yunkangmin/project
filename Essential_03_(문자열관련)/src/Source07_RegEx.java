/*
 * Pattern class / Matcher class�� �̿��Ͽ�
 * ���ڿ��� � ������ ��� �ִ��� �˻縦 �� �� �ִ�.
 * ������ ������ ���Ǵ°� ����ǥ����
 * 
 * Regular Experssion
 * String matches�� ���
 */
import java.util.regex.*;
public class Source07_RegEx {
	public static void main(String[] args) {
		//Pattern ��ü�� ���������ϴ°� �ƴ϶�  compile�̶� �޼ҵ带 �̿��ؼ� ����

		String data="�ڹٴ� ���α׷��־���Դϴ�. �ſ� �Ǹ��մϴ�. ���� ���մϴ�. �ְ��� ����Դϴ�.";

		Pattern p=Pattern.compile("����Դϴ�.");//���⿡�� +�� ������ �ȵȴ�.�ƹ��ų� ������ �ȵȴ�.
		//�ȿ� ���� ���ڿ��� ���ԽĿ� �ȸ����� ������.

		Matcher m=p.matcher(data);//�ѹ������ ��Ȱ���� ����.�ٽ� ������ �ٽø������Ѵ�.
		for(int cnt=1;cnt<=6;cnt++) {
			boolean b=m.find();//��ó������ ù��° �λ�°ȣ�⿡�� �״��� ��ȣ���ϸ� �״���
			System.out.println(b);
		}
		m.reset();//
		int cnt=0;
		while(m.find()) {
			cnt++;
			String g=m.group();//ã�� �κ��� ���ڿ� �翬�� complie�� �ϴٸ� �־����Ƿ� �ϴٰ� ���´�.
			int s=m.start();//ã�� ���ڿ��� ����idx
			int e=m.end();//�� idx+1;
			//start <=    <  end
			System.out.println(g+"["+s+"-"+e+"]");
		}
		System.out.println("CNT == "+cnt);
		
	}
}
