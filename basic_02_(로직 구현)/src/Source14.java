
public class Source14 {

	public static void main(String[] args) {
		//2���� ����� ���� -5<= x,y <=5
		int tx=4;
		int ty=3;
		//��ź�� ������ ��ǥ tx,ty /��ȿ�Ÿ��� ���簢���̰� 
		//���ع����� ��ź�� ������ �������κ��� �ݰ�2����
		//������ �޴� ��ǥ�� ���
		/**/	for(int n=-2;n<=2;n++) {
			int vx=tx+n;
			for(int r=-2;r<=2;r++) {
				//int vx=tx+r;
				int vy=ty+r;
				System.out.println(vx+" "+vy);
			}
		}
		/*for(int cx=tx-2;cx<=tx+2;cx++) {
			for(int cy=ty-2;cy<=ty+2;cy++) {
				if(cx>=-5&&cx<=5&&cy>=-5&&cy<=5)
					System.out.println(cx+" "+cy);
			}
		}*/
		/*for(int cx=tx-2>=-5?tx-2:-5;cx<=(tx+2<=5?tx+2:5);cx++) {
		for(int cy=ty-2>=-5?ty-2:-5;cy<=(ty+2<=5?ty+2:5);cy++) {
				System.out.println(cx+" "+cy);
 			}
		}*/
		//���ع�����2��� 0���� �����ؼ� ��25���̴�.
	}//���� ����ϴ�
}


