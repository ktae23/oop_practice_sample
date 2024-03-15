package shop.phone;

public abstract class Phone implements Callable {

    @Override
    public void call(PhoneNumber phoneNumber) {
        System.out.println("call to " + phoneNumber);
    }
}
