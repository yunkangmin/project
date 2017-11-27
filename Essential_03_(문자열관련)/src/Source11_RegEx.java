import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Source11_RegEx {

	public static void main(String[] args) {
	String data="������ ���� ���� 21��1231����, ���� �� ���� 41��9135���µ�, ���� ��� ���̶� ���� �ִ�";
	data+="�ӽ� �� ��ȣ�� 79��79125��12312�Դϴ�.";
	//����Ѱ��� ������ ����� �ȵȴ�.
	String regex="(\\d{2})([��-�R])(\\d{4})";

	Pattern p=Pattern.compile(regex);
	Matcher m=p.matcher(data);
	
	while(m.find()) {
		String g=m.group();
		System.out.println("->"+g);
		
		String s1=m.group(1);
		String s2=m.group(2);
		String s3=m.group(3);
		//m.group(4);
		
		System.out.println(s1+".."+s2+".."+s3);
		String tt=String.format("%s,%s,%s,%s", m.start(),m.start(1),m.start(2),m.start(3));
		System.out.println(tt);
	}
	/*Pattern p=Pattern.compile("\\d{2}[��-�R]\\d{4}");//���⿡�� +�� ������ �ȵȴ�.�ƹ��ų� ������ �ȵȴ�.
	//�ȿ� ���� ���ڿ��� ���ԽĿ� �ȸ����� ������.

	Matcher m=p.matcher(data);//�ѹ������ ��Ȱ���� ����.�ٽ� ������ �ٽø������Ѵ�.
	for(int cnt=1;cnt<=6;cnt++) {
		boolean b=m.find();//��ó������ ù��° �λ�°ȣ�⿡�� �״��� ��ȣ���ϸ� �״���
		System.out.println(b);
	}
	
	m.reset();
	int cnt=0;
	
	while(m.find()) {
		cnt++;
		String g=m.group();//��ü �׷� m.group(0); ��������
	    int s=m.start();//ã�� ���ڿ��� ����idx
		int e=m.end();//�� idx+1;
		String s1=m.group(1);
		String s2=m.group(2);
		String s3=m.group(3);
		System.out.println(s1+" "+s2+" "+s3);
		String tt=String.format("%s,%s,%s,%s", m.start(),m.start(1),m.start(2),m.start(3));
		System.out.println(tt);
		
		//start <=    <  end
		System.out.println(g+"["+s+"-"+e+"]");
		System.out.println(data.substring(s,s+2));
		System.out.println(data.substring(s+2,s+3));
		System.out.println(data.substring(s+3,e));
	}
	System.out.println("CNT == "+cnt);*/
	
	//���� ��ȣ ��ü �������, �״���..
	//�տ� 2�� ���� ��� ���� ����
	
	// hutblog.tistory.com/entry/02
	//ī�����ε��׽�Ʈ 2������
	//�迭������
	//1���� 2���� 3���� ���� ����
	//���Խ�/�׷�/Pattern&Matcher/
	//������ ó���� ���� int[]
	//�ݵ�� 3��Ʈ
	//�� ���α׷��� ����������� �����͸� �Է¹޾Ƽ� ó���ϰԸ� �ٲ�νð�
	
	}

}
