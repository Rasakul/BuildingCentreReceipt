package BuildingCentreReceipt;

public class Material extends BuildingCentreProductBase implements SelfFetchable {

    private int count;
    static int MAXIMUM_AMOUNT_TO_DELIVER;
    private String selfFetchStorage;

    Material(Material o) {
        super(o);
        this.count = o.count;
        this.selfFetchStorage = o.selfFetchStorage;
    }

    Material(String name, String selfFetchStorage, double price, int count) {
        super(name, price);
        this.count = count;
        this.selfFetchStorage = selfFetchStorage;
    }

    @Override
    public double calculatePrice() {
        return price*count;
    }

    @Override
    public String fetchFrom() {
        return selfFetchStorage;
    }
}
