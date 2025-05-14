package has_a_relation;
import java.util.Scanner;
public class MainClass2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Mobile Number");
		Long mobilenum=sc.nextLong();
		
		System.out.println("Enter Name");
		String name=sc.next();
		
		System.out.println("Enter Email");
		String email=sc.next();
		
		System.out.println("Enter Image Type");
		String type=sc.next();
		
		System.out.println("Enter Image size");
		int size=sc.nextInt();
		
		System.out.println("Enter Image resolution");
		int resolution=sc.nextInt();
		
		Whatsapp w=new Whatsapp(mobilenum, name, email, new Image(type, size, resolution));
		System.out.println("----------------------------------");
			w.displayInfo();
			
			System.out.println("----------------------------------");
			w.generateChat();
			w.generateVideoCall();
			System.out.println("----------------------------------");
		
	}
	
	

}
