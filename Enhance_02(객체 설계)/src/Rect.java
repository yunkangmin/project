
public class Rect {
	//data
	int x;
	int y;
	int height;
	int width;
	//�޼ҵ���� �׻� �ҹ��ڷ� ���� �ǹ��ְ�
	//procedure
	double getMaxX() {
		return x+width;
	}
	double getMaxY() {
		return y+height;
	}
	/*boolean contains(int x, int y) {
		if(this.x<=x&&getMaxX()>=x&&this.y<=y&&getMaxY()>=y)
			return true;
		else
			return false;
	}*/
	boolean contains(int x, int y) {
		return this.x<=x&&getMaxX()>=x&&this.y<=y&&getMaxY()>=y;
	}
	//constructor ������ :��ü�� �����ɶ� �۵��Ǵ� �޼ҵ�
	//�Ϲ� �޼ҵ�� ���´� ����ѵ�, ���Ϻΰ� ����, ����� �ִ� ��ü��(=class��)���� �����ؾߵ�
	//�̰� �޼ҵ尡 �ƴϱ� ������ ��ü �������Ŀ��� ���� �θ� �� �ִ� ����� ����,new�Ҷ� �۵���.
	Rect(){
		System.out.println("call..");
		x=y=width=height=-1;
	}
	//��ü�� ������ ����� ���������� �߰� �����ص� �ȴ�.(�����ε��� ��߳��� ������)
	Rect(int init){
		x=y=width=height=init;
	}
	//���� �Ϲ������� �����ڴ� , ��ü �ʱ�ȭ�� �ʿ��� �۾��� �ϴ°��̰�,
	//�Ű����� �ִ� ������ �����ڴ� ��ü ������ �ʿ��� �����͸� ���޹޾Ƽ�
	//�ʵ� �ʱ�ȭ�� �̿�ȴ�.
	//�����ڸ� �������� ���� �����صδ°�, ��ü����� ���Ǹ� ���ؼ�
	
}
