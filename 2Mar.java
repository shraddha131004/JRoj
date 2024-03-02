class A{
	int x;
	A(){
		this.x = 10;
		System.out.println(x);
	}
	A(int x){
		this.x = x;
		System.out.println(x);
	}
	A(A a){
		this.x = a.x;
		System.out.println(x);
	}
	public static void main(String args[]){
		A a = new A(); // default constructor
		A b = new A(20);//parametrized
		A c = new A(a);//copy
		
	}
}
