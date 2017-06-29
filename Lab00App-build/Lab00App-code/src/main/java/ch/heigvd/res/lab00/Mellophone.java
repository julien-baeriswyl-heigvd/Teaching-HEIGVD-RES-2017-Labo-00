package ch.heigvd.res.lab00;

/**
 *
 * @author Lemdjo
 */
/*Add implementation for Mellophone*/
public class Mellophone implements IInstrument{
   	public Mellophone() {}

       @Override
	public String play() {
           return "Pouet";
	}
       @Override
        public int getSoundVolume(){
           return 0; 
         }
       @Override
         public String getColor(){
             return "Golgen";
          }
   
}
