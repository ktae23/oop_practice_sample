import user.MobileUser;
import shop.Item;
import shop.Money;
import shop.Product;
import shop.custormer.Customer;
import shop.phone.mobile.Mobile;
import shop.phone.mobile.Pixel;

/**
 * 재용님이 삼송폰을 샀습니다.
 * 재용님이 삼송폰을 켰습니다.
 * ★★★ 폰 켜지는 중 ★★★
 * <p>
 * <p>
 * 잡스님이 사과폰을 샀습니다.
 * 잡스님이 사과폰을 켰습니다.
 *
 * @@@ 폰 켜지는 중 @@@
 */

/**
 * 1. 행위를 식별
 * 2. 행위에 필요한 데이터 식별
 * 3. 행위와 데이터를 한데 묶어 객체 설계
 */
public class Main {
    public static void main(String[] args) {
        String name = "경태";

        Customer customer = new Customer(name);
        Mobile mobile = new Pixel();
        Product product = new Product((Item) mobile);

        Item item = customer.purchase(product, new Money(100_000L));
        MobileUser mobileUser = new MobileUser(name, (Mobile) item);

        mobileUser.turnOn();
        mobileUser.turnOff();
    }
}

/**
 * 1. 요구사항에 나온 행위를 식별
 * * 구매하다
 * * 판매하다
 * * 전원을 키다
 *
 * 2. 행위에 필요한 데이터 식별
 * * 구매할때는 구매하려는 제품과 돈이 필요
 * * 전원을 켤때는 전원을 키는 사람과 켜지는 제품이 필요
 *
 * 3. 객체 설계
 * * 구매가 가능한 Customer - purchase(Product, Money)
 * * 판매 될 수 있는 Product - sell()
 * * 전원이 켜지고 꺼지는 Mobile - turnOn()
 * * Mobile을 다룰 수 있는 MobileUser - turnOn()
 */