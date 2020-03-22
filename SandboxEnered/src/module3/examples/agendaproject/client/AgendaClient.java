package module3.examples.agendaproject.client;

import module3.examples.agendaproject.model.Contact;
import module3.examples.agendaproject.service.AgendaService;

public class AgendaClient {

    public static void main(String[] args) {
        AgendaService a = new AgendaService();

        Contact myContact = new Contact("Vasile",
                "vasile@gmail.com", "12345");

        Contact invalidEmailContact = new Contact("Sorin",
                "sorin@outlook.com", "12345");

        try {
            a.addContact(myContact);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            a.addContact(invalidEmailContact);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(a.getContact(0));

        Contact phoneNumberInvalid = new Contact("Vasile",
                "vasile@gmail.com", "abcd12345");


        try {
            a.addContact(phoneNumberInvalid);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
