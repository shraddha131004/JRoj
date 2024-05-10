
class Big{
	static int id = 787;
	{
		System.out.println("Class big init block."+id);
		
	}
	static{
		System.out.println("Inside Static block of class big."+id);
		
	}
	static void add(){
		System.out.println("Stop");
	}
	
}
class small extends Big{
	static int x =  77;
	int y = 980;
	int String = 876;
	{
		y = 460;
		x = 555;
		System.out.println("Class small init block."+y);
		System.out.println("Class small init block."+String);
		System.out.println("Class small init block."+x);
	}
	static public void main(String args[]){
		small bb = new small();
		System.out.println("Inside Main");
		System.out.println(bb.x);
		System.out.println(x + id);
		add();
	}
	static{
		System.out.println("Inside Static block of class small."+ x );
		
	}
	
}
