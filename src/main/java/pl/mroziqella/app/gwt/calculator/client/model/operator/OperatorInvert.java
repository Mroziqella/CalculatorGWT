package pl.mroziqella.app.gwt.calculator.client.model.operator;


import pl.mroziqella.app.gwt.calculator.client.*;
import pl.mroziqella.app.gwt.calculator.client.model.*;

public class OperatorInvert extends UnaryOperator {
    public OperatorInvert() {
        super(CalculatorConstants.INVERT);
    }

    public void operate(final CalculatorData data) {
        double displayDouble = Double.parseDouble(data.getDisplay());

        if (displayDouble < 0) {
            data.setDisplay(String.valueOf(Math.abs(displayDouble)));
        } else {
            data.setDisplay(String.valueOf(-displayDouble));
        }
    }
}
