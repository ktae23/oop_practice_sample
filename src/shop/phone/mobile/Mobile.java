package shop.phone.mobile;

import shop.phone.Phone;
import shop.phone.PowerSwitch;

public abstract class Mobile extends Phone {

    protected String name;
    private final PowerSwitch powerSwitch; //컴포지션 - 합성


    public Mobile(String name) {
        this.name = name;
        this.powerSwitch = new PowerSwitch();
    }

    public void turnOn() {
        powerSwitch.turnOn();
    }

    public void turnOff() {
        powerSwitch.turnOff();
    }

    public String getName() {
        return null;
    }
}
