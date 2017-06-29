/*
 * Labo : 00
 * Auteur : Nathalie Mégevand
 * Date : 7 mars 2017
 * Fichier : SnareDrum.java
 * 
 * Cette classe 
 */

package ch.heigvd.res.lab00;


public class SnareDrum implements IInstrument {
    
    private String sound;
    private String colour;
    private int volume;

    public SnareDrum() {
        sound = "boum";
        colour = "white";
        volume = 10;
    }

    @Override
    public String play() {
        return sound;
    }

    @Override
    public int getSoundVolume() {
        return volume;
    }

    @Override
    public String getColor() {
        return colour;
    }
    
    
}
