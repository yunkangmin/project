
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
		//이 위에 있는 이중 loop의 흐름을 이용해서

		//1+(1+2)+(1+2+3)+(1+2+3+4)+.....(1+.....+10) 이 결과를 계산.
		int ans=0;//sum+=n*(11-n);단일for문이었을때
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

