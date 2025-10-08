class Main {
	public static void main(String args[]){
		System.out.println("Pulkit, 24csu166");
		StudentA s1 = new StudentA(90,70,80);
		StudentB s2 = new StudentB(70,90,100,80);

		System.out.println("Percentage of Student A: "+s1.getPercentage());
		System.out.println("Percentage of Student B: "+s2.getPercentage());
	}
}