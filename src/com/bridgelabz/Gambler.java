package com.bridgelabz;

import java.util.Random;


public class Gambler {

       private static final int DAILY_STAKE=100;
       private static final int GAME_BET=1;
       private static final  Random random=new Random();
       private static final int IS_WON=1;

      public static void main(String[] args) {


          int winCount = 0;
          int i=1;
             while (i <= DAILY_STAKE) {
                 int betResult = random.nextInt(2);
                 //System.out.println(betResult);
                 if (betResult == IS_WON)
                     winCount++;
                 else
                     winCount--;

                 i++;
             }
          System.out.println("WinCount "+winCount);

      }
}
