
public class Source10Plus {

	public static void main(String[] args) {
	int t1,t2,t3;
	
	do {
		t1=1+(int)(Math.random()*3);
		t2=1+(int)(Math.random()*3);
		t3=1+(int)(Math.random()*3);
	}while(t1==t2||t1==t3||t2==t3);         
	//{}���� ������ �� ��, ������ �´ٸ� �ٽ� �۾��� �ش޶�
	//�ϴ� �ѹ��� ������ �ϰ� ������ ���� �ݺ����θ� �����Ѵ�.
	System.out.println(t1+" , "+t2+" , "+t3);
	

	

}
}
