import java.util.Scanner;

/**
 *  How much water runs off a roof in a rain storm?
 *
 *  To calculate the runoff from any given rainfall: Take the dimensions of the footprint of the roof and convert them
 *  to inches. (So, a 50' x 20' roof is 600" x 240"). Multiply the roof dimensions by the number of inches of rainfall.
 *  In this example, 600" x 240" x 1" = 144,000 cubic inches of water. Divide that result by 231 to get the number of
 *  gallons (because 1 gallon = 231 cubic inches). (144,000/231 = 623.38).
 *
 */
public class AmountOfWater {
    public static void main(String[] args) {
        float length, width , rainfall;

        System.out.println("Enter Length Of Roof");
        Scanner keyboard = new Scanner(System.in);
        length = keyboard.nextFloat() * 12;

        System.out.println("Enter Width Of Roof");
        width = keyboard.nextFloat() * 12;

        System.out.println("Number Of Inches Of Rain Fall");
        rainfall = keyboard.nextFloat() ;

        double water = length * width * rainfall / 231.0 ;

        System.out.printf("The amount of runs off = %.2f cubic inches",water);
    }
}
