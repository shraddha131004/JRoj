class THIS{
	int i ;
	THIS(int i){
		this.i = i;
	}
	String print(){
		return "i = "+ i;
	}
	int add(int x,int ...c){
		System.out.println(c[0]);
		int sum = 0;
		for(int i:c){
			sum = sum + i;
		}
		return sum;
	}
	public static void main(String args[]){
		THIS aa = new THIS(6);
		System.out.println(aa.print());
		System.out.println(aa.add(1,2,3));
	}
}
