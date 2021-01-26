import java.util.*;

class Contact {
	private String fstname;
	private String lstname;
	private String address;
	private String city;
	private String eml;
	private String state;
	private int zip;
	private long ph_num;
	
	
	
	@Override
	public String toString() {
		return "Contact [fstname=" + fstname + ", lstname=" + lstname + ", address=" + address + ", city=" + city
				+ ", eml=" + eml + ", state=" + state + ", zip=" + zip + ", ph_num=" + ph_num + "]";
	}



	public Contact(String fstname, String lstname, String address, String city, String eml, 
					String state,int zip, long ph_num) {
		super();
		this.fstname = fstname;
		this.lstname = lstname;
		this.address = address;
		this.city = city;
		this.eml = eml;
		this.state = state;
		this.zip = zip;
		this.ph_num = ph_num;
	}
	
	
	
public String getFstname() {
		return fstname;
	}

	public void setFstname(String fstname) {
		this.fstname = fstname;
	}

	public String getLstname() {
		return lstname;
	}

	public void setLstname(String lstname) {
		this.lstname = lstname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEml() {
		return eml;
	}

	public void setEml(String eml) {
		this.eml = eml;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getPh_num() {
		return ph_num;
	}

	public void setPh_num(long ph_num) {
		this.ph_num = ph_num;
	}

}

public class AddressBook {
		
	public static void main(String[] args) {
		
		String eml;
		String fstname =null;
		String lstname;
		String address;
		String city;
		String state;
		int zip;
		long ph_num; 
		Scanner sc = new Scanner(System.in);
		Contact ct[] = new Contact[100];
		int i, j=0, choice=0, cbk=0;
		
		while(true) {
				System.out.println("######## Welcome to Debdut's Address Book ######## ");
				System.out.println("1. Add contact");
				System.out.println("2. Show All");
				System.out.println("3. update contact");
				System.out.println("4. Delete contact");
				System.out.println("5. Exit");
				System.out.println("Please enter choice number: ");
				System.out.print("==> ");
				choice = sc.nextInt();
				switch(choice) {
				
				case 1:
					System.out.println("Add contact");
					System.out.println("Enter all things thats given bellow:");
					cbk = sc.nextInt();
					for(i=0; i<cbk; i++)
					{
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
						ct[j++] = new Contact(eml, fstname, lstname, address, city, state, zip, ph_num);
						System.out.println("Added contact successfully...");
						System.out.println(" ");
						break;
					}
					break;
					
				case 2: 
					System.out.println("***** All contact ******");
					System.out.println(" ");
					for (i=0; i<j; i++)
					{
						System.out.println(ct[i]);
					}
					break;
					
				case 3: 
					System.out.println("$$$$$ Update contact $$$$$$");
					System.out.println("Enter ph number for update: ");
					ph_num = sc.nextLong();
					for (i=0; i<=j; i++)
					{
						if (ct[i].getPh_num() == ph_num && ct[i] != null)
						{
							System.out.println("Enter the first name:");
							fstname = sc.next();
							ct[i].setFstname(fstname);
							System.out.println("Enter the last name:");
							lstname = sc.next();
							ct[i].setLstname(lstname);
							System.out.println("Enter the address:");
							address = sc.next();
							ct[i].setAddress(address);
							System.out.println("Enter the city:");
							city = sc.next();
							ct[i].setCity(city);
							System.out.println("Enter the state:");
							state = sc.next();
							ct[i].setState(state);
							System.out.println("Enter the zip:");
							zip = sc.nextInt();
							ct[i].setZip(zip);
							System.out.println("Enter the email id:");
							eml = sc.next();
							ct[i].setEml(eml);
							System.out.println("Your contact is now updated through phone number..."+ph_num);
						}
					}
					break;
					
				case 4: 
					System.out.println("Delete the contact details");
					System.out.println(" ");
					System.out.println("Enter phone number for deletion : ");
					ph_num= sc.nextLong();
					for(i=0;i<=j;i++)
					{
						if (ct[i] != null && ct[i].getPh_num() == ph_num) {
							ct[i] = null;
							System.out.println("Contact deleted successfully...");
						}
					}
					
				case 5:
					System.exit(0);
					
				default: System.out.println("Enter vallid number");
				}
		}
	}

}
