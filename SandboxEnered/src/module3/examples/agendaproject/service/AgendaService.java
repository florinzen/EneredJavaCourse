package module3.examples.agendaproject.service;

import module3.examples.agendaproject.exception.InvalidDomainException;
import module3.examples.agendaproject.exception.InvalidPhoneNumberException;
import module3.examples.agendaproject.model.Agenda;
import module3.examples.agendaproject.model.Contact;

public class AgendaService {

    private Agenda agenda;

    public AgendaService() {
        agenda = new Agenda();
    }

    public Contact getContact(int index) {
        return agenda.getContacts().get(index);
    }

    public void addContact(Contact c) throws InvalidPhoneNumberException ,InvalidDomainException{
        boolean isEmailValid = false;
        String email = c.getEmailAddress();
        if(email.endsWith("@gmail.com") ||
                email.endsWith("@yahoo.com")) {
            isEmailValid = true;
        }

        String phoneNumber = c.getPhoneNumber();

        try {
            Integer.parseInt(phoneNumber);
        } catch (NumberFormatException e) {
            throw new InvalidPhoneNumberException("Numbarul de telefon este invalid!");
        }

        if(!isEmailValid) {
            throw new InvalidDomainException("Domeniul nu este valid!");
        }

        agenda.getContacts().add(c);
    }
}
