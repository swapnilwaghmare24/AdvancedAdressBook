package Com.Bridgelabz.advancedadressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook=new AddressBook();
        addressBook.addContact();
        for (Contacts contact:addressBook.contacts)
        {
           System.out.println(contact);
        }
    }
}
