import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Source08_RegEx {
	public static void main(String[] args) {
		String data="3S-93J43.l3l3kD7T4-Z";//���õ�����
		
		String regex="3.";//�������� ���ڿ�.
		

		Pattern p=Pattern.compile(regex);//���⿡�� +�� ������ �ȵȴ�.�ƹ��ų� ������ �ȵȴ�.
		//�ȿ� ���� ���ڿ��� ���ԽĿ� �ȸ����� ������.

		Matcher m=p.matcher(data);//�ѹ������ ��Ȱ���� ����.�ٽ� ������ �ٽø������Ѵ�.
		for(int cnt=1;cnt<=6;cnt++) {
			boolean b=m.find();//��ó������ ù��° �λ�°ȣ�⿡�� �״��� ��ȣ���ϸ� �״���
			System.out.println(b);
			//m.start();//true�� ���;� �����ִ�.
		}
		m.reset();//
		int cnt=0;
		//m.group();//find()�� �����ʰ� ����ؼ� ����
		while(m.find()) {
			cnt++;
			String g=m.group();//ã�� �κ��� ���ڿ� �翬�� complie�� �ϴٸ� �־����Ƿ� ã���ϴٰ� ���´�.
			int s=m.start();//ã�� ���ڿ��� ����idx
			int e=m.end();//�� idx+1;
			//start <=    <  end
			System.out.println(g+"["+s+"-"+e+"]");
		}
		System.out.println("CNT == "+cnt);
		//regex���� .�� �ǹ��ϴ°�, any character�� �ǹ��ϴ� ��Ÿĳ����(Ư������)
		//.�� �ƹ����ڸ� �ǹ�
		//īī���� ����ε��׽�Ʈ
		//��Ī�� �ϰ� �����ϴ¹��
		//��Ī�ϴ� ���
	}
}
