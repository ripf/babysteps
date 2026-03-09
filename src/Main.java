import java.util.Arrays;

public class Main {
    static void main() {
        //loops();
        //controlStructures();
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
