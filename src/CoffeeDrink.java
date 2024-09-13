// CoffeeDrink object class

class CoffeeDrink {

    private int numberOfCups;
    private String flavor;
    private boolean hasWhippedCream;

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

        numberOfCups= pnumberOfCups;
        flavor= pflavor;
        hasWhippedCream= phasWhippedCream;

    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {

        espresso=new CoffeeDrink(5,"espresso", false);
        espresso.printInfo();

        latte= new CoffeeDrink(1,"Milk", false);
        latte.printInfo();


        System.out.print("Number of Cups " + numberOfCups + " Flavor: " + flavor + " Whipped Cream: "+ hasWhippedCream);

        // TODO
        // Make this method print order details.
        // Include information stored in each variable.

    }

    public void setFlavor(String flavor){
        this.flavor=flavor;
        if (flavor.equals("hot sauce")){
            this.flavor=flavor;
        }else {
            System.out.println("flavor not allowed");
        }
    }

    public String getFLavor(){
        return flavor;
    }

    public void setWhippedCream(boolean WhippedCream){
        this.hasWhippedCream = WhippedCream;
    }

    public boolean getWhippedCream(){
        return hasWhippedCream;
    }

    public void setNumberOfCups(int NumberOfCups){
        this.numberOfCups = NumberOfCups;
    }

    public int getNumberOfCups(){
        return numberOfCups;
    }
}
