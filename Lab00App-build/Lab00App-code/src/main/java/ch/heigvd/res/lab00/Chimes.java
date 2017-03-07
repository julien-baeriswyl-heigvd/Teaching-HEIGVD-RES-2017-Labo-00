package ch.heigvd.res.lab00;

/**
 * Created by Newtt on 3/6/17.
 */
public class Chimes implements IInstrument
{
   private String color = "silver";
   private int soundVolume = 42;

   @Override
   public String play()
   {
      return "dring";
   }

   @Override
   public String getColor()
   {
      return color;
   }

   @Override
   public int getSoundVolume()
   {
      return soundVolume;
   }
}
