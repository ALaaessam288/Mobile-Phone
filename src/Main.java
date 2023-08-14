public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("1234567890");

        Contact bob = Contact.createContact("Bob", "31415926");
        Contact alice = Contact.createContact("Alice", "16180339");

        mobilePhone.addNewContact(bob);
        mobilePhone.addNewContact(alice);

        mobilePhone.printContacts();

    }
}