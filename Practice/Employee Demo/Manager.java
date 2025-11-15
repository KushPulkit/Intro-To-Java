class Manager extends Employee {
	String department;
    
    Manager(String n, int i, String d){
    	super(n,i);
    	department=d;
    }
    String getDept(){
    	return department;
    }
    void setField(String n, int i, String d){
    	super.setField(n,i);
    	department=d;
    }
    void displayDetails(){
    System.out.println("Name: "+getName()+"\nID: "+getId()+"\nDepartment: "+getDept());
    }
}