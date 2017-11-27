
public class Source10Plus {

	public static void main(String[] args) {
	int t1,t2,t3;
	
	do {
		t1=1+(int)(Math.random()*3);
		t2=1+(int)(Math.random()*3);
		t3=1+(int)(Math.random()*3);
	}while(t1==t2||t1==t3||t2==t3);         
	//{}안의 내용을 한 후, 조건이 맞다면 다시 작업을 해달라
	//일단 한번은 무조건 하고 조건을 보고 반복여부를 결정한다.
	System.out.println(t1+" , "+t2+" , "+t3);
	

	

}
}
