package BuildingCentreReceipt;

/**
 * A number of tools as physical objects which can be purchased as products in
 * the building centre.<br>
 * 
 * This class represents one or more items of a specific tool.
 * Tools are shipped at fixed shipping costs of 10 EUR per item.
 * 
 */
public class Tool extends BuildingCentreProductBase {

	/**
	 * The shipping costs of 10 EUR per item.
	 */
	public static final int SHIPPING_COSTS_PER_ITEM = 10;
	/**
	 * the number of items
	 */
	private int count;

	/**
	 * Constructs a specified number of tools with a specified price and name.<br>
	 * 
	 * @param toolName the name of this tool
	 * @param price    the price per unit of this tool
	 * @param count    the number of tools
	 */
	public Tool(String toolName, double price, int count) {
		super(toolName, price);
		this.count = count;
	}

	/**
	 * copy constructor<br>
	 * calls the super constructor
	 * @param orig the tool to copy
	 * @ProgrammingProblem.Hint call the super constructor
	 */
	public Tool(Tool orig){
		super(orig);
		this.count = orig.count;
	}

	/**
	 * calculate the price of this tools as count times price per item.
	 */
	@Override
	public double calculatePrice() {
		return this.count * this.price;
	}

	/**
	 * String representation of this tool.<br>
	 * The string representation includes toolname, price per unit, total price count and shippingcosts.
	 * 
	 */
	@Override
	public String toString(){
		return String.format("%s %d pieces, ", super.toString(), count);
	}
}
