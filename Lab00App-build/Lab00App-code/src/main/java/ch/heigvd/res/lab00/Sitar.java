
package ch.heigvd.res.lab00;


public class Sitar implements IInstrument {

   private String color = "brown";

   private int soundVolume = 10;

  

   public Sitar() {}

   public String play() {

      return "dring";

   }

   public int getSoundVolume() {

      return soundVolume;

   }


   public String getColor() {

      return color;

   }

}