package module2.practice.interfaces;

import module2.practice.interfaces.clothing.Clothing;
import module2.practice.interfaces.clothing.Shirt;
import module2.practice.interfaces.clothing.Trousers;
import module2.practice.interfaces.outdoors.Stove;
import module2.practice.interfaces.outdoors.StoveFuel;
import module2.practice.interfaces.outdoors.Tent;

public class MyApp {

    public static void main(String[] args) {
        Clothing c1 = new Trousers(1, 500,
                'r', 'M', 'F');
        Trousers t1 = new Trousers(2, 1000,
                'b', 'L', 'M');
        Returnable r1 = new Trousers(3, 240,
                'r', 'S', 'F');

        // c1 has access only to Clothing methods
        // t1 has access to Trousers and Clothing methods
        // r1 has access only to Returnable methods

        // However, if we only need the doReturn logic, we can simply use only Returnable references
        // Just like below:
        Returnable[] returnables = new Returnable[4];
        returnables[0] = new Trousers(4, 500,
                'r', 'M', 'F');
        returnables[1] = new Shirt(5, 500,
                'r', 'M', "Slim fit");
        returnables[2] = new Tent(6, 2500, 9, "Family");
        returnables[3] = new Stove(7, 500, 4);

        getDoReturn(returnables);

        //returnables[3] = new StoveFuel(8, 350, 2);
        // The above line, if uncommented, will generate a compilation error
        // Why? Because StoveFuel is not a Returnable
    }

    public static void getDoReturn(Returnable[] returnables) {
        for(Returnable r : returnables) {
            System.out.println(r.doReturn());
            // If for example we need to do something extra only for Trousers
            // we could make use of the instanceof operator
            if(r instanceof Trousers) {
                Trousers t = (Trousers) r; // Cast the Returnable reference to a Trousers one
                // Now we have converted the reference to a Trousers one, and we can use all
                // the methods Trousers have.
                System.out.println("The price of the trousers with id " + t.getId() + " is " + t.getPrice());
            }
        }
    }
}
