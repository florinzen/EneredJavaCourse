package module2.mappractice.contactagenda;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

    private Map<String, Contact> contacts = new HashMap<>();

    public void displayContacts() {
        for(Map.Entry<String, Contact> entry : contacts.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }

    public void addContact(Contact c) {
        String email = c.getEmail();
        String telephoneNumber = c.getPhoneNumber();
        boolean isEmailValid = email.endsWith("@gmail.com")
                || email.endsWith("@yahoo.com");
        boolean isTelephoneNumberValid = telephoneNumber.length() == 10;

        if(isEmailValid && isTelephoneNumberValid) {
            System.out.println("Valid contact: " + c);
            contacts.put(c.getName(), c);
        } else {
            System.out.println("Invalid contact:" + c);
        }
    }

    public void removeContact(String key) {
        contacts.remove(key);
    }

    public Contact getContact(String key) {
        return contacts.get(key);
    }

}
