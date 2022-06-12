package Com.Bridgelabz.advancedadressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contacts> contacts=new ArrayList<>();
    Contacts contact=new Contacts();
    Scanner scanner = new Scanner(System.in);
    void addContact()
    {
     System.out.println("Enter First Name");
     String fName=scanner.next();
     contact.setFirstName(fName);
     System.out.println("Enter Last Name");
     String lName=scanner.next();
     contact.setLastName(lName);
     System.out.println("Enter Address");
     String address=scanner.next();
     contact.setAddress(address);
     System.out.println("Enter City");
     String city=scanner.next();
     contact.setCity(city);
     System.out.println("Enter State");
     String state=scanner.next();
     contact.setState(state);
     System.out.println("Enter ZIP");
     String zip=scanner.next();
     contact.setZip(zip);
     System.out.println("Enter Phone Number");
     String phone=scanner.next();
     contact.setPhoneNumber(phone);
     System.out.println("Enter Email");
     String email=scanner.next();
     contact.setEmail(email);
     contacts.add(contact);
    }
}
