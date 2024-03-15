package shop.custormer;

import shop.Item;
import shop.Money;
import shop.Sellable;

public interface Purchasable {
    Item purchase(Sellable product, Money money);
}
