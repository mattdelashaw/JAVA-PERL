

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class Zelda
   {
   public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();
      myFinch.setLED(255, 0, 0);
      myFinch.playTone(440,500);
      myFinch.setLED(0, 255, 0);
      myFinch.playTone(294, 750);
      myFinch.setLED(0, 0, 255);
      myFinch.playTone(349, 500);
      myFinch.setLED(255, 0, 0);
      myFinch.playTone(440,500);
      myFinch.setLED(0, 255, 0);
      myFinch.playTone(294, 750);
      myFinch.setLED(0, 0, 255);
      myFinch.playTone(349, 500);
      myFinch.setLED(255, 0, 0);
      myFinch.playTone(440, 250);
      myFinch.setLED(0, 255, 0);
      myFinch.playTone(523, 250);
      myFinch.setLED(0, 0, 255);
      myFinch.playTone(494, 500);
      myFinch.setLED(255, 0, 0);
      myFinch.playTone(392, 500);
      myFinch.setLED(0, 255, 0);
      myFinch.playTone(349, 250);
      myFinch.setLED(0, 0, 255);
      myFinch.playTone(392, 250);
      myFinch.setLED(255, 0, 0);
      myFinch.playTone(440, 500);
      myFinch.setLED(0, 255, 0);
      myFinch.playTone(294, 500);
      myFinch.setLED(0, 0, 255);
      myFinch.playTone(262, 250);
      myFinch.setLED(255, 0, 0);
      myFinch.playTone(330, 250);
      myFinch.setLED(0, 255, 0);
      myFinch.playTone(294, 500);
      
      myFinch.quit();
      System.exit(0);
      }
   }

