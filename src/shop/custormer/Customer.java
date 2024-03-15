package shop.custormer;

import shop.Item;
import shop.Money;
import shop.Sellable;

public class Customer implements Purchasable {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public Item purchase(Sellable sellable, Money money) {
        System.out.println(String.format("%s님이 %s를 %f에 샀습니다.", name, sellable.getName(), money.getValue()));
        sellable.sell();
        return sellable.getItem();
    }

}
