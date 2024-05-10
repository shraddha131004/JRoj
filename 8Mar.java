class AA{
	static{
		System.out.println("Inside static block of AA.");
	}
	{	
		System.out.println("Inside init block of AA.");
	}
}
class aa{

	static{
		System.out.println("Inside static block of aa.");
	}
	static public void main(String args[]){
		
		aa cc = new aa();
		AA bb = new AA();
	}
	{	
		System.out.println("Inside init block of aa.");
	}
}
