package BuildingCentreReceipt;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<BuildingCentreProductBase> {
    @Override
    public int compare(BuildingCentreProductBase o1, BuildingCentreProductBase o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
