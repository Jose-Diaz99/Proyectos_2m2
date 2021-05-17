/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.Controllers;

import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import ni.edu.uni.fcys.programacaion2.Panels.Moneda;

/**
 *
 * @author LENOVO 17
 */
public class MonedaController {
    private Moneda moneda;
    private final String Coin[] = new String[]{"Cordoba", "Dolar","Euro"};
    private DefaultComboBoxModel fromcmbmodel;
    private DefaultComboBoxModel tocmbmodel;

    public MonedaController(Moneda moneda) {
        this.moneda = moneda;
        initComponent();
    }

    private void initComponent() {
        fromcmbmodel = new DefaultComboBoxModel<>(Coin);
        tocmbmodel = new DefaultComboBoxModel<>(Coin);

        moneda.getCmbFrom().setModel(fromcmbmodel);
        moneda.getCmbTo().setModel(tocmbmodel);
        
        moneda.getBtnCalc().addActionListener(
                (ActionEvent e) -> {
                    btnConvActionPerformed(e);
                });
        
        moneda.getBtnBorrar().addActionListener(
                (ActionEvent e) -> {
                    btnBorrarActionPerformed(e);
                });
        
        
    }
    
    private void btnConvActionPerformed(ActionEvent e) {
        conversionEvent();
    }
    private void btnBorrarActionPerformed(ActionEvent e){
        moneda.getTxtValue().setText(null);
        moneda.getLblResult().setText("Resultado: ");
    }
    private void conversionEvent() throws NumberFormatException {
        if(moneda.getTxtValue().getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No podemos realizar la coversion,\ndebe ingresar un valor");
        }
        
        String indexFrom = moneda.getCmbFrom().getSelectedItem().toString();
        String indexTo = moneda.getCmbTo().getSelectedItem().toString();
        double value = Double.parseDouble(
                moneda.getTxtValue().getText());

        double result = convertirTemperature(value, indexFrom, indexTo);
        moneda.getLblResult().setText("Resultado: " + result+" "+moneda.getCmbTo().getSelectedItem().toString());
    }

    private double convertirTemperature(double value, String from, String to) {
        from=moneda.getCmbFrom().getSelectedItem().toString();
        to=moneda.getCmbTo().getSelectedItem().toString();
        
        if(from.equalsIgnoreCase("Cordoba")){
            if(to.equalsIgnoreCase("Dolar")){
                value=CordobaToDolar(value);
            }else if(to.equalsIgnoreCase("Euro")){
                value=CordobaToEuro(value);
            }
        }
        
        if(from.equalsIgnoreCase("Dolar")){
            if(to.equalsIgnoreCase("Cordoba")){
                value=DolarToCordoba(value);
            }else if(to.equalsIgnoreCase("Euro")){
                value=DolarToEuro(value);
            }
        }
        
        if(from.equalsIgnoreCase("Euro")){
            if(to.equalsIgnoreCase("Cordoba")){
                value=EuroToCordoba(value);
            }else if(to.equalsIgnoreCase("Dolar")){
                value=EuroToDolar(value);
            }
        }
        return value;
    }

    private double DolarToCordoba(double value) {
        return ((double) value*35.20);
    }

    private double DolarToEuro(double value) {
        return ((double)value*0.82);
    }
    
    private double EuroToCordoba(double value){
        return ((double)value*42.77);
    }
    
    private double EuroToDolar(double value){
        return ((double)value*1.22);
    }
    
    private double CordobaToDolar(double value){
        return ((double)value*0.029);
    }
    
    private double CordobaToEuro(double value){
        return ((double)value*0.024);
    }
}
