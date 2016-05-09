package pl.mroziqella.app.gwt.calculator.client;

import com.google.gwt.junit.client.GWTTestCase;

public class CompileGwtTest extends GWTTestCase {
  
  @Override
  public String getModuleName() {
    return "pl.mroziqella.app.gwt.calculator.Calkulator";
  }

  public void testSandbox() {
    assertTrue(true);
  }
  
}
