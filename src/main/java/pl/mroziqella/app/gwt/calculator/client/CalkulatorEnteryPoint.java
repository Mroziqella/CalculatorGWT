package pl.mroziqella.app.gwt.calculator.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import pl.mroziqella.app.gwt.calculator.client.view.*;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CalkulatorEnteryPoint implements EntryPoint {
  
  @Override
  public void onModuleLoad() {
    RootPanel.get().add(new CalculatorWidget("calculator"));
  }

}
