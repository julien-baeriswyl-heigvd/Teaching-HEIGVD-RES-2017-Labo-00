package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *       *** IMPORTANT WARNING : DO NOT EDIT THIS FILE ***
 *
 * This file is used to specify what you have to implement. To check your work,
 * we will run our own copy of the automated tests. If you change this file,
 * then you will introduce a change of specification!!!
 *
 * @author Valentin Finini
 */
public class BassClarinetTest {

    @Test
    public void aBassClarinetShouldMakeBuuh() {
        IInstrument bc = new BassClarinet();
        String sound = bc.play();
        Assert.assertEquals("buuuh", sound);
    }

}
