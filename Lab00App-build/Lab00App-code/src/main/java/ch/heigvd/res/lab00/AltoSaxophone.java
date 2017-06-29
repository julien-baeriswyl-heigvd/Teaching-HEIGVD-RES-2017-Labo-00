package ch.heigvd.res.lab00;

class AltoSaxophone implements IInstrument{
   private static final String SOUND = "fuuuiiiiiii";
   private static final int VOLUME = 10000;
   private static final String COLOR = "pink";

   @Override
   public String play() {
      return SOUND;
   }

   @Override
   public int getSoundVolume() {
      return VOLUME;
   }

   @Override
   public String getColor() {
      return COLOR;
   }
}