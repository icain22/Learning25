public class Kata {

  public static String solution(String str) {
    // Your code here...
    String rev = "";
    for (int i = str.length()-1; i>=0; i--){
      rev += str.charAt(i);
    }
    return rev;
  }

}
//testing
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void sampleTests() {
      assertEquals("dlrow", Kata.solution("world"));
    }
}
