package app.util;

import java.util.Random;

public class Randomizer {

    public int getRandomNum(){
        Random random = new Random();
        return random.nextInt(11);
    }
}