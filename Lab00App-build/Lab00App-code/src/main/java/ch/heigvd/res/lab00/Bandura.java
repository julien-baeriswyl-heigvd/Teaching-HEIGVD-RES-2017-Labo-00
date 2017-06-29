
package ch.heigvd.res.lab00;

/**
 *
 * @author Lemdjo
 */
 
 
public class Bandura implements IInstrument {

   private String color = "brown";

   private int soundVolume = 10;

  

   public Bandura() {}

   public String play() {

      return "bandura";

   }

   public int getSoundVolume() {

      return soundVolume;

   }


   public String getColor() {

      return color;

   }

}