package dev.cheercode.dialoges;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerDialog implements Dialog<BigInteger> {
    private final int min;
    private final int max;
    private final String title;
    private final String error;
    private final Scanner scanner;

    public BigIntegerDialog(String title, String error, int min, int max) {
        this.title = title;
        this.error = error;
        this.min = min;
        this.max = max;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public BigInteger input() {
        System.out.println(title);

        while (true) {
            String input = scanner.next();

            try {
                BigInteger value = new BigInteger(input);

                if (value.intValue() >= min && value.intValue() <= max) {
                    return value;
                }

            } catch (NumberFormatException e) {
            }
            System.out.println(error);
        }
    }
}
