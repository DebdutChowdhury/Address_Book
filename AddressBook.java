import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<Contact> contactList = new ArrayList<>();

    void getContactdetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String fstname = sc.next();
        if (checkDublcate(fstname)){
            System.out.println("Its already exist");
        }
        else {
            System.out.println("Enter the last name: ");
            String lstname = sc.next();
            System.out.println("Enter the address: ");
            String address = sc.next();
            System.out.println("Enter the city: ");
            String city = sc.next();
            System.out.println("Enter the state: ");
            String state = sc.next();
            System.out.println("Enter the zip: ");
            int zip = sc.nextInt();
            System.out.println("Enter the phone number: ");
            long ph_num = sc.nextLong();
            System.out.println("Enter the email id: ");
            String eml = sc.next();

            Contact contact = new Contact(fstname, lstname, address, city, state, zip, ph_num, eml);
            contactList.add(contact);
        }
    }

    boolean editContactdetalis(String name){
        int flag = 0;
        for (Contact person : contactList){
            if (person.fstname.equals(name)){
                System.out.println("Edit all details:\nEnter the all details bellow");
                System.out.println("Enter the first name: ");
                person.fstname = sc.next();
                System.out.println("Enter the last name: ");
                person.lstname = sc.next();
                System.out.println("Enter the address: ");
                person.address = sc.next();
                System.out.println("Enter the city: ");
                person.city = sc.next();
                System.out.println("Enter the state: ");
                person.state = sc.next();
                System.out.println("Enter the zip: ");
                person.zip = sc.nextInt();
                System.out.println("Enter the phone number: ");
                person.ph_num = sc.nextLong();
                System.out.println("Enter the email id: ");
                person.eml = sc.next();
                flag = 1;
            }
        }
        return flag == 1;
    }

    boolean deleteDetails(String name){
        int flag = 0;
        for (Contact contact : contactList){
            if (contact.fstname.equals(name)){
                contactList.remove(contact);
                flag = 1;
                break;
            }
        }
        return flag == 1;
    }

    boolean checkDublcate(String fstname){
        int flag = 0;
        for (Contact list : contactList){
            if (list.fstname.equals(fstname)){
                flag = 1;
                break;
            }
        }
        return flag == 1;
    }

    void searchByCity(String cityname){
        List<Contact> list = contactList.stream().filter(contactname -> contactname.city.equals(cityname)).collect(Collectors.toList());
        for (Contact contact : contactList){
            System.out.println("Name: " + contact.fstname +" "+ contact.lstname);
        }
    }

    void searchByState(String statename){
        List<Contact> list = contactList.stream().filter(contactname -> contactname.city.equals(statename)).collect(Collectors.toList());
        for (Contact contact : contactList){
            System.out.println("Name: " + contact.fstname +" "+ contact.lstname);
        }
    }
}
