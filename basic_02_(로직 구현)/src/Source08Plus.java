
public class Source08Plus {

	public static void main(String[] args) {
		int r=(int)(Math.random()*10000);
		int cr=r;
		System.out.println("������ġ="+r);
		//���ؾߵǴ� ������ : �� �ڸ����� ��, ���ڸ��� �ΰ�?
		//0~9999 0~9:10 10~99:90 100~999:900 1000~9999:9000 0.1%
		int count=0;
		int result=0;//���ڸ������� ��
		while(cr>0) {
			int n=cr%10;
			System.out.println(n+"..");
			int p=cr/10;
			result+=n;//�������� ���ؾ��Ѵ�.
			cr=p;//r/=10;
			count++;//�ڸ���
		}
		System.out.println("������ġ="+r);//ī�Ƕ߱�
		System.out.println(result+" "+count);
	}

}
