package dev.cheercode;

import dev.cheercode.bets.Bet;
import dev.cheercode.dialoges.BetDialog;
import dev.cheercode.dialoges.BigIntegerDialog;
import dev.cheercode.dialoges.Dialog;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Game {
    private final Roulette roulette;
    private final RouletteRenderer rouletteRenderer;
    private final BetFactory betFactory;
    private final ResultAnalyzer resultAnalyzer;

    public Game(Roulette roulette) {
        this.roulette = roulette;
        this.betFactory = new BetFactory(roulette);
        this.rouletteRenderer = new RouletteRenderer();
        this.resultAnalyzer = new ResultAnalyzer(roulette);
    }

    public void start() {
        System.out.println("Игра началась");
        rouletteRenderer.show();
        System.out.println();
        System.out.println("Сделайте ставку:");

        BigInteger money = askBetMoney();

        Bet bet = askBet(money);

        Sector winSector = roulette.spin();

        // TODO сделать красиво
        System.out.println("Выиграл сектор: " + winSector.toString());

        if (resultAnalyzer.isWin(bet, winSector)) {
            BigDecimal profit = calculateProfit(bet);
            System.out.println("Вы выиграли " + profit);
        } else {
            System.out.println("Вы проиграли..");
        }

    }

    // TODO костыль
    private BigDecimal calculateProfit(Bet bet) {
        BigDecimal money = new BigDecimal(bet.getMoney().toString());
        return money.multiply(bet.getCoefficient()).add(money);
    }

    private Bet askBet(BigInteger money) {

        Dialog<Bet> dialog = new BetDialog("Сделайте ставку:", "Неправильный ввод", money, betFactory::get);
        return dialog.input();
    }

    private BigInteger askBetMoney() {
        Dialog<BigInteger> moneyDialog = new BigIntegerDialog("Введите количество денег:", "Неправильный ввод.", 1, 1_000_000);
        return moneyDialog.input();
    }
}
