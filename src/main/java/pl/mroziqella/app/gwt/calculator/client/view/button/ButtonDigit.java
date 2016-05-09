package pl.mroziqella.app.gwt.calculator.client.view.button;


import com.google.gwt.user.client.ui.*;
import pl.mroziqella.app.gwt.calculator.client.*;
import pl.mroziqella.app.gwt.calculator.client.controller.*;

public class ButtonDigit extends Button {
    public ButtonDigit(final CalculatorController controller, final String label) {
        super(label);
        this.addClickListener(new ClickListener() {
                public void onClick(Widget sender) {
                    controller.processDigit(label);
                }
            });
        this.setStyleName(CalculatorConstants.STYLE_BUTTON);
    }
}
