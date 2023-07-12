package com.mycodetest.lamdaexpression;

import java.util.Random;

public class LambdaExpressionExample08 {

    public void playGame(String gameName) throws InterruptedException{
        System.out.println(gameName + " game started");

        // Assuming game is being played for 500ms
        Thread.sleep(500); // This statement may throw interrupted exception
                                 // so throws declaration is added

        System.out.println(gameName + " game ended");
    }

    public void playMusic(String trackName) throws InterruptedException{
        System.out.println(trackName + " track started");

        // Assuming music is being played for 500ms
        Thread.sleep(500);
        System.out.println(trackName + " track ended");
    }
}

class Test{
    // games and tracks arrays which are being used for picking random items
    static String[] games = {"COD", "Prince Of Persia", "GTA-V5", "Valorant", "FIFA 22"};
    static String[] tracks = {"Believer", "Cradles", "Taki Taki", "Sorry", "Let Me Love You"};

    public static void main(String[] args) {
        LambdaExpressionExample08 player = new LambdaExpressionExample08();
        Random random = new Random();

        Runnable gameRunner = () -> {
            try{
                player.playGame(games[random.nextInt(games.length)]);

            }catch(InterruptedException e){
                e.getMessage();
            }
        };

        Runnable musicPlayre = () -> {
            try{
                player.playMusic(tracks[random.nextInt(tracks.length)]);

            }catch(InterruptedException e){
                e.getMessage();
            }
        };

        Thread game = new Thread(gameRunner);
        Thread music = new Thread(musicPlayre);

        game.start();
        music.start();
    }
}
