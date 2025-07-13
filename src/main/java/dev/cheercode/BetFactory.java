package dev.cheercode;

import dev.cheercode.bets.Bet;
import dev.cheercode.bets.ColorBet;
import dev.cheercode.bets.NumberBet;

import java.math.BigInteger;

public class BetFactory {
    public static final String RED = "red";
    public static final String BLACK = "black";
    public final Roulette roulette;

    public BetFactory(Roulette roulette) {
        this.roulette = roulette;
    }

    public Bet get(BigInteger money, String key) {
        if (isColorBet(key)) {
            ColorSector.Color color = toColor(key);
            return new ColorBet(money, color);
        }
        if (isNumberBet(key)) {
            int number = Integer.parseInt(key);
            if (roulette.contains(number)) {
                return new NumberBet(money, number);
            }
        }
        throw new IllegalArgumentException("Unknown bet key: " + key);
    }

    private ColorSector.Color toColor(String key) {
        if (key.equalsIgnoreCase(RED)) {
            return ColorSector.Color.RED;
        }
        if (key.equalsIgnoreCase(BLACK)) {
            return ColorSector.Color.BLACK;
        }
        throw new IllegalArgumentException("Unknown color key: " + key);
    }

    private boolean isColorBet(String key) {
        return key.equalsIgnoreCase(RED) || key.equalsIgnoreCase(BLACK);
    }


    private boolean isNumberBet(String key) {
        try {
            Integer.parseInt(key);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}


/*

red
34
dozen2
line


 */