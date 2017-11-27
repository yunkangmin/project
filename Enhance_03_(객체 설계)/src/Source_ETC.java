import com.google.gson.Gson;
class Account{
	String id;
	String pass;
	boolean mode;
	Account(String i,String p){
		id=i;
		pass=p;
		mode=true;
	}
}


public class Source_ETC {

	public static void main(String[] args) {
		Gson gson=new Gson();
		
		Account a=new Account("saan","fq2w3e");
		String s=gson.toJson(a);
		System.out.println(s);
		System.out.println(Account.class);
		//형식이 이미 만들어져잇다.
		Account ac=gson.fromJson(s,Account.class);
		System.out.println(ac.id+"/"+ac.pass);

	}

}
