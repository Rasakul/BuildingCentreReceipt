package BuildingCentreReceipt;

/**
 * The service of hiring a craftman to help with building as a product in the
 * building centre.<br>
 * Craftmen can be hired on an houerly basis with a certain hourly rate.
 */
public class CraftsmanSupport extends BuildingCentreProductBase {
	/**
	 * The number of hours this service is hired for.<br>
	 * Defaults to a minimum of one hour.
	 */
	private int hours = 1;

	/**
	 * Constructs a craftman supprt of a specific type for a specified number of
	 * hours at a specified hourly rate.
	 * 
	 * 
	 * @param craftsmanType the type of craftman hired
	 * @param hours         the number of hours of this support
	 * @param pricePerUnit  the hourly rate for this support in EUR/h
	 * 
	 * @ProgrammingProblem.Hint call the super constructor
	 * @ProgrammingProblem.Hint call the final setter for the hours
	 */
	public CraftsmanSupport(String craftsmanType, int hours, double pricePerUnit) {
		super(craftsmanType, pricePerUnit);
		setHours(hours);
	}

	/**
	 * set the duration of this support.<br>
	 * in case of illegal arguments, a warning is printed and the hours are set to
	 * default
	 * 
	 * @param hours the number of hours to set
	 */
	private final void setHours(int hours) {
		if (hours > 0)
			this.hours = hours;
		else {
			System.out.printf("WARNING: cannot set hours to %d. Defaulting to 1", hours);
			this.hours = 1;
		}
	}


	/**
	 * calculates the price of this support as duration times rate.
	 */
	@Override
	public double calculatePrice() {
		return this.price * this.hours;
	}

	/**
	 * String representation of this support.<br>
	 * The string representation includes type, price per hour, total price,and nmber of hours.
	 * 
	 */
	@Override
	public String toString(){
		return String.format("%s %d hours", super.toString(), hours);
	}
}
