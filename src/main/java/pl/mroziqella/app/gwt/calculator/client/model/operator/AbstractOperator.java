package pl.mroziqella.app.gwt.calculator.client.model.operator;


import pl.mroziqella.app.gwt.calculator.client.model.*;

/**
 * Base class for Calculator operators.
 *
 * @author ccollins
 *
 */
public abstract class AbstractOperator {
    public String label;

    AbstractOperator(final String label) {
        this.label = label;
    }

    public abstract void operate(final CalculatorData data);

    public String toString() {
        return "Operator:" + this.label;
    }
}
