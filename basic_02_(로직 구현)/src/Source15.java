
public class Source15 {

	public static void main(String[] args) {
		//�Ϲ����� �ݺ� �帧�� ��ȭ��Ű�� Ű����
		//continue : �ش�ȸ���� �����ִ� �ݺ� �۾��� �ǳʶٰ� ��(skip)
		//break : ���̻� �ݺ��� ������� �ʰ� ���߰� ��(break)
		int num=100;
		while(num>0) {
			System.out.println("loop start.."+num);
			
			int t=-3+(int)(Math.random()*8);//� ���ڰ� ������ �𸥴�
			System.out.println("t= "+t);
			if(t<0) {
				System.out.println("!!SKIP!!");
				continue;//�� �� ������ �۾��� �ǳ� �ٰ� �ٽ� ���� �������� ����.
			}
			num-=t;//�� ���� ����
			System.out.println("loop end...");
			for(int cnt=1;cnt<=2;cnt++) {
				System.out.println(".......");
			}
		}
		System.out.println("terminate");
		/**/
		int tx=-4;
		int ty=2;
		for(int n=-2;n<=2;n++) {//�������� ��ŵ�� ����� �ƴϴ�.
			int vx=tx+n;
			if(vx<-5||vx>5)
				continue;
			for(int r=-2;r<=2;r++) {
				//int vx=tx+r;
				int vy=ty+r;
				System.out.println(vx+" "+vy);
			}
		}
	}

}
