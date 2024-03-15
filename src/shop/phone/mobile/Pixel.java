package shop.phone.mobile;

import shop.Item;

public class Pixel extends Mobile implements Item {

    private static final String NAME = "픽셀폰";

    public Pixel() {
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
