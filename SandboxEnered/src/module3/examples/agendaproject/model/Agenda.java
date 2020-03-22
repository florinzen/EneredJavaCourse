package module3.examples.agendaproject.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contact> contacts;

    public Agenda() {
        contacts = new ArrayList<>();
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
