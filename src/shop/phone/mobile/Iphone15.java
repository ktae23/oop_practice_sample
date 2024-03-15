package shop.phone.mobile;

import shop.Item;

public class Iphone15 extends Mobile implements Item {

    private static final String NAME = "사과폰";

    public Iphone15() {
        super(NAME);
    }

    @Override
    public String getName() {
        return NAME;
    }
}
