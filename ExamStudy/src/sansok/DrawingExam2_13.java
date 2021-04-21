package sansok;
class Shape{
	public void draw() {
		System.out.println("도형 그리기");
	}
}
class Circle extends Shape{
	private String type = "원";
	public void draw() {
		System.out.println(type + " 그리기");
	}
	public void painting() {
		System.out.println("색 칠하기");
	}
}
public class DrawingExam2_13 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		c.painting();
	}

}
