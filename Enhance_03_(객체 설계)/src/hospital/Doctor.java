package hospital;

public class Doctor extends Sims{
	int major;//����� 0-9
	public Doctor(String iName, int iAge, String iGender,int iMajor) {
		name=iName;
		age=iAge;
		gender=iGender;
		major=iMajor;
	}
	public boolean treat(int code) {//ȯ�������ڵ�:00-99
		return major==code/10;
	}
	//�������̵� ..��Ӱ��迡�� ����Ŭ������ �θ�Ŭ������ �����ص� �޼ҵ带
	//�����°�(������)
	/**/public String toJSON() {
		return "{\"name\":\"" + name + "\",\"age\":" + age +
				",\"major\":" + major + "}";	
	}
	//�����ε�(�����ε�)..�ϳ��� ��ü�� ���� �޼ҵ������ �������� �����ϴ°� �ǹ�(�ߺ�����)
	public String toString() {
		
		return String.format("{\"name\":\"%s\" , \"age\":%s , \"gender\":\"%s\" , \"major\":%s)",
				name,age,gender,major);//���ڿ��� �ֵ���ǥ�� ���� �ٸ� �⺻�ڷ����� �׳�%s
		//�ǹ��ִ� ���ڿ��� ������JSON
	}
}
