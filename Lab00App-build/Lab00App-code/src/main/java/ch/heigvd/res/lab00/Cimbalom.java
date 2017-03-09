/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Basile Chatillon
 */
public class Cimbalom implements IInstrument {
    public String play(){
        return "zoooooomm";
    }
    public int getSoundVolume(){
        return 20;
    }
    public String getColor(){
        return "wood";
    }
}
