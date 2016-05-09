package pl.mroziqella.app.gwt.calculator.client.view;

import com.google.gwt.core.client.*;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.user.client.ui.*;
import com.sun.istack.internal.logging.*;
import pl.mroziqella.app.gwt.calculator.client.*;
import pl.mroziqella.app.gwt.calculator.client.controller.*;
import pl.mroziqella.app.gwt.calculator.client.model.*;
import pl.mroziqella.app.gwt.calculator.client.model.operator.*;
import pl.mroziqella.app.gwt.calculator.client.view.button.*;

import java.util.logging.*;
import java.util.logging.Logger;

/**
 * Created by Kamil on 18/04/2016.
 */
public class CalculatorWidget extends VerticalPanel {
    private TextBox display;

    final  static Logger logger = Logger.getLogger("NameOfYourLogger");

    public CalculatorWidget(final String title) {
        super();
        final CalculatorData data = new CalculatorData();
        final CalculatorController controller = new CalculatorController(data);
        VerticalPanel p = new VerticalPanel();
        p.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);
        p.setStyleName(CalculatorConstants.STYLE_PANEL);

        Grid g = new Grid(4, 5);
        g.setStyleName(CalculatorConstants.STYLE_GRID);
        // put the digits in the grid
        final Button zero = new ButtonDigit(controller, "0");
        g.setWidget(3, 0, zero);

        final Button one = new ButtonDigit(controller, "1");
        g.setWidget(2, 0, one);

        final Button two = new ButtonDigit(controller, "2");
        g.setWidget(2, 1, two);

        final Button three = new ButtonDigit(controller, "3");
        g.setWidget(2, 2, three);

        final Button four = new ButtonDigit(controller, "4");
        g.setWidget(1, 0, four);

        final Button five = new ButtonDigit(controller, "5");
        g.setWidget(1, 1, five);

        final Button six = new ButtonDigit(controller, "6");
        g.setWidget(1, 2, six);

        final Button seven = new ButtonDigit(controller, "7");
        g.setWidget(0, 0, seven);

        final Button eight = new ButtonDigit(controller, "8");
        g.setWidget(0, 1, eight);

        final Button nine = new ButtonDigit(controller, "9");
        g.setWidget(0, 2, nine);

        final Button point = new ButtonDigit(controller, ".");
        g.setWidget(3, 2, point);

        // put the operators in the grid
        final Button divide = new ButtonOperator(controller, new OperatorDivide());
        g.setWidget(0, 3, divide);

        final Button multiply = new ButtonOperator(controller,new OperatorMultiply());
        g.setWidget(1, 3, multiply);

        final Button subtract = new ButtonOperator(controller, new OperatorSubtract());
        g.setWidget(2, 3, subtract);

        final Button add = new ButtonOperator(controller, new OperatorAdd());
        g.setWidget(3, 3, add);

        final Button sqrt = new ButtonOperator(controller, new OperatorSqrt());
        g.setWidget(0, 4, sqrt);

        final Button power = new ButtonOperator(controller, new OperatorPower());
        g.setWidget(1, 4, power);

        final Button invert = new ButtonOperator(controller, new OperatorInvert());
        g.setWidget(3, 1, invert);

        // add special button for clear (handled directly by controller)
        final Button clear = new Button(CalculatorConstants.CLEAR);
        clear.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                controller.processClear();
            }
        });
        clear.setStyleName(CalculatorConstants.STYLE_BUTTON);
        g.setWidget(2, 4, clear);

        // add special button for equals (handled directly by controller)
        final Button equals = new Button(CalculatorConstants.EQUALS);
        equals.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                controller.processEquals();
            }
        });
        equals.setStyleName(CalculatorConstants.STYLE_BUTTON);
        g.setWidget(3, 4, equals);

        // initialize the display textBox for results
        display = new TextBox();




        // add a view change listener to the "data" model object
        // and if the model changes, update the view
        data.addChangeListener(new CalculatorChangeListener() {
            public void onChange(CalculatorData data) {
                display.setText(String.valueOf(data.getDisplay()));
                logger.info("adsadsad");

            }
        });


        display.setText("0");
        display.setTextAlignment(TextBox.ALIGN_RIGHT);

        // add the textBox and the grid to the panel, and the panel to the widget
        p.add(display);
        p.add(g);
        this.add(p);
    }
}
