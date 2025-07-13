package dev.cheercode.bets;

import java.math.BigDecimal;
import java.math.BigInteger;

public class EvenOddBet extends Bet<EvenOddBet.Parity> {
    private static final BigDecimal COEFFICIENT = new BigDecimal("1");

    public EvenOddBet(BigInteger money, Parity value) {
        super(money, COEFFICIENT, value);
    }

    public enum Parity {
        EVEN,
        ODD;
    }
}
