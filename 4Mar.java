class Sggs{
	public static void main(String args[]){
		System.out.println("Inside main.");
		Sggs sggs1 = new Sggs();
		System.out.println("Default toString() returns:"+ sggs1 );
		System.out.println("Class's toString() returns:"+ sggs1.mytoString());
		
	}
	public String mytoString(){
		return " "+getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	
}
