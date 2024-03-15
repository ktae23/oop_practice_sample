package shop;

import java.math.BigDecimal;

public class Money {
    private BigDecimal value;

    public Money(Long value) {
        this.value = BigDecimal.valueOf(value);
    }

    public BigDecimal getValue() {
        return value;
    }
}
