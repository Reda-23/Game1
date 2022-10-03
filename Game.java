package gameio;

import java.util.ArrayList;

public class Game {



    public static void main(String[] args) {

       Player pl = new Player("Reda" , "MP-40" , 100);
      pl.damageByGun2("Groza");
      pl.heal();
    }
}