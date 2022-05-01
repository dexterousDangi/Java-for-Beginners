import java.util.Scanner;

public class Exception_handling {

	public static void main(String[] args) throws InterruptedException {
			System.out.println(Thread.currentThread());
			Thread.sleep(1200);
			System.out.println(Thread.currentThread());

			String str ="pardeep";
			System.out.println(str.charAt(5));
			
			// using simple try-catch block:
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the value of n");
			int n = sc.nextInt();
			sc.close();
try {
	System.out.println(10/n);
} catch (Exception e) {
	System.out.println(e);
}	
finally {
	System.out.println("they say i'm always available");
}
	
	}
	
}
