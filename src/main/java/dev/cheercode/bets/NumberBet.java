package dev.cheercode.bets;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberBet extends Bet<Integer> {
    private static final BigDecimal COEFFICIENT = new BigDecimal("35");

    public NumberBet(BigInteger money, Integer value) {
        super(money, COEFFICIENT, value);
    }
}
