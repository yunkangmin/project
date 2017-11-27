package hospital;

//환자,의사,간호사, 이런객체들을 만드는데 있어서 공통적인 부분을 설계
//final class는 상속할 수 없다.
public  class Sims {
	String name;
	int age;
	String gender;
	
	//공통기능
	public String toJSON() {
		return "{\"name\":\"" + name + "\",\"age\":" + age +
				",\"gender\":" + gender + "}";	
		
	}

}
