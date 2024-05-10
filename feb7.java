class Father{
	int score = 0;
	static String surname ;
	static boolean status;
	public static void main(String args[]){
		Father son = new Father();
		System.out.println(son.fun(10,14));
	}
	public int fun(int a,int ...b){
		System.out.println(b);
		System.out.println(a);
		return 1;
		
	}
	
}

