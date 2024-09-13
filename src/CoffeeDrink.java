// CoffeeDrink object class

class CoffeeDrink {

    public int numberOfCups;
    public String flavor;
    public boolean hasWhippedCream;

    public CoffeeDrink espresso;
    public CoffeeDrink latte;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int pnumberOfCups, String pflavor, boolean phasWhippedCream) {
        flavor = pflavor;
        numberOfCups= pnumberOfCups;
        hasWhippedCream=phasWhippedCream;
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        this.hasWhippedCream = hasWhippedCream;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {

        espresso=new CoffeeDrink(5,"Strong", false);
        espresso.printInfo();

        latte= new CoffeeDrink(1,"Milk", false);
        latte.printInfo();


        System.out.print("You ordered " + numberOfCups + " of " + flavor +
                " coffee ");
        if (hasWhippedCream) {
            System.out.println("with whipped cream.");
        } else {
            System.out.println("without whipped cream.");
        }
        // TODO
        // Make this method print order details.
        // Include information stored in each variable.

    }
}
