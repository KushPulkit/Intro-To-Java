class Employee {
	String name;
	int id;

	Employee(String n, int i){
    name = n;
    id = i;
	}
    String getName(){
    	return name;
    }
    int getId(){
    	return id;
    }
    void setField(String n, int i){
    	name = n;
    	id = i;
    }
	void displayDetails(){
    System.out.println("Name: "+getName()+"\nID: "+getId());
	}
}