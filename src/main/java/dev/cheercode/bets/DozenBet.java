package dev.cheercode.bets;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DozenBet extends Bet<Integer> {
    private static final BigDecimal COEFFICIENT = new BigDecimal("2");

    public DozenBet(BigInteger money, Integer value) {
        super(money, COEFFICIENT, value);
    }
}
