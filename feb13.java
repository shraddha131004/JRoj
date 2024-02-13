class Father{
	int balance;
	static String name;
	static boolean status;
	public Father(){
		this(3);
		balance = 567;
		System.out.println("Insde Defualt Constructor.");
		
	}
	public Father(int a){
		
		System.out.println("Insde Father(int) Constructor.");
		
	}
	public static void main(String args[]){
		Father son;
		Father daughter = new Father(234);
		System.out.println(daughter.balance);
	}
}
