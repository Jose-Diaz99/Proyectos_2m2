/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.Controllers;

import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import ni.edu.uni.fcys.programacaion2.Panels.Calculator;

/**
 *
 * @author LENOVO 17
 */
public class CalculatorController {
    private DefaultComboBoxModel cmbOp;
    private String operation[]=new String[]{"Suma","Resta","Multiplicacion","Division"};
    private Calculator calculator;
    

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
        initComponent();
    }

    private void initComponent() {
        cmbOp=new DefaultComboBoxModel(operation);
        calculator.getCmbOperation().setModel(cmbOp);
        
        
        calculator.getBtnCalc().addActionListener(
                (ActionEvent e) -> {
                    btnCalcActionPerformed(e);
                });
        
        calculator.getBtnBorrar().addActionListener(
                (ActionEvent e) -> {
                    btnBorrarActionPerformed(e);
                });
    }
    
    private void btnCalcActionPerformed(ActionEvent e){
        CalculatorEvent();
    }
    
    private void CalculatorEvent() throws NumberFormatException{
        double num1=Double.parseDouble(calculator.getTxtNum1().getText());
        double num2=Double.parseDouble(calculator.getTxtNum2().getText());
        
        double result = Calculos(num1,num2);
        calculator.getLblResult().setText("Resultado: "+result);
        
    }
    
    private void btnBorrarActionPerformed(ActionEvent e){
        calculator.getTxtNum1().setText(null);
        calculator.getTxtNum2().setText(null);
        calculator.getLblResult().setText("Resultado: ");
    }
    
    private double Calculos(double num1,double num2){
        num1=Double.parseDouble(calculator.getTxtNum1().getText());
        num2=Double.parseDouble(calculator.getTxtNum2().getText());
        
        String oper=calculator.getCmbOperation().getSelectedItem().toString();
        
        if(oper.equalsIgnoreCase("Suma")){
           return Suma(num1,num2);
        }else if(oper.equalsIgnoreCase("Resta")){
           return Resta(num1,num2);
        }else if(oper.equalsIgnoreCase("Multiplicacion")){
           return Multiplicacion(num1,num2);
        }else if(oper.equalsIgnoreCase("Division")){
           return Division(num1,num2);
        }
        return 0;
    }
    
    private double Suma(double num1,double num2){
        return num1+num2;
    }
    private double Resta(double num1, double num2){
        return num1-num2;
    }
    private double Multiplicacion(double num1, double num2){
        return num1*num2;
    }
    private double Division(double num1, double num2){
        return num1/num2;
    }
}
