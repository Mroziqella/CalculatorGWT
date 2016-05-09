package pl.mroziqella.app.gwt.calculator.client.view.button;

import com.google.gwt.user.client.ui.*;
import pl.mroziqella.app.gwt.calculator.client.*;
import pl.mroziqella.app.gwt.calculator.client.controller.*;
import pl.mroziqella.app.gwt.calculator.client.model.operator.*;


public class ButtonOperator extends Button {
    public ButtonOperator(final CalculatorController controller,
        final AbstractOperator op) {
        super(op.label);
        this.addClickListener(new ClickListener() {
                public void onClick(Widget sender) {
                    controller.processOperator(op);
                }
            });
        this.setStyleName(CalculatorConstants.STYLE_BUTTON);
    }
}
