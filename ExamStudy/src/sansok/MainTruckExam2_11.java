package sansok;
class Car_1{
	String carname;
	String color;
	int velocity;
	void speedUp() {
		velocity += 5;
		System.out.println("�ӵ� " + velocity + " ����");
	}
	void speedDown() {
		velocity -= 5;
		System.out.println("�ӵ� " + velocity + " ����");
	}
}
class Truck_1 extends Car_1{
	int ton = 5;
	void speedUp() {
		velocity += 10;
		System.out.println("�ӵ� " + velocity + " ����");
	}
}
class MainTruckExam2_11 {
	public static void main(String[] args) {
		Truck_1 mytruck = new Truck_1();
		mytruck.speedUp();
		mytruck.speedDown();
	}

}
