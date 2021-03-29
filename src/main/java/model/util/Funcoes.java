/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.util;

/**
 *
 * @author Israel Gadelha
 */
public class Funcoes {
    
    /**
     *
     * @param valorum
     * @param valordois
     * @param operador
     * @return
     */
    public static double calcularResultado(double valorum, double valordois, String operador){
        double resultado;
        switch(operador){
            case "+":
                resultado = valorum + valordois;
                break;
            case "-":
                resultado = valorum - valordois;
                break;
            case "/":
                resultado =  valorum / valordois;
                break;
            case "*":
                resultado =  valorum * valordois;
                break;
            default:
                resultado = 0;
        }
        return resultado;
        
    }
   
        
}
