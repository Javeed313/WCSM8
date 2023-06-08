package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodExecution {
  @Test
  public void method1() {
	  
	  long ThreadID = Thread.currentThread().getId();
	  Reporter.log(ThreadID+": is the ID of Method",true);
	  Reporter.log("Method1",true);
  }
  
  @Test
  public void method2() {
	  
	  long ThreadID = Thread.currentThread().getId();
	  Reporter.log(ThreadID+": is the ID of Method",true);
	  Reporter.log("Method2",true);
  }
}
