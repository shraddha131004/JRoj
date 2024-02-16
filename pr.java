class Prime{
	public static void main(String args[]){
		System.out.println(fun());
		
	}
	public static int fun(){
		long starttime = System.nanoTime();
		int arr[] = {1,3,19,17,15};
		int count = 0;
		int prime = 0;
		for(int i=0;i<5;i++){
			for(int j=1;j<=arr[i];j++){
				if(arr[i]%j == 0){
				count++;
				}
			}
			if(count<2){
			System.out.println(arr[i]);
			}
			else{
			//System.out.println(arr[i]);
			prime++;
			}
		}
		long endtime = System.nanoTime();
		long time = (endtime - starttime);
		System.out.println("Time in nanosecs:"+time);
		return prime;
	}
}
