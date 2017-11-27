package study.set;
/*
 * Set �迭�� �÷����� �ߺ��Ǵ� Elements(��ü)�� ������ ���� �ʴ� �÷�����.
 * 	���ϰ�ü(Ȥ�� ���ϵȴٰ� �ǴܵǴ� ��ü) / -String �� Wrapper��ü�� �����Ͱ� ������ ���ٰ� �Ǵ���.
 * 	
 * 	�Ϲ������� ���� ���̴� class��
 *  HashSet: �ӵ��� ���� ����. - ���������� ������.
 * 	LinkedHashSet: HashSet���ٴ� ������ -���������� ����.
 * 
 *  TreeSet:��ü�� ������ �ִ� value�� ����� ���ĵ� ���·� ����.
 */
import java.util.*;
public class Source01_Set {
public static void main(String[] args) {
	Set<String> s1=new HashSet<>();
	Set<String> s2=new LinkedHashSet<>();
	Set<String> s3=new TreeSet<>();
	//�տ� Ÿ���� ���������� �ڿ��� �������ص��ȴ�.
	
	String[] data="jan,feb,mar,feb,apr,may,may,jun,jan".toUpperCase().split(",");
	System.out.println(data[1]==data[3]);
	for(int i=0;i<data.length;i++) {
		boolean b1=s1.add(data[i]);
		boolean b2=s2.add(data[i]);
		boolean b3=s3.add(data[i]);
		System.out.println(b1+".."+b2+".."+b3);
	}
	System.out.println(s1.toString());//��������ȵ�
	System.out.println(s2.toString());//���������
	System.out.println(s3.toString());//���� ���� ���� ������ �ִ� �����ͺ��� ���
	//��� �´� ���� ��ü�� ������ ���Ѵ�.
	//������ ��ü�Ӹ� �ƴ϶� �ٸ� ��ü�ε��� ���� �ϴٰ� �ǴܵǸ� ������Ѵ�.
	//Iterator�� ����ص� ���� ����� ���´�.
	//String�迭�� ��ü�� �޶� ���� ���ڿ��� ������ ���ٰ� �Ǵ��Ѵ�.
	//hangman�� ����
}
}
