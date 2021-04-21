package sansok;
class Car{
	Car(){
		System.out.println("Car 持失切");
	}
}
class Truck extends Car{
	Truck(){
		System.out.println("Truck 持失切");
	}
	public static void main(String[] args) {
		Truck mytuck = new Truck();
	}

}
