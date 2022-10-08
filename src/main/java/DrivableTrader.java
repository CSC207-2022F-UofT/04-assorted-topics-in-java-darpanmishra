/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;

public class DrivableTrader<T> extends Trader<Drivable> {

    public DrivableTrader (List<Drivable> inventory, List<Drivable> wishList, int money) {
        super(inventory, wishList, money);
    }

    public DrivableTrader(int money) {
        super(money);
    }



    @Override
    public int getSellingPrice (Drivable obj) {
        int superPrice = super.getSellingPrice(obj);

        if (obj instanceof Tradable) {
            return obj.getMaxSpeed() + superPrice;
        } else {
            return Tradable.MISSING_PRICE;
        }
    }


}
