package hospital;

//ȯ��,�ǻ�,��ȣ��, �̷���ü���� ����µ� �־ �������� �κ��� ����
//final class�� ����� �� ����.
public  class Sims {
	String name;
	int age;
	String gender;
	
	//������
	public String toJSON() {
		return "{\"name\":\"" + name + "\",\"age\":" + age +
				",\"gender\":" + gender + "}";	
		
	}

}
