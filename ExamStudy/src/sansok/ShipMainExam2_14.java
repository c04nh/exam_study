package sansok;
class Ship{
	public String Name() {
		return "�� �̸�";
	}
}
class MyShip extends Ship{
	public String Name() {
		return "������";
	}
}
class YourShip extends Ship{
	public String Name() {
		return "Ÿ��Ÿ�� ȣ";
	}
}
class ShipName{
	public static void search(Ship s) {
		if(s instanceof MyShip) {
			MyShip b = (MyShip)s;
			System.out.println("MyShip �̸� : " + b.Name());
		}else if(s instanceof YourShip) {
			YourShip b = (YourShip)s;
			System.out.println("YourShip �̸� : " + b.Name());
		}
	}

}
public class ShipMainExam2_14{
	public static void main(String[] args) {
		Ship myship = new MyShip();
		Ship yourship = new YourShip();
		ShipName.search(myship);
		ShipName.search(yourship);
	}
}
