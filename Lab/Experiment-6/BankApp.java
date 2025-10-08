class Main{
	public static void main(String args[]){
		System.out.println("Pulkit, 24csu166");
		BankA ba = new BankA(100);
		BankB bb = new BankB(150);
		BankC bc = new BankC(200);
		System.out.println("Balance of Bank A: "+ba.getBalance());
		System.out.println("Balance of Bank B: "+bb.getBalance());
		System.out.println("Balance of Bank C: "+bc.getBalance());
	}
}