package user;

import shop.phone.mobile.Mobile;

public class MobileUser {

    private String name;
    private Mobile mobile;

    public MobileUser(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public void turnOn() {
        System.out.println(String.format("%s님이 %s을 켰습니다.", name, mobile.getName()));
        mobile.turnOn();
    }

    public void turnOff() {
        System.out.println(String.format("%s님이 %s을 껐습니다.", name, mobile.getName()));
        mobile.turnOff();
    }
}
