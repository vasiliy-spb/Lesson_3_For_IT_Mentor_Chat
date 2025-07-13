package dev.cheercode;

public class ColorSector extends Sector {
    private final Color color;

    public ColorSector(int number, Color color) {
        super(number);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColorSector{" +
                "color=" + color +
                ", number=" + getNumber() +
                '}';
    }

    public enum Color {
        RED,
        BLACK;
    }
}
