import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);
    AddressBook book = new AddressBook();
    Map<String, AddressBook> bookmap = new HashMap<>();

    public void addBook(String bookname){
        AddressBookMain bookMain = new AddressBookMain();
        int choice;

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
                    book.getContactdetails();
                    break;

                case 2:
                    System.out.println("***** All contact ******");
                    System.out.println(book.contactList);
                    break;

                case 3:
                    System.out.println("$$$$$ Update contact $$$$$$");
                    System.out.println("Enter the firstname for update details:");
                    String name = sc.next();
                    boolean edit = book.editContactdetalis(name);
                    if (edit)
                        System.out.println("Edited successfully");
                    else
                        System.out.println("someting went problem");
                    break;

                case 4:
                    System.out.println("Enter the first name for delete details from address book");
                    name = sc.next();
                    boolean del = book.deleteDetails(name);
                    if (del)
                        System.out.println("delete successfully");
                    else
                        System.out.println("someting went problem");
                    break;

                case 5:
                    System.exit(0);

                default: System.out.println("Enter the vallid number!!");
            }
        }
    }

    public void citySearch(String cityname){
        for (Map.Entry<String, AddressBook> entry : bookmap.entrySet()){
            AddressBook value = entry.getValue();
            System.out.println("Get Addressbook value: "+entry.getKey());
            value.searchByState(cityname);
        }
    }

    public void stateSearch(String statename){
        for (Map.Entry<String, AddressBook> entry : bookmap.entrySet()){
            AddressBook value = entry.getValue();
            System.out.println("Get Address book value: "+entry.getKey());
            value.searchByState(statename);
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to DEBDUT address book system: ");
        AddressBookMain addressBookMain = new AddressBookMain();
        boolean flag = true;
        while (flag){
            System.out.println("1. Add new Address Book");
            System.out.println("2. Search contact by city");
            System.out.println("3. Search contact by state");
            System.out.println("4. Exit");
            System.out.print("==> ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Name of address book: ");
                    String bookName = sc.next();
                    if (addressBookMain.bookmap.containsKey(bookName)){
                        System.out.println("This name of address book is already exist");
                        break;
                    }
                    else {
                        addressBookMain.addBook(bookName);
                        break;
                    }

                case 2:
                    System.out.println("Enter the name of city: ");
                    String cityname = sc.next();
                    addressBookMain.citySearch(cityname);
                    break;

                case 3:
                    System.out.println("Enter the name of state: ");
                    String statename = sc.next();
                    addressBookMain.stateSearch(statename);
                    break;

                case 4:
                    flag = false;
                    break;
            }
        }
    }
}

