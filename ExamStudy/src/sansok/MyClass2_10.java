package sansok;
class GrandFather{
	private String name;
	public GrandFather(String name) {
		this.name = name;
		System.out.println("GrandFather 积己磊");
	}
}
public class MyClass2_10 extends GrandFather{
	public MyClass2_10(String str) {
		super(str);
		System.out.println("MyClass2_10 积己磊");
	}
	public static void main(String[] args) {
		MyClass2_10 s = new MyClass2_10("全辨悼");
	}

}
