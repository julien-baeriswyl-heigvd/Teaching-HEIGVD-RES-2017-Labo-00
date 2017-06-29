
package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
/**
 *
 * @author Yosra
 */
public class CalliopeTest {
  @Test
  public void aCalliopeShouldMakeZiw() {
    IInstrument calliope = new Calliope();
    String sound = calliope.play();
    Assert.assertEquals("ziw", sound);
  }

}
