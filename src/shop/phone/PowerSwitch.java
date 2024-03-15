package shop.phone;

public class PowerSwitch implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("★★★ 폰 켜지는 중 ★★★");
    }

    @Override
    public void turnOff() {
        System.out.println("★★★ 폰 꺼지는 중 ★★★");
    }
}
