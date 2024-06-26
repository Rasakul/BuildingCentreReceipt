package BuildingCentreReceipt;

/**
 * A product in the building centre. A product is anything that is offered for sale including physical items and
 * services.
 * <br>
 * This class is the base class of all products in the building centre.
 * <br>
 * Naturally, products are sorted by (total) price.
 */
public abstract class BuildingCentreProductBase implements Comparable<BuildingCentreProductBase> {
    BuildingCentreProductBase
            (java.lang.String name, double pricePerUnit) {
        this.name = name;
        this.price = pricePerUnit;
    }

    /**
     * copy constructor
     *
     * @param orig the product to copy
     */
    BuildingCentreProductBase(BuildingCentreProductBase orig) {
        this.name = orig.name;
        this.price = orig.price;
    }

    /**
     * the price per unit of this product, defaults to 1
     */
    protected double price;

    /**
     * the name of this product
     */
    protected String name;

    /**
     * Get the name of this product.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * calculates the price of this product. The actual calculation is performed in concrete subclasses.
     *
     * @return the price of this product in euro (EUR)
     */
    public abstract double calculatePrice();

    /**
     * String representation of this product.<br> The string representation includes name, price per unit and total
     * price.
     */
    @Override
    public String toString() {
        return "BuildingCentreProductBase [price per unit=" + price + ", name=" + name + ", total price="
                + calculatePrice() + "]";
    }

    // ---------------------------- YOUR CODE HERE ---------------------------
    @Override
    public int compareTo(BuildingCentreProductBase o) {
        if (price < o.price) return -1;
        if (price == o.price) return 0;
        else return 1;
    }

    public double getPricePerUnit() {
        return this.price;
    }

    public BuildingCentreProductBase price(double price) {
        if (price > 0) {
            this.price = price;
        }
        return this;
    }

    // -----------------------------------------------------------------------
}
