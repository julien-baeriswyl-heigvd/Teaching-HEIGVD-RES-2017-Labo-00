
package ch.heigvd.res.lab00;

/**
 *
 * @author Damien Carnal
 */
public class CelticHarp implements IInstrument{
    
    public String play(){
        return "druum";
    }

    @Override
    public int getSoundVolume() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

   
    
}
