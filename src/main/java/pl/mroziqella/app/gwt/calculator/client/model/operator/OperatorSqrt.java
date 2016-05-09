package pl.mroziqella.app.gwt.calculator.client.model.operator;


import pl.mroziqella.app.gwt.calculator.client.*;
import pl.mroziqella.app.gwt.calculator.client.model.*;

public class OperatorSqrt extends UnaryOperator {
    public OperatorSqrt() {
        super(CalculatorConstants.SQRT);
    }

    public void operate(final CalculatorData data) {
        data.setDisplay(String.valueOf(Math.sqrt(Double.parseDouble(
                        data.getDisplay()))));
    }
}
