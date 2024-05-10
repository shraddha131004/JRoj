class Sadda{
	String name;
	int roll_no;
	String a = "Shraddha";
	static int b;
	{
		System.out.println("Instance block");
	}
	static{
		System.out.println("Inside Static block 1");
		b = 25;
		System.out.println(b);
	}
	static public void main(String args[]){
		
		Sadda ss = new Sadda();
		//System.exit(0);
		//ss.name = "sadda";
		//ss.roll_no = 13;
		//System.out.println(ss.name);
		//System.out.println(ss.roll_no);
		//System.out.println("bubuuuuuuuu."+ss.a);
		//System.out.println(ss.Printcharint('b',5));
		//System.out.println(ss.Printcharint(5,'b'));
	}
	Sadda(){
		System.out.println("Inside constructor"+a);
	}
	Sadda(int a){
		System.out.println("Inside constructor 2"+a);
	}
	{
		System.out.println("Instance block 2");
	}
	int Printcharint(char c,int a){
		int A = a;
		char C = c;
		return A + (int)C;
	}
	int Printcharint(int a,char c){
		int A = a;
		char C = c;
		return A + (int)C;
	}
	static{
		System.out.println("Inside Static block 2.");
	}
}	
