package sansok;
class Greeting{
	public String name = "ȫ�浿";
	public void sayHello() {
		System.out.println("�� �ȳ��ϼ���.");
	}
}
public class EngHello2_9 extends Greeting {
	public String name = "Mr.Hong";
	public void sayHello() {
		System.out.println(name + " Nice to meet you");
	}
	public void test() {
		System.out.print(super.name);
		super.sayHello();
	}
	public static void main(String[] args) {
		EngHello2_9 eng = new EngHello2_9();
		eng.sayHello();
		eng.test();
	}
}

