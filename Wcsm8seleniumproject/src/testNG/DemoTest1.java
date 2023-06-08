package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest1 {
  @Test
  public void a() {
  
	  Reporter.log("a method from DemoTest1.....");
  
  }
  
  @Test
  public void b() {
	  
	  Reporter.log("b method from DemoTest1.....");
  
  }
  
  @Test
  public void c() {
	  
	  Reporter.log("c method from DemoTest1.....");
  
  }
}
