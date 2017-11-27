import java.util.Arrays;

public class Source10_ArrayApply {

	public static void main(String[] args) {
		String[] str= new String[] {"주유","조조","제갈량","관우","손책"};
		System.out.println(Arrays.toString(str));
		Arrays.sort(str);//가나다순으로 정렬된다.
		System.out.println(Arrays.toString(str));
		int t="주유".compareTo("조조");//객체-객체 크기비교
		//양수가나오면 앞에 놈이 더크다.가나다순으로 더 뒤에있다
		System.out.println(t);
		//========================================
		String [] bstr=new String[] {"1","11","110","101","100","1111","100","10"};
		//맨처음 1인애 그다음 0
		Arrays.sort(bstr);
		System.out.println(Arrays.toString(bstr));
		//2진문자라고 생각할꺼임.
		//김  김씨 김김씨 김씨김 김김김씨
		//김 김김씨 김김김씨 김씨 김씨김
		for(int idx=0;idx<bstr.length;idx++) {
			int find=idx;//몇번째부터 찾는지
			for(int start=find;start<bstr.length;start++) {
				if(Integer.parseInt(bstr[start],2)<Integer.parseInt(bstr[find],2)) {//data[find]
					find=start;
				}
			}
			if(find==idx)
				continue;
			String keep=bstr[idx];
			bstr[idx]=bstr[find];
			bstr[find]=keep;
		}
		System.out.println(Arrays.toString(bstr));
		
		int []temp=new int[bstr.length];
		for(int idx=0;idx<bstr.length;idx++) {
			temp[idx]=Integer.parseInt(bstr[idx],2);
		}
		Arrays.sort(temp);
		for(int idx=0;idx<bstr.length;idx++) {
			bstr[idx]=Integer.toString(temp[idx],2);
		}
		//해당문자열을 2진수라 생각하고 10진수로 바꿔준다.
			
		//2진수로 바꿨을때 가장작은수
		System.out.println(Arrays.toString(bstr));
		//최정적으로 2진문자가 저장되면된다.
		}

	}
