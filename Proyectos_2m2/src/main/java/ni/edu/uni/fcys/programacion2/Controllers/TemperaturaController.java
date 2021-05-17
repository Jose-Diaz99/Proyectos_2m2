/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.text.DecimalFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import ni.edu.uni.fcys.programacaion2.Panels.Temperatura;

/**
 *
 * @author LENOVO 17
 */
public class TemperaturaController {
    private Temperatura temperatura;
    private final String TEMPERATURE[] = new String[]{"Celcius", "Fahrenheit"};
    private DefaultComboBoxModel fromcmbmodel;
    private DefaultComboBoxModel tocmbmodel;
    

    public TemperaturaController(Temperatura temperatura) {
        this.temperatura = temperatura;
        initComponent();
        
    }

    private void initComponent() {
        fromcmbmodel = new DefaultComboBoxModel<>(TEMPERATURE);
        tocmbmodel = new DefaultComboBoxModel<>(TEMPERATURE);

        temperatura.getCmbFrom().setModel(fromcmbmodel);
        temperatura.getCmbTo().setModel(tocmbmodel);
        
         temperatura.getBtnCalc().addActionListener(
                (ActionEvent e) -> {
                    btnConvActionPerformed(e);
                });

        
        temperatura.getBtnBorrar().addActionListener((ActionEvent e)->{
            btnBorrarActionPerformed(e);
        });
    }
    
    private void btnConvActionPerformed(ActionEvent e) {
        conversionEvent();
    }
    private void btnBorrarActionPerformed(ActionEvent e){
        temperatura.getTxtValue().setText(null);
        temperatura.getLblResult().setText("Resultado: ");
    }
    private void conversionEvent() throws NumberFormatException {
        if(temperatura.getTxtValue().getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No podemos realizar la coversion,\ndebe ingresar un valor");
        }
        
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

    private double celciusToFahrenheit(double value) {
        return (((double) 9 / 5 * value) + 32);
    }

    private double fahrenheitToCelcius(double value) {
        return (((double) 5 / 9) * (value - 32));
    }
}
