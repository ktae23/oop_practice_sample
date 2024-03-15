package shop.phone.mobile;

import shop.Item;

public class Galaxy24 extends Mobile implements Item {

    private static final String NAME = "삼송폰";

    public Galaxy24() {
        super(NAME);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }
}
