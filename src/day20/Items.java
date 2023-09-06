package day20;

public class Items {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        int indexNumberOfGloves = 0;
        boolean ipadHas = false;
        String report = "";


        for (int i = 0; i < itemIDs.length; i++) {
            String itemName = items[i];
            double price = prices[i];
            int itemsId = itemIDs[i];


            if (itemName.equals("Gloves")) {
                indexNumberOfGloves = i;
            }

            if (itemName.equals("iPad")) {
                ipadHas = true;
            }

            report += itemName + "  -$" + price + "  -#" + itemsId + "\n";


        }

        System.out.println("Index number of gloves=" + indexNumberOfGloves);
        System.out.println("Has iPad: " + ipadHas);

        System.out.println(report);


    }
}
/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
        name - price - #ID*/
