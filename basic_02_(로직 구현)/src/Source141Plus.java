
public class Source141Plus {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			//정렬 값비교 원하는 인덱스를 만들어 낼 수가 있다.
			String str=i+":";
			//System.out.print(str);
			for(int j=0;j<=i;j++) {
				//System.out.print(j+" ");
				str+=j+" ";
			}
			System.out.println(str);
		}
		
		System.out.println();
		for(int i=0;i<5;i++) {
			//정렬 값비교 원하는 인덱스를 만들어 낼 수가 있다.
			String str=i+":";
			System.out.print(str);
			for(int j=4;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//for의 조건 설정을 통해서 연습하는 문제들, 별찍기연습
		for(int i=0;i<5;i++) {
			//정렬 값비교 원하는 인덱스를 만들어 낼 수가 있다.
			String str="";
			//System.out.print(str);
			for(int j=0;j<=i;j++) {
				//System.out.print(j+" ");
				str+="★";
			}
			System.out.println(str);
		}
		for(int i=0;i<5;i++) {
			//정렬 값비교 원하는 인덱스를 만들어 낼 수가 있다.
			String str="";
			//System.out.print(str);
			for(int j=4;j>=i;j--) {
				//System.out.print(j+" ");
				str+="★";
			}
			System.out.println(str);
		}
	}

}
