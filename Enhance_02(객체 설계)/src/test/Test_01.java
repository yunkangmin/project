package test;

public class Test_01 {
	String name;
	int age;
	double ki;
	
	Test_01(){
		
	}
	Test_01(String name){
		this(name,0,0);//�ݵ�� ù�ٿ� ������Ѵ�.
		//�����ڰ� ȣ��Ǳ� ���� �ٸ� �ڵ尡 ���� ����ɼ�����.
		//�����Ͱ� ���µ� ���� �����ϴ°� ���� �ȵȴ�.
		//this()�� �ݵ�� ù �ٿ� ���� ������ ���� �ٸ� �ڵ尡����
		//��ü �������� �̱⶧���� �״��� this()�� ȣ���Ѵٰ� �ص� 
		//���ǹ������� �����̴�.
		//���� �ι�°�� ���� �Ǹ� �����ڰ� ȣ��ǰ� ��ü�� �����Ǳ� 
		//������ JVM�� ��� ��ü�� �����ؾ� ���� �𸣴� ��Ȳ�̿´�.
		//���� �����ڵ� ��ü�� �����ϴ� �������̵� this()��ü�� �����ϴ� 
		//�������ε� this()�� ù���� �ƴ��ٿ� ����JVM�� ��� ��ü�� ȣ���ؾ�
		//��ü�� �ϳ��� �����ȴ�.
		//���� �𸣴� ��Ȳ�̿´�.
		//��ӿ��� super()�� �ڽ�Ŭ������ ��ü�� ���������ɼ� �ִ� ���ɼ��� �����ϴ°��̸�
		//�θ�Ŭ������ ����� �ʱ�ȭ�Ǳ� ���� �ڽ�Ŭ�������� �θ�Ŭ������ ����� ����ϴ� ���� 
		// ���̴�.�־ �̸� �����ϴ� 
	
		//��� ��ü����������  � �۾��� �� ���ְڳ�
		
		this.age=11;
	}
	Test_01(String name,int age,double ki){
		this.name=name;
		this.setAge(age);
		this.setKi(ki);
	}
	
	//setter�� getter
	//�޼ҵ���� ��� �������� ù���ڴ� �빮�ڷ� �ۼ��Ѵ�.
	
	//setter
	//�Ϲ������� ��� ������ �ϳ��� ���� �����ϱ� ���� �޼ҵ�
	//�Ű��������� ���� ���������� �����ϰ� �Ѵ�..
	//��������� ��������� ������ setter���� ó���Ѵ�.
	
	
	//����
	//void set���������(�Ű�����){}
	//�������(���ʿ��ѵ� �ֽ��)���輺�� �ִ� �ڵ�
	
	//getter
	//��� ���� �ϳ��� ���� ��ȯ�ޱ����� �޼ҵ�
	
	//����
	// ��ȯ�ڷ��� get���������(){return ���������;}
	String getName() {
		return name;
	}
	
	//����������� setter�� �ִ�.
	//�̷� �����ε� �̿��� �ȴ�.�̰� setter�� �� �� �� �ִ�.
	//�ڵ尡 ����������.
	void setData(String name,int age,double ki) {
		this.name=name;
		this.setAge(age);
		this.setKi(ki);
	}
	void setName(String name) {
		System.out.println("setName������ ��ü"+this);
		this.name=name;
	}
	void setAge(int age) {
		if(age<1) {
			System.out.println("���̰� �߸��ԷµǾ����ϴ�.");
			age=20;
		}
		this.age=age;
	}
	void setKi(double ki) {
		if(ki<50) {
			ki=50;
		}
		this.ki=ki;
	}
	//������¹�ȣ �̷���� setter�� �ȸ���� ���´� �ȹٲ��� �ϹǷ�
	//�������� ��� ex)�ֹε�Ϲ�ȣ getter�� �ȸ����.Ŭ�������ο� ������ �����
	//�� �ִ�.getter setter�� ��Ȳ�� ���� �����.
	void disp() {
		System.out.println("�̸� : "+this.name);
		System.out.println("���� : "+ this.age);
		System.out.println("Ű : "+ this.ki);
	}
}
