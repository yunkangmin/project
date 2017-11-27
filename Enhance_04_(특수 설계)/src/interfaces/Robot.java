package interfaces;

public class Robot {
	Translator translator;
	public Robot(Translator translator) {
		this.translator=translator;
	}
	public void sayNumber() {
		for(int i=1;i<=5;i++){
			String s=translator.execute(Integer.toString(i,10));
			System.out.println(i+" = "+s);
		}
	}
}
