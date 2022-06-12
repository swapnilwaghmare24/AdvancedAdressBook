package Com.Bridgelabz.advancedadressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook=new AddressBook();
        addressBook.addContact();
        addressBook.addContact();
        addressBook.editContactWish();
        for (Contacts c:addressBook.contacts)
        {
           System.out.println(c);
        }
    }
}
