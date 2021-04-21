package sansok;
class Greeting{
	public String name = "È«±æµ¿";
	public void sayHello() {
		System.out.println("¾¾ ¾È³çÇÏ¼¼¿ä.");
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

