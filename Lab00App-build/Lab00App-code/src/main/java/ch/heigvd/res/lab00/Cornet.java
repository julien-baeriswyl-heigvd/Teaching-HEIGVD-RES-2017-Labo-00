package ch.heigvd.res.lab00;

public class Cornet implements IInstrument {

   private String color = "gold";

   private int soundVolume = 30;

  

   public Cornet() {}

   public String play() {

      return "thuuum";

   }

   public int getSoundVolume() {

      return soundVolume;

   }


   public String getColor() {

      return color;

   }

}
