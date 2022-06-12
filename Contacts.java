package Com.Bridgelabz.advancedadressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contacts {
    List<Contacts> contacts=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public void editContact() {
        Contacts contact=new Contacts();
        System.out.println("Enter First Name");
        String fName=scanner.next();
        setFirstName(fName);
        System.out.println("Enter Last Name");
        String lName=scanner.next();
        setLastName(lName);
        System.out.println("Enter Address");
        String address=scanner.next();
        setAddress(address);
        System.out.println("Enter City");
        String city=scanner.next();
        setCity(city);
        System.out.println("Enter State");
        String state=scanner.next();
        setState(state);
        System.out.println("Enter ZIP");
        String zip=scanner.next();
        setZip(zip);
        System.out.println("Enter Phone Number");
        String phone=scanner.next();
        setPhoneNumber(phone);
        System.out.println("Enter Email");
        String email=scanner.next();
        setEmail(email);
        contacts.add(contact);
    }
    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
