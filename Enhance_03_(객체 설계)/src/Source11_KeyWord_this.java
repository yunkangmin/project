class Bank{
	int balance;
	public Bank() {
		balance=0;
	}
	public Bank change(int ammount) {
		balance+=ammount;
		return this;
	}
}
public class Source11_KeyWord_this {

	public static void main(String[] args) {
		Bank b= new Bank();
		Bank bb=b.change(300);
		b.change(300).change(100).change(300).change(-200);
		
		System.out.println(b.balance);
		System.out.println(bb==b);
		
		StringBuilder sb=new StringBuilder("java");
		StringBuilder sb2=sb.append("!!").insert(0, "funny ").insert(0, "very ");
		//�ڱ��ڽ��� �����Ѵ�.
		
		System.out.println(sb.toString());
		System.out.println(sb2.toString());//�Ű������� �������ִ�.
		System.out.println(sb==sb2);//return this;�� �Ѵ�.
	}

}
