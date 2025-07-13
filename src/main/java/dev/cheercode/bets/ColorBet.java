package dev.cheercode.bets;

import dev.cheercode.ColorSector;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ColorBet extends Bet<ColorSector.Color> {
    private static final BigDecimal COEFFICIENT = new BigDecimal("1");

    public ColorBet(BigInteger money,
                    ColorSector.Color value) {
        super(money, COEFFICIENT, value);
    }
}
