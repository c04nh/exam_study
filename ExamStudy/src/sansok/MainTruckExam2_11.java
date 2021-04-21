package sansok;
class Car_1{
	String carname;
	String color;
	int velocity;
	void speedUp() {
		velocity += 5;
		System.out.println("속도 " + velocity + " 증가");
	}
	void speedDown() {
		velocity -= 5;
		System.out.println("속도 " + velocity + " 감소");
	}
}
class Truck_1 extends Car_1{
	int ton = 5;
	void speedUp() {
		velocity += 10;
		System.out.println("속도 " + velocity + " 증가");
	}
}
class MainTruckExam2_11 {
	public static void main(String[] args) {
		Truck_1 mytruck = new Truck_1();
		mytruck.speedUp();
		mytruck.speedDown();
	}

}
