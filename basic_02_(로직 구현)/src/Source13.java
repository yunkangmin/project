
public class Source13 {

	public static void main(String[] args) {
		//loop in loop's flow
		/*	for(int out=1;out<=3;out++) {
			System.out.println(out+"...");
			for(int in=1;in<=5;in++) {
				System.out.println("\t"+in);
			}
			System.out.println("==================");
		}*/
		//�� ���� �ִ� ���� loop�� �帧�� �̿��ؼ�

		//1+(1+2)+(1+2+3)+(1+2+3+4)+.....(1+.....+10) �� ����� ���.
		int ans=0;//sum+=n*(11-n);����for���̾�����
		String str="";
		for(int out=1;out<=10;out++) {
			int temp=0;
			str+="(";
			for(int in=1;in<=out;in++) {
				temp+=in;
				str+=in;
				if(in<out) {
					str+=",";
				}
			}
				str+=")";
				if(out<10) {
					str+="+";
				}
				ans+=temp;
			}
		System.out.println(str);
		System.out.println(ans);
		}
	}

