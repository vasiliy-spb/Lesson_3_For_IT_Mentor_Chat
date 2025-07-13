package dev.cheercode.bets;

import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class Bet<T> {
    private final BigInteger money;
    private final BigDecimal coefficient;
    private final T value;

    public Bet(BigInteger money, BigDecimal coefficient, T value) {
        this.money = money;
        this.coefficient = coefficient;
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public BigInteger getMoney() {
        return money;
    }

    public BigDecimal getCoefficient() {
        return coefficient;
    }

    @Override
    public String toString() {
        return "Bet{" +
                "money=" + money +
                ", coefficient=" + coefficient +
                ", value=" + value +
                '}';
    }
}
