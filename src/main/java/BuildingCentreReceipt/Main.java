package BuildingCentreReceipt;


import java.util.LinkedList;
import java.util.List;

/**
 * Demo application of the buildin centre.
 */
public class Main {
    /**
     * Demonstrates the principle use of the classes of the building centre.<br> In main you
     *
     * <ol>
     * <li>create and display the receipt text for the shopping cart</li>
     * <li>print the receipt to file "BuildingCentreReceipt"</li>
     * <li>filter the shopping cart with search term "Brick"</li>
     * <li>sort the shoppingcart by name and display again</li>
     * </ol>
     */
    public static void main(String[] args) {

        List<BuildingCentreProductBase> shoppingCart;
        shoppingCart = new LinkedList<>();
        shoppingCart.add(new Tool("Hammer", 10.99, 2));
        shoppingCart.add(new Tool("Shovel", 23.5, 5));
        shoppingCart.add(new CraftsmanSupport("Bricklayer", 12, 85.875));
        shoppingCart.add(new Material("Brick", "Gate 23", 2.5, 45));
        shoppingCart.add(new Material("Cement bag", "Gate 27", 2.5, 345));
        // ---------------------------- YOUR CODE HERE ---------------------------

        String receiptText = receiptText(shoppingCart);
        System.out.println(receiptText);

        shoppingCart.sort(new ProductPricePerUnitComparator());

        System.out.println(receiptText(shoppingCart));

        // create and display the receipt text
        // print the receipt to file "BuildingCentreReceipt"
        // filter the shopping cart with search term "Brick"
        // sort the filtered shoppingcart by name and display again
        // -----------------------------------------------------------------------


    }

    // ---------------------------- YOUR CODE HERE ---------------------------
    private static String receiptText(List<BuildingCentreProductBase> shoppingCart) {
        StringBuilder builder = new StringBuilder("Receipt of BrickLayers Paradise");

        double total = 0;

        for (BuildingCentreProductBase product : shoppingCart) {
            builder.append("\n");
            builder.append(product.name);
            builder.append(" ");
            builder.append(product.calculatePrice());

            total += product.calculatePrice();

            if (product instanceof SelfFetchable) {
                builder.append("\n\t");
                SelfFetchable fetchable = ((SelfFetchable) product);
                builder.append("Please pick up at ");
                builder.append(fetchable.fetchFrom());
            }
        }
        builder.append("\n-------------------------------\n");
        builder.append("TOTAL: ");
        builder.append(total);
        builder.append("\nThanks for shopping");

        return builder.toString();
    }

    // -----------------------------------------------------------------------

}