package sansok;
class Car_2{
	String name = "��";
	String print() {
		return "[���� " + name + "�̴�.]";
	}
}
class Bus extends Car_2{
	String name = "����";
	String print() {
		return "[���� ������ " + name + "�̴�.]";
	}
}
class Truck_2 extends Car_2{
	String name = "Ʈ��";
	String print() {
		return "[���� ������ " + name + "�̴�.]";
	}
}
class CastingExam2_12 {
	public static void main(String[] args) {
		Car_2 mycar, yourcar;
		Bus mybus, yourbus;
		Truck_2 mytruck, yourtruck;
		mycar = new Car_2();
		mybus = new Bus();
		mytruck = new Truck_2();
		
		System.out.println("[" + mycar.print() + "]");
		System.out.println("[" + mybus.print() + "]");
		System.out.println("[" + mytruck.print() + "]");
		yourcar = mybus;
		yourbus = (Bus)yourcar;
		System.out.println("[" + yourbus.print() + "]");
		yourcar = mytruck;
		yourtruck = (Truck_2)yourcar;
		System.out.println("[" + yourtruck.print() + "]");
	}

}
