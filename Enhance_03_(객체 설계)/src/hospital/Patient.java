package hospital;

public class Patient extends Sims{
	int code;
	double pain;
	
	public Patient() {
		
	}
	public void recieveTreat(double rate) {
		pain-=rate;
		
	}
}
