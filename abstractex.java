abstract class Sample{
      abstract void fun();
      final int add(int x,int y){
      		return x+y;
      }
     
     // public static void main(String args[]){
     // 	  Sample s1 = new Sample(); 
     // }
}
class Sample2 extends Sample{
      void fun(){
           System.out.println("class sample2");
      }
      //int add(int x,int y){
      //    return x+y;
      //}
}
class Sample3 extends Sample{
      void fun(){
           System.out.println("class sample3");
      }
}
class Main{
      public static void main(String[] args){
      	    Sample2 s1 = new Sample2();
            s1.add(12,13);
            s1.fun();
            Sample3 ss1 = new Sample3();
            ss1.add(13,13);
            ss1.fun();
      }	
}
