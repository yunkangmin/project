//�迭�� ������ �ϸ鼭 �����͸� ������ �� ����.

public class Source03_Array {
public static void main(String[] args) {
	String [] ar=new String[4];//���ڿ��� ����Ǿƴϴ�. ������ ������̴�.
	ar[0]="�ڹ��� ���ڿ�";//ĭ�� �����ΰ� ���߿� �����ص��ȴ�.
	System.out.println(ar[0].indexOf("����"));//null�� ���.
	//System.out.println(ar[1].indexOf("����"));//������.
	
	String[] br=new String[] {"����","����","��ɲ�","������","����"};
	int ridx=(int)(Math.random()*br.length);
	System.out.println("����...."+br[ridx]+"!!!");
	
	//����� ���ÿ� �ʱ�ȭ�� �����ϴ�.
	int[]nums=new int[] {31,28,31,30};
	int [] copy=new int[nums.length];//�迭�� �ѵ�21�ﰳ����int�� ���
	//[]���� ���ڸ� int������ ���ϱ�
	for(int idx=0; idx<nums.length;idx++) {
		copy[idx]=nums[idx];
	}
	int[] cnums=nums.clone();//�⺻�ڷ����϶��� �ȴ�.
	//clone()�޼ҵ尡 ���� ������ ������ش�.
	//���� ��ü �ּҰ� ����.������ �ٲ��.
	cnums[0]*=10;//int���̱� ������ �����ϴ�.
	
	System.out.println(cnums[0]+" / "+(cnums==nums)+" / "+nums[0]);
	int [] dnums=new int[] {31,28,31,30};
	System.out.println(dnums[0]+" / "+(dnums==nums));
	
	StringBuilder[]sbs=new StringBuilder[] {new StringBuilder(),
			new StringBuilder(),new StringBuilder()};
	//������ü�� �����ؼ� �־�����Ѵ�.
	StringBuilder t= new StringBuilder();
	StringBuilder[] sbss=new StringBuilder[] {t,t,t,t,t};
	//int exp=1000; int cp=exp; ������ ��������.
}
}
