package dev.cheercode.dialoges;

import dev.cheercode.BetFactory;
import dev.cheercode.bets.Bet;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.function.BiFunction;

// TODO сделать абстрактный диалог
public class BetDialog implements Dialog<Bet> {
    private final String title;
    private final String error;
    private final Scanner scanner;
    private final BigInteger money;
    private final BiFunction<BigInteger, String, Bet> mapper;

    public BetDialog(String title, String error, BigInteger money, BiFunction<BigInteger, String, Bet> mapper) {
        this.title = title;
        this.error = error;
        this.money = money;
        this.mapper = mapper;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Bet input() {
        System.out.println(title);

        while (true) {
            String key = scanner.next();

            try {
                Bet bet = mapper.apply(money, key);
                return bet;
            } catch (IllegalArgumentException e) {
            }

            System.out.println(error);
        }

    }
}
