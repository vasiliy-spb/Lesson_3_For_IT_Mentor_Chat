package dev.cheercode;

public class TestMain {
    public static void main(String[] args) {
        Roulette roulette = new Roulette() {
            @Override
            public Sector spin() {
                return new ColorSector(4, ColorSector.Color.BLACK);
            }
        };

        Game game = new Game(roulette);
        game.start();
    }
}
