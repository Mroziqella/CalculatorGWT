package pl.mroziqella.app.gwt.calculator.client.model.operator;


import pl.mroziqella.app.gwt.calculator.client.*;
import pl.mroziqella.app.gwt.calculator.client.model.*;

public class OperatorPower extends BinaryOperator {
    public OperatorPower() {
        super(CalculatorConstants.POWER);
    }

    public void operate(final CalculatorData data) {
        data.setDisplay(String.valueOf(Math.pow(data.getBuffer(),
                    Double.parseDouble(data.getDisplay()))));
        data.setInitDisplay(true);
    }
}
