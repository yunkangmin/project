import javax.swing.JOptionPane;
public class Source03 {
	public static void main(String[] args) {
		System.out.println(2.7%1.0);
		//if ~else /(������ ���¿� ���� �б� �۾� ������ ���Ǵ� ����)
		//if ������ �׻� else�� �ʿ��Ѱ� �ƴϴ�.
		//if �� �����ؼ� , �߰� �۾��� �ϴ� ���·� ����� ����
		
		//1.if
		//�Ҽ��� 2°�ڸ����� ��� ������ ����ߴ� �۾�
		//3000->3015�����  ���ϴ�� ������ ��� �Ҽ��� �Ʒ� ��°�ڸ�
		int y=3000;
		int t=3015;//2000-�� �ΰ� �ٴ´�.
		double change=(t-y)/(y*1.0)*100;
		double rChange=(int)(change*100)/100.0;
		System.out.println(rChange);
		String r=rChange>0?"+":"";//������� ��������
		r+=rChange;//String������ +�ۿ� �ȵȴ�.
		if((int)(rChange*100)%10==0)//double���� ==��ü�� �����ϴ�. �Ǽ������ �׻������ �߻��ϹǷ�
			r+="0";//�Ҽ����Ʒ���°�ڸ��� 0�̸��� String������ �ٿ��� ����ؾ��Ѵ�.
		System.out.println(r);
		//JOptionPane.showConfirmDialog(null, r);//â�� �߸鼭���ڿ� ���
		
	}
}
