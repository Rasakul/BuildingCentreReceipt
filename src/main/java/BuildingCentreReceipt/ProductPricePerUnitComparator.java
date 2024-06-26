package BuildingCentreReceipt;

import java.util.Comparator;

public class ProductPricePerUnitComparator implements Comparator<BuildingCentreProductBase> {
    @Override
    public int compare(BuildingCentreProductBase o1, BuildingCentreProductBase o2) {
        return Double.compare(o1.price, o2.price);
    }
}
