import java.util.Scanner;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
        int rando = (int) (Math.random() * (20 - 10)) + 10;
        //return (int) (Math.random()*11) +10;  multiplly by how many numbers want = 11 and then between 10 and 20 so add 10
        return rando;
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static void main(String[] args) {
        int r1 = randomTeen();
        int r2 = randomTeen();
        int r3 = randomTeen();
        System.out.println("The three random numbers are " + r1 + ", " + r2+ ", " + r3);
        System.out.println("Mathey.max tests");
        System.out.println(Mathey.max(r1,r2,r3));
        System.out.println(Mathey.max(r1, Mathey.max(r2,r3)));
        System.out.println(Math.min(r1, Math.min(r2,r3)));
        System.out.println(Mathey.max(1.0, 2.0)); // 2
        System.out.println(Mathey.max(1, 2)); // 2
        System.out.println(Mathey.max(2, 1)); // 2
        System.out.println(Mathey.max(1.0, 2.0, 3.5, 4.0));
        System.out.println("Mathey.randomInteger tests");
        System.out.println(Mathey.randomInteger(5));
        System.out.println(Mathey.randomInteger(10, 20));
        System.out.println("Mathey.pow tests");
        System.out.println(Mathey.pow(2, 5));
        System.out.println(Mathey.pow(3, 4));
        System.out.println("Mathey.abs tests");
        System.out.println(Mathey.abs(-2));
        System.out.println(Mathey.abs(2));
        System.out.println("Mathey.round tests");
        System.out.println(Mathey.round(2.4));
        System.out.println(Mathey.round(2.5));
        System.out.println("Mathey.floor tests");
        System.out.println(Mathey.floor(2.999999999999));
        System.out.println("Mathey.ceil tests");
        System.out.println(Mathey.ceil(2.99999));
        System.out.println(Mathey.ceil(3.01));

        System.out.println("Pythagoras");
        double a = (double)(Mathey.pow(5, 2));
        double b = (double)(Mathey.pow(12, 2));
        double csqr = a+b;
        System.out.println((int)(Mathey.sqrt(csqr)));




    }

}


