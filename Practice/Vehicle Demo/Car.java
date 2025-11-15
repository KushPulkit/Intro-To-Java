class Car extends Vehicle {
	String model;

	Car(String b,String m){
        super(b);
        model = m;
	}

	String getModel(){
		return model;
	}

	void setField(String b,String m){
		super.setField(b);
		model = m;
	}
	void display(){
		super.display();
		System.out.println("Model: "+getModel());
	}
}