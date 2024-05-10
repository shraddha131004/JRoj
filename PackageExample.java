//import java.util.Scanner;
import java.io.File;
class Packages{
	public static void main(String args[]){
	     Packages p = new Packages(); 
	     System.out.println("Hi...");
	     //Scanner sc = new Scanner(System.in);
	     java.util.Scanner sc = new java.util.Scanner(System.in);
	     sc.nextInt();
	     sc.nextInt();
	     char separatorChar = File.separatorChar;
        
        // Example file path
        String filePath = "home"+ separatorChar + "shraddha"+ separatorChar +"java-codes" + separatorChar + "ISE1java.docx" ;
        
	     File file = new File(filePath);
	     if (file.exists()) {
            System.out.println("File exists: " + file.getAbsolutePath());
            } 
            else {
            System.out.println("File does not exist: " + file.getAbsolutePath());
            }
	}
	

	
}
