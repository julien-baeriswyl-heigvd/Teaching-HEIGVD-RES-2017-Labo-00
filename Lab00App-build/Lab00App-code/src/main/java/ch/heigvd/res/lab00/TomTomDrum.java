package ch.heigvd.res.lab00;

/**
 * Implementation of TomTomDrum class.
 * @author G. Othenin-Girard
 */
public class TomTomDrum implements IInstrument {

   public String play() {
      return "tom-tom";
   }

   public int getSoundVolume() {
      return 50;
   }

   public String getColor() {
      return "brown";
   }

}