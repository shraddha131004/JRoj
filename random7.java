class Randomnum{
	public static void main(String args[]){
		long arr[] = new long[1000000];
		long  arr2[] = new long[7];
		for(int i=0;i<1000000;i++){
			arr[i]=System.currentTimeMillis()%10000000;

		}    
		for(int i=0;i<7;i++){
			arr2[i]=System.currentTimeMillis()%10;

		}
		
		for(int i=0;i<7;i++){
			System.out.print(arr2[i]);

		}
		
		
	}
}
