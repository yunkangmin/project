
public class Source14Plus {

	public static void main(String[] args) {
		//���������� ���� �Ÿ� : 6
		//�� ������ �ֻ����� (1-6) ������ ������ �ϴµ�
		//A=>B=>A=>B
		//A:5�� ���Ë�, �̱�Ȯ��
		//���߿��ϳ��� �Ÿ��� ���������� �õ��� �ؾ��Ѵ�.
		
			int aleft=6;//A�� ���� �Ÿ�
			int bleft=6;//B�� ���� �Ÿ�
			int win=0;//�̱�� ���
			int lose=0;//���� ���
			do {
				aleft-=5;
				for(int b=1;b<=6;b++) {
					if(bleft-b<=0) {
						lose++;
					}else {
						win++;
					}
				}
			}while(aleft>0||bleft>=0);
		}
	}


