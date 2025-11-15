class Vehicle {
	String brand;

	Vehicle(String b){
        brand = b;
	}
	String getBrand(){
		return brand;
	}
	void setField(String b){
        brand = b;
	}
	void display(){
		System.out.println("Brand: "+getBrand());
	}
}