import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;


    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    public void CoffeeShop(){
        JavaBeansAndBytes();

    }


    // Constructor for CoffeeShop
    public void JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1996;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        yearFounded = 1996;
        System.out.println("We were actually founded in " + yearFounded + " :)");


        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay();
        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects
        CoffeeDrink order1 = new CoffeeDrink(1,"Espresso",false);

        CoffeeDrink order2 = new CoffeeDrink(3,"Caramel",true);

        order2.setFlavor("Choco");
        order2.getFLavor();
        System.out.println(order2.getFLavor());

        order2.setWhippedCream(true);
        System.out.println(order2.getWhippedCream());

        order2.setNumberOfCups(7);
        System.out.println(order2.getNumberOfCups());

        System.out.println();

        // TODO
        // Print out the order details
        order1.printInfo();
        order2.printInfo();

    }

    // Method to generate a random discount
    public void randomDiscount() {
        // TODO

        int discount = (int) (Math.random()*31);
        System.out.println("Discount: "+ discount+"%");
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay() {
        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        System.out.println();
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // TODO
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5


        // Print 2, 5, 8, 11


        // Print 8 to 0

    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO
        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.
    }
}

