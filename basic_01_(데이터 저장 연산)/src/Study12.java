
public class Study12 {

	public static void main(String[] args) {
		//++,--
		int val=100;
		val+=1;
		val++;
		++val;
		System.out.println(val);
		val-=1;
		val--;
		--val;
		System.out.println(val+=1+val);
		val=100;
		System.out.println((val+=1)+val);
		val=100;
		System.out.println(val+=(1+val));
		val=100;
		System.out.println(++val+val);
		val=100;
		System.out.println(val++ + val);
		System.out.println("===========");
		System.out.println(val);
		//++,--기호는 변수 뒤쪽은 단순히 1증가가 되는게 아니라
		//변화와 동시에 사용이 된다면 다른시점에 변화가 일어난다.
		//앞쪽의 ++,--는 변화후에 값이 사용됨
		//변수뒤쪽에 위치한 ++,--는 값이 사용되고 변화함;
		int target=10;
		int v1=target++;
	
		int v2=++target;
		System.out.println(target);
		System.out.println(v1);
		System.out.println(v2);
		
		target=10;
		System.out.println(target + ++target + target++ + target + ++target);
		System.out.println(target);
	}

}
