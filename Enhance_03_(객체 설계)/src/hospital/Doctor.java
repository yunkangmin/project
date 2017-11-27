package hospital;

public class Doctor extends Sims{
	int major;//진료과 0-9
	public Doctor(String iName, int iAge, String iGender,int iMajor) {
		name=iName;
		age=iAge;
		gender=iGender;
		major=iMajor;
	}
	public boolean treat(int code) {//환자질병코드:00-99
		return major==code/10;
	}
	//오버라이드 ..상속관계에서 하위클래스가 부모클래스가 설계해둔 메소드를
	//덮어씌우는것(재정의)
	/**/public String toJSON() {
		return "{\"name\":\"" + name + "\",\"age\":" + age +
				",\"major\":" + major + "}";	
	}
	//오버로드(오버로딩)..하나의 객체에 같은 메소드명으로 여러개가 존재하는걸 의미(중복정의)
	public String toString() {
		
		return String.format("{\"name\":\"%s\" , \"age\":%s , \"gender\":\"%s\" , \"major\":%s)",
				name,age,gender,major);//문자열은 쌍따옴표로 묶고 다른 기본자료형은 그냥%s
		//의미있는 문자열을 만들자JSON
	}
}
