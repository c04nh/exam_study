package sansok;
class Car{
	Car(){
		System.out.println("Car ������");
	}
}
class Truck extends Car{
	Truck(){
		System.out.println("Truck ������");
	}
	public static void main(String[] args) {
		Truck mytuck = new Truck();
	}

}
