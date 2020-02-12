package module2.mappractice.contactagenda;

public class Main {

    public static void main(String[] args) {
      Contact c1 = new Contact("Vasile", "vasile@gmail.com", "0741092830");
        Contact c2 = new Contact("Robert", "robert@gmail.com", "0744216830");
        Contact c3 = new Contact("Cosmina", "cosmina@gmail.com", "0744246130");
        Contact c4 = new Contact("Irina", "irina@gmail.com", "0721532921");

        Agenda agenda = new Agenda();
        agenda.addContact(c1);
        agenda.addContact(c2);
        agenda.addContact(c3);
        agenda.addContact(c4);

        agenda.displayContacts();
    }
}
