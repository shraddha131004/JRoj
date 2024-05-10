class Excep{
     public static void main(String... args) throws InterruptedException{
     	   String s = null;
     	   int data ;
     	   int nr = 2;
     	   int dr = 0;
     	   int n = 0;
     	   try{
     	   	Thread.sleep(1000);
     	   	/*System.out.println("Inside try 1.");
     	   	Thread.sleep(2000);
     	   	System.out.println("Inside try 2.");
     	   	
     	   	Thread.sleep(3000);
     	   	System.out.println(args[0]);
     	   	System.out.println(args[1]);
     	   	System.out.println(data = 22/0);
     	   	System.out.println(s.length());
     	   	
     	   	System.out.println("Inside try 3.");*/
     	   }
     	   catch(ArrayIndexOutOfBoundsException e){
     	   	System.out.println("ArrayIndexOutOfBoundsException.");
     	   	
     	   }
     	   /*catch(InterruptedException e){
     	   	System.out.println("InterruptedException .");
     	   	
     	   }*/
     	   catch(Exception e){
     	   	System.out.println("Exception supreme class.");
     	   	
     	   }
     	   finally{
     	   	System.out.println("Inside finally block.");
     	   	try{
     	   	    int c = nr/dr;
     	   	    
     	   	}
     	   	catch(Exception e){
     	            /*while(dr == 0){
     	              System.out.println("stop");
     	              n++;
     	            }n!=2;*/
     	            System.out.println("exception caught.");
     	   	}
     	   }
     	   
     }
}
