import java.util.*;

public class Main {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            User fromInput = getFromInput(input);
            IO.println(fromInput.getFirstname());
        } catch (InputMismatchException e) {
            IO.println("Fehlerhafte Eingabe!");
        } catch (Exception e) {
            IO.println("Ganz übler Fehler passiert! Ooops!");
        }
    }

    private static User getFromInput(Scanner input) {
        IO.print("Geben Sie den Benutzernamen ein: ");
        String username = input.next();
        IO.print("Geben Sie den Vornamen ein: ");
        String firstname = input.next();
        IO.print("Geben Sie das Alter ein: ");
        int age = input.nextInt();

        return new User(username, firstname, age);
    }

    static void workingWithNestedHashMaps() {
        HashMap<Integer, User> users = new HashMap<Integer, User>();
        users.put(1, new User("max2002", "maximilian", 29));
    }

    static void workingWithHashMap() {
        HashMap<String, String> cars = new HashMap<String, String>();
        cars.put("key1", "Audi 80");

        IO.println(cars.get("key1"));
    }

    static void workingWithHashSet() {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Audi A4");
        cars.add("BMW X1");
        cars.add("BMW X1"); // Duplicate value, will not be added to the HashSet

        IO.println(cars.size()); // Returns 2
    }

    static void workingWithArrayList() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Mustang");
        cars.add("F-150");
        cars.add("Dodge RAM 1500");

        /*
        Version 1 with a for counter loop
         */
        for (int i = 0; i < cars.size(); i++) {
            IO.println(cars.get(i));
        }

        /*
        Version 2 with an easier for loop syntax
         */
        for (String car : cars) {
            IO.println(car);
        }
    }

    static void controlStructures() {
        boolean isMyValueTrue = false;
        if (isMyValueTrue == true) {
            IO.println("It is true");
        } else if (isMyValueTrue == false) {
            IO.println("It is false");
        } else {
            IO.println("It is something else");
        }

        int number = 2;
        switch (number) {
            case 1:
                IO.println("It is 1");
                break;
            case 2:
                IO.println("It is 2");
                break;
            default:
                IO.println("It is something else");
                break;
        }

    }

    static void loops() {
        // Single line comment
        /*
         * We want a while loop that counts down from 10 and prints out the current counter
         */
        int i = 10;
        // Kopfgesteuerte Schleife
        while (i > 0) {
            System.out.println(i);
            i--; // same as i = i - 1
        }

        int c = 10;
        // Fußgesteuerte Schleife
        do {
            System.out.println(c);
            c--;
        } while (c > 0);

        for (int d = 0; d < 10; d++) {
            System.out.println(d + 1);
        }
    }
}
