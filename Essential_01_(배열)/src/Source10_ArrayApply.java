import java.util.Arrays;

public class Source10_ArrayApply {

	public static void main(String[] args) {
		String[] str= new String[] {"����","����","������","����","��å"};
		System.out.println(Arrays.toString(str));
		Arrays.sort(str);//�����ټ����� ���ĵȴ�.
		System.out.println(Arrays.toString(str));
		int t="����".compareTo("����");//��ü-��ü ũ���
		//����������� �տ� ���� ��ũ��.�����ټ����� �� �ڿ��ִ�
		System.out.println(t);
		//========================================
		String [] bstr=new String[] {"1","11","110","101","100","1111","100","10"};
		//��ó�� 1�ξ� �״��� 0
		Arrays.sort(bstr);
		System.out.println(Arrays.toString(bstr));
		//2�����ڶ�� �����Ҳ���.
		//��  �达 ��达 �达�� ���达
		//�� ��达 ���达 �达 �达��
		for(int idx=0;idx<bstr.length;idx++) {
			int find=idx;//���°���� ã����
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
		//�ش繮�ڿ��� 2������ �����ϰ� 10������ �ٲ��ش�.
			
		//2������ �ٲ����� ����������
		System.out.println(Arrays.toString(bstr));
		//���������� 2�����ڰ� ����Ǹ�ȴ�.
		}

	}
