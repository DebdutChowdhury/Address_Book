import java.util.*;
public class AddressBook {

	public static void main(String[] args) {
		
		display();
	}
	
	public static void addcontact(String fstname, String lstname, String address, String city, String email, 
			String state,int zip, long ph_num) {
		System.out.println("First Name: "+fstname);
		System.out.println("Last Name: "+lstname);
		System.out.println("Address: "+address);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Zip: "+zip);
		System.out.println("Email: "+email);
		System.out.println("Phone number: "+ph_num);
		System.out.println(" ");
		System.out.println("Adding all details");
		System.out.println("Successfully added all contact details");
	}
	
	public static void display() {
		Scanner sc = new Scanner(System.in);
		String eml;
		String fstname;
		String lstname;
		String address;
		String city;
		String state;
		int zip;
		long ph_num;
		System.out.println("######## Welcome to Debdut's Address Book ######## ");
		System.out.println("1. Add contact");
		System.out.println("2. Exit");
		System.out.println("Please enter choice number: ");
		System.out.print("==> ");
		
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: 
			System.out.println("Add contacts here bellow:");
			System.out.println(" ");
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
			System.out.println("Enter the state: ");
			state = sc.nextLine();
			System.out.println("Enter the zip: ");
			zip = sc.nextInt();
			System.out.println("Enter the phone number: ");
			ph_num = sc.nextLong();
			
			addcontact(fstname, lstname, address, city, eml, state, zip, ph_num);
			break;
			
		case 2: 
			System.exit(0);
			
			break;
					
		default: 
			System.out.println("Please enter a vallid number");
		}
	}

}
