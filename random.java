import java.util.Random;
class testrandom{
	public static void main(String args[]){
	int number;
	Random random = new Random();
	number = random.nextInt(1000);
	System.out.println("Generated no. is :"+number);
	}
}
