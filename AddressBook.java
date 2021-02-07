import java.util.*;
public class AddressBook {
	ArrayList<ContactList> list = null;
	AddressBook() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void adduserData() {
		System.out.println("Enter the First name:");
		String fstname = sc.next();
		System.out.println("Enter the Last name:");
		String lstname = sc.next();
		System.out.println("Enter the Address:");
		String address = sc.next();
		System.out.println("Enter the city name:");
		String city = sc.next();
		System.out.println("Enter the state name:");
		String state = sc.next();
		System.out.println("Enter the zip:");
		int zip = sc.nextInt();
		System.out.println("Enter the phone number:");
		long ph_num = sc.nextLong();
		System.out.println("Enter the email address:");
		String eml = sc.next();
		
		list.add(new ContactList(fstname, lstname, address, city, state, zip, ph_num, eml));
	}
	
	public void editData(ContactList contact) {
		System.out.println("Enter the First name:");
		contact.fstname = sc.next();
		System.out.println("Enter the Last name:");
		contact.lstname = sc.next();
		System.out.println("Enter the Address:");
		contact.address = sc.next();
		System.out.println("Enter the city name:");
		contact.city = sc.next();
		System.out.println("Enter the state name:");
		contact.state = sc.next();
		System.out.println("Enter the zip:");
		contact.zip = sc.nextInt();
		System.out.println("Enter the phone number:");
		contact.ph_num = sc.nextLong();
		System.out.println("Enter the email address:");
		contact.eml = sc.next();
	}
	
	public void deleteData(ContactList contact) {
		
		list.remove(contact);
	}
	
	public static void addressManu(){
		int choice;
		AddressBook book = new AddressBook();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("######## Welcome to Debdut's Address Book ######## ");
			System.out.println("1. Add contact");
			System.out.println("2. Show All");
			System.out.println("3. Update contact");
			System.out.println("4. Delete contact");
			System.out.println("5. Exit");
			System.out.println("Please enter choice number: ");
			System.out.print("==> ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: 
				book.adduserData();
				break;
				
			case 2:
				System.out.println("***** All contact ******");
				System.out.println(book.list);
				break;
				
			case 3: 
				System.out.println("$$$$$ Update contact $$$$$$");
				System.out.println("Enter the firstname for update details:");
				String name = sc.next();
				ArrayList<ContactList> foredit = book.list;
				for(int i = 0; i < foredit.size(); i++) {
					if(foredit.get(i).fstname.equals(name)) {
						ContactList edit = foredit.get(i);
						book.editData(edit);
					}
					else
						System.out.println("Something Problem");
						
				}
				break;
				
			case 4:
				System.out.println("Enter the first name for delete details from address book");
				name = sc.next();
				ArrayList<ContactList> fordel = book.list;
				for(int i = 0; i < fordel.size(); i++) {
					if(fordel.get(i).fstname.equals(name)) {
						ContactList del = fordel.get(i);
						book.deleteData(del);
					}
				}
				break;
				
			case 5: 
				System.exit(0);
				
			default: System.out.println("Enter the vallid number!!");
			}
		}
	}
	
	public static void main(String[] args) {
		addressManu();
	}
}














