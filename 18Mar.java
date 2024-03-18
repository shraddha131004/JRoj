class shrads{
	static shrads s1 = new shrads();
	public static void main(String args[]){
		shrads s1 = new shrads();
	}
	static{
		System.out.println("Hello static block.");	
	}
	{
		System.out.println("Hello init block.");
	}
}
