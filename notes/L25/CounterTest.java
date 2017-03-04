// java -cp /usr/share/java/junit4.jar:. org.junit.runner.JUnitCore CounterTest
import static org.junit.Assert.*;
import org.junit.Test;

public class CounterTest {
  @org.junit.Test
  public void add10() {
      Counter c = new Counter();
      c.addToCount(10);
      // after calling SUT, read off results
      assertEquals("value", 10, c.getCount());
  }
}
