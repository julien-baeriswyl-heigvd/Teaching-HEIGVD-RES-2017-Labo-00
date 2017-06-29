package ch.heigvd.res.lab00;

/**
 * Classe impl�mentant un tabla
 * @author P-B Monaco
 */

public class Tabla implements IInstrument
{
   public String play(){return "BoumBoum";}

   @Override
   public int getSoundVolume()
   {
      return 20;
   }

   @Override
   public String getColor()
   {
      return "Strange";
   }
}