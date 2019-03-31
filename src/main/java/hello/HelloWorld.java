package hello;

import java.util.Date;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("The current local time is: " + new Date());
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}
