class Exam{
    static{
    	System.out.println("Static block 1:EXAM");
    	
    }
    Exam(){
    	System.out.println("EXAM Constructor");
    }
    {
    	System.out.println("Init Block:EXAM");
    }
    static{
    	System.out.println("Static block 2:EXAM");
    	
    }
}
class MidTerm extends Exam{
    static{
    	System.out.println("Static Block 1:MidTERM");
    }
    MidTerm(){
    	System.out.println("MIDTERM Constructor");
    }
    public String toString(){
    	return "MiDTERm";
    }
    static{
    	System.out.println("Static Block 2:MIDTERM");
    }
    public static void main(String args[]){
    	System.out.println("Welcome to Mid Term Examinattion.");
    	Exam exam = new Exam();
    	MidTerm javaProgramming = new MidTerm();
    	System.out.println(javaProgramming);
    }
    {
    	System.out.println("Init Block:MIDTERM");
    }
}
