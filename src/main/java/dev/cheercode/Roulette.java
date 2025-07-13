package dev.cheercode;

import java.util.List;
import java.util.Random;

public class Roulette {
    private static final List<Sector> SECTORS = createSectors();
    private static Random random = new Random();

    public Roulette() {
    }

    public Sector spin() {
        int index = random.nextInt(SECTORS.size());
        return SECTORS.get(index);
    }

    public boolean contains(int number) {
        for (Sector sector : SECTORS) {
            if (sector.getNumber() == number) {
                return true;
            }
        }
        return false;
    }

    private static List<Sector> createSectors() {
        return List.of(
                new Sector(0),
                new ColorSector(1, ColorSector.Color.RED),
                new ColorSector(2, ColorSector.Color.BLACK),
                new ColorSector(3, ColorSector.Color.RED),
                new ColorSector(4, ColorSector.Color.BLACK),
                new ColorSector(5, ColorSector.Color.RED),
                new ColorSector(6, ColorSector.Color.BLACK),
                new ColorSector(7, ColorSector.Color.RED),
                new ColorSector(8, ColorSector.Color.BLACK),
                new ColorSector(9, ColorSector.Color.RED),
                new ColorSector(10, ColorSector.Color.BLACK),
                new ColorSector(11, ColorSector.Color.BLACK),
                new ColorSector(12, ColorSector.Color.RED),
                new ColorSector(13, ColorSector.Color.BLACK),
                new ColorSector(14, ColorSector.Color.RED),
                new ColorSector(15, ColorSector.Color.BLACK),
                new ColorSector(16, ColorSector.Color.RED),
                new ColorSector(17, ColorSector.Color.BLACK),
                new ColorSector(18, ColorSector.Color.RED),
                new ColorSector(19, ColorSector.Color.RED),
                new ColorSector(20, ColorSector.Color.BLACK),
                new ColorSector(21, ColorSector.Color.RED),
                new ColorSector(22, ColorSector.Color.BLACK),
                new ColorSector(23, ColorSector.Color.RED),
                new ColorSector(24, ColorSector.Color.BLACK),
                new ColorSector(25, ColorSector.Color.RED),
                new ColorSector(26, ColorSector.Color.BLACK),
                new ColorSector(27, ColorSector.Color.RED),
                new ColorSector(28, ColorSector.Color.BLACK),
                new ColorSector(29, ColorSector.Color.BLACK),
                new ColorSector(30, ColorSector.Color.RED),
                new ColorSector(31, ColorSector.Color.BLACK),
                new ColorSector(32, ColorSector.Color.RED),
                new ColorSector(33, ColorSector.Color.BLACK),
                new ColorSector(34, ColorSector.Color.RED),
                new ColorSector(35, ColorSector.Color.BLACK),
                new ColorSector(36, ColorSector.Color.RED)
        );
    }
}
