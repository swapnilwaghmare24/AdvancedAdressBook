package Com.Bridgelabz.advancedadressbook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);

        /* addressBook.addContact();
        addressBook.addContact();
        addressBook.addContact();
        addressBook.editContactWish();
        addressBook.deleteContact();
        for (Contacts c:addressBook.contacts)
        {
           System.out.println(c);
        }*/

        boolean newBook=true;

        boolean add=true;
        boolean delete=true;
        boolean edit=true;
        Map<String, List> book= new HashMap<>();
        while(newBook)
        {
            AddressBook addressBook=new AddressBook();
            System.out.println("Enter address book name");
            String addressBookName=scanner.next();
            addressBook.setAddressBookName(addressBookName);
            boolean choiceAgain=true;

            while (choiceAgain)
            {
                System.out.println("Enter 1-add contact 2-edit contact 3-delete contact 4-exit");
                int choice=scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        while (add) {
                            addressBook.addContact();
                            System.out.println("Type Y to add another contact or type any character to exit");
                            char wish = scanner.next().charAt(0);
                            if (wish == 'y' || wish == 'Y') {
                                add = true;
                            } else {
                                break;
                            }
                        }
                        for (Contacts c:addressBook.contacts)
                        {
                         System.out.println(c);
                        }
                        break;
                    case 2:
                        while (edit) {
                            addressBook.editContactWish();
                            System.out.println("Type Y to edit another contact or type any character to exit");
                            char wish = scanner.next().charAt(0);
                            if (wish == 'y' || wish == 'Y') {
                                edit = true;
                            } else {
                                break;
                            }
                        }
                        for (Contacts c:addressBook.contacts)
                        {
                            System.out.println(c);
                        }
                        break;
                    case 3:
                        while (delete) {
                            addressBook.deleteContact();
                            System.out.println("Type Y to delete another contact or type any character to exit");
                            char wish = scanner.next().charAt(0);
                            if (wish == 'y' || wish == 'Y') {
                                delete = true;
                            } else {
                                break;
                            }
                        }
                        for (Contacts c:addressBook.contacts)
                        {
                            System.out.println(c);
                        }
                        break;
                    case 4:
                        choiceAgain =false;
                        break;
                }


            }
            book.put(addressBookName,addressBook.contacts);
            System.out.println("Type Y to add another address book or type any character to exit");
            char wish = scanner.next().charAt(0);
            if (wish == 'y' || wish == 'Y') {
                newBook = true;
            } else {
                break;
            }


        }
        for (Map.Entry<String,List> entry:book.entrySet())
        {
            System.out.println("Address book name "+entry.getKey());
            System.out.println("Address book contacts "+entry.getValue());

        }

    }
}
