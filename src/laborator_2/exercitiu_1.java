package laborator_2;
import java.util.Scanner;

public class exercitiu_1 {
    public static void msg() {
        float degree_fahrenheit;
        float degree_celsius;

        // Create a Scanner object to read input.
        Scanner console = new Scanner(System.in);

        // Get degree from the user.
        System.out.print("Enter degree in fahrenheit ");
        degree_fahrenheit = console.nextInt();

        // Display degree in celsius
        degree_celsius = (float) 5 / 9 * ( degree_fahrenheit - 32 );

        System.out.println(degree_fahrenheit + " degree Fahrenheit is equal to " + degree_celsius + " in Celsius.");
    }
}
