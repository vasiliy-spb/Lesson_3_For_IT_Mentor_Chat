package dev.cheercode;

public class Sector {
    private final int number;

    public Sector(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Sector{" +
                "number=" + number +
                '}';
    }
}
