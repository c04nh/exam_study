package sansok;
class Shape{
	public void draw() {
		System.out.println("���� �׸���");
	}
}
class Circle extends Shape{
	private String type = "��";
	public void draw() {
		System.out.println(type + " �׸���");
	}
	public void painting() {
		System.out.println("�� ĥ�ϱ�");
	}
}
public class DrawingExam2_13 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		c.painting();
	}

}
