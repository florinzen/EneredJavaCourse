package module3.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        String descriptionFilter = "Palas Mall";
        for(Account a : user.accounts) {
            if(a.transactions != null) {
                for( Transaction t : a.transactions) {
                    if(t.description != null) {
                        if(t.description.contains(descriptionFilter)) {
                            System.out.println("Matched transaction: " + t);
                        }
                    }
                }
            }
        }

        Optional<String> empty = Optional.empty();
        boolean isPresent = empty.isPresent();
        assert !isPresent;

        String name = "some name";
        Optional<String> opt = Optional.of(name);
        assert opt.isPresent();

        if(name != null) {
            System.out.println(name.length());
        }

        Optional<String> optional = Optional.of("Honda");
        optional.ifPresent(carName -> System.out.println(carName.length()));

        String nullName = null;
        String someName = Optional.ofNullable(nullName).orElse("john");
        assert "john".equals(name);

        String anotherNullName = null;
        String result = Optional.ofNullable(anotherNullName).orElseThrow(IllegalArgumentException::new);
    }
}
