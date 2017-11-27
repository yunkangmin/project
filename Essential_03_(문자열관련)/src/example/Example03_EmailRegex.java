package example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example03_EmailRegex {

	public static void main(String[] args) {
		String regex="^[_0-9a-zA-Z-]+@[0-9a-zA-Z-]+(.[_0-9a-zA-Z-]+)*$";
		//  "\\w{1,}@[\\w&&[^_]]{1,}(\\,\\w+)+";
		String[] sample=new String[] {
				"hyoungho@kgitbank.co.kr","shizo@naver.com","sa@.co.kr","@daum.net","saan@oracle"
		};
		
				
				
		System.out.println("Email - validation");
		for(int i=0;i<sample.length;i++) {
			System.out.println();
			System.out.print(sample[i]+">>>");
			System.out.println(sample[i].matches(regex));
		}

		Pattern p=Pattern.compile(regex);//���⿡�� +�� ������ �ȵȴ�.�ƹ��ų� ������ �ȵȴ�.
		//�ȿ� ���� ���ڿ��� ���ԽĿ� �ȸ����� ������.
		System.out.println();
		
		for(int cnt=0;cnt<sample.length;cnt++) {
			Matcher m=p.matcher(sample[cnt]);//�ѹ������ ��Ȱ���� ����.�ٽ� ������ �ٽø������Ѵ�.
			while(m.find()) {
				String g=m.group();
				int s=m.start();
				int e=m.end();
				System.out.println(g+"["+s+"-"+e+"]");
				
			}
			
			boolean b=m.find();//��ó������ ù��° �λ�°ȣ�⿡�� �״��� ��ȣ���ϸ� �״���
			System.out.println(b);
		/*	String g=m.group();
			int s=m.start();
			int e=m.end();
			System.out.println(g+"["+s+"-"+e+"]");*/
			
		}
		
	
		
		
		//Ư�����ڱ������� ���������� �ǵ�..pattern match��Ű��
		
		//"10a!dsa50aa4"   ..\\d\\w+ �� find��Ű��...�������� �׷�����
		//��� ������� Ȯ��

		


	

	}

}
