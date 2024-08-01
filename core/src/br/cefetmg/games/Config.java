package br.cefetmg.games;

/**
 * Configuration settings for the game.
 */
public class Config {

    public static boolean debug = false;

    private static Config instance = new Config();

    private Config() {
        
    }


    public static Config getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Config Singleton instance is working!");
    }
}