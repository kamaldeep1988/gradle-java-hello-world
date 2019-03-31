package hello;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreeterTest {
  @Test
  public void testConcatenate() {
    Greeter greeter = new Greeter();
    String greeting = greeter.sayHello();
    assertEquals("Hello world!", greeting);
  }

}
