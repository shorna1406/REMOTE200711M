package datadriven;

import org.testng.annotations.DataProvider;

public class DataRead {
	@DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { 1, "a" },
	      new Object[] { 2, "b" },
	    };
	  }
}
