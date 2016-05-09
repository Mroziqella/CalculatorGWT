package pl.mroziqella.app.gwt.calculator.client.model.operator;


import pl.mroziqella.app.gwt.calculator.client.*;
import pl.mroziqella.app.gwt.calculator.client.model.*;

public class OperatorMultiply extends BinaryOperator {
    public OperatorMultiply() {
        super(CalculatorConstants.MULTIPLY);
    }

    public void operate(final CalculatorData data) {
        data.setDisplay(String.valueOf(
                data.getBuffer() * Double.parseDouble(data.getDisplay())));
        data.setInitDisplay(true);
    }
}
