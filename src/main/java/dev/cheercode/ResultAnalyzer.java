package dev.cheercode;

import dev.cheercode.bets.Bet;
import dev.cheercode.bets.ColorBet;
import dev.cheercode.bets.NumberBet;

public class ResultAnalyzer {
    private final Roulette roulette;

    public ResultAnalyzer(Roulette roulette) {
        this.roulette = roulette;
    }

    public boolean isWin(Bet bet, Sector winSector) {
        if (bet instanceof ColorBet colorBet) {
            if (winSector instanceof ColorSector colorSector) {
                return colorBet.getValue() == colorSector.getColor();
            }
        }
        if (bet instanceof NumberBet numberBet) {
            return numberBet.getValue() == winSector.getNumber();
        }
        throw new IllegalArgumentException("Unknown bet: " + bet);
    }
}
