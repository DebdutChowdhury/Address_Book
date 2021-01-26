import java.util.*;
class Contact {
	static String fstname;
	static String lstname;
	static String address;
	static String city;
	static String eml;
	static int zip;
	static long ph_num;
	
	
	void insert() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the email id: ");
		eml = sc.nextLine();
		
		System.out.println("Enter the first name: ");
		fstname = sc.nextLine();
		
		System.out.println("Enter the last name: ");
		lstname = sc.nextLine();
		
		System.out.println("Enter the address: ");
		address = sc.nextLine();
		
		System.out.println("Enter the city: ");
		city = sc.nextLine();
		
		System.out.println("Enter the zip: ");
		zip = sc.nextInt();
		
		System.out.println("Enter the ph number: ");
		ph_num = sc.nextLong();
		
		
		sc.close();
		System.out.println("");
		System.out.println("First Name: "+fstname);
		System.out.println("Last Name: "+lstname);
		System.out.println("Address: "+address);
		System.out.println("City: "+city);
		System.out.println("Zip: "+zip);
		System.out.println("Phone Number: "+ph_num);
		System.out.println("Email: "+eml);
	}
}
	
public class AddressBook {
	public static void main(String[] args) {
		
		Contact c = new Contact();
		c.insert();
	}

}
