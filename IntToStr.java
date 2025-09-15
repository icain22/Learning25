//Solution
class Kata {
  public static String numberToString(int num) {
    return Integer.toString(num);// Return a string of the number here!
  }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.util.Random;

public class NumberStringTests {
  @Test
  public void basicTests() {
    assertEquals("67", Kata.numberToString(67));
    assertEquals("79585", Kata.numberToString(79585));
    assertNotEquals(79585, Kata.numberToString(79585));
    assertEquals("3", Kata.numberToString(1+2));
    assertEquals("-1", Kata.numberToString(1-2));
    assertEquals("0", Kata.numberToString(0));
  }
  
  @Test
  public void randomTests() {
    Random randGen = new Random();
    for (int i = 0; i < 20; i++) {
      int num = randGen.nextInt(1000000) - 500000;
      assertEquals("Should convert " + num + " to its correct string representation", Integer.toString(num), Kata.numberToString(num));
    }
  }
}
