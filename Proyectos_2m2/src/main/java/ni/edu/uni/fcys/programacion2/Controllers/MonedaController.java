/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.Controllers;

import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import ni.edu.uni.fcys.programacaion2.Panels.Moneda;

/**
 *
 * @author LENOVO 17
 */
public class MonedaController {
    private Moneda moneda;
    private final String Moneda[] = new String[]{"Cordoba", "Dolar","Euro"};
    private DefaultComboBoxModel fromcmbmodel;
    private DefaultComboBoxModel tocmbmodel;

    public MonedaController(Moneda moneda) {
        this.moneda = moneda;
        initComponent();
    }

    private void initComponent() {
        fromcmbmodel = new DefaultComboBoxModel<>(Moneda);
        tocmbmodel = new DefaultComboBoxModel<>(Moneda);

        moneda.getCmbFrom().setModel(fromcmbmodel);
        moneda.getCmbTo().setModel(tocmbmodel);
    }
    
    private void btnConvActionPerformed(ActionEvent e) {
        conversionEvent();
    }
    private void btnBorrarActionPerformed(ActionEvent e){
        temperatura.getTxtValue().setText(null);
        temperatura.getLblResult().setText("Resultado: ");
    }
    private void conversionEvent() throws NumberFormatException {
        int indexFrom = temperatura.getCmbFrom().getSelectedIndex();
        int indexTo = temperatura.getCmbTo().getSelectedIndex();
        double value = Double.parseDouble(
                temperatura.getTxtValue().getText());

        double result = convertirTemperature(value, indexFrom, indexTo);
        temperatura.getLblResult().setText("Resultado: " + result);
    }

    private double convertirTemperature(double value, int from, int to) {
        switch (from) {
            case 0:
                switch (to) {
                    case 0:
                        return value;
                    case 1:
                        return celciusToFahrenheit(value);
                }
            case 1:
                switch (to) {
                    case 0:
                        return fahrenheitToCelcius(value);
                    case 1:
                        return value;
                }
        }
        return value;
    }

    private double DolarToCordoba(double value) {
        return (((double) 9 / 5 * value) + 32);
    }

    private double fahrenheitToCelcius(double value) {
        return (((double) 5 / 9) * (value - 32));
    }
    
}
