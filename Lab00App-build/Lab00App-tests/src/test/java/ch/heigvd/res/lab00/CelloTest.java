package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author SILVERCORP
 */

public class CelloTest {
  @Test
  public void aCelloShouldMakeBoumBoum() {
    IInstrument cello = new Cello();
    String sound = cello.play();
    Assert.assertEquals("boum boum", sound);
  }
    
}
