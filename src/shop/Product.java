package shop;

public class Product implements Sellable {

    private Item item;

    public Product(Item item) {
        this.item = item;
    }

    public String getName() {
        return item.getName();
    }

    public Item getItem() {
        return item;
    }

    @Override
    public void sell() {
        System.out.println(item.getName() + "이 판매 되었습니다.");
    }

}
