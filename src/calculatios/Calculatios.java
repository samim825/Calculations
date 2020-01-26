/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatios;

/**
 *
 * @author User
 */
public class Calculatios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Formulas formulas = new Formulas();
        
        System.out.println(formulas.countDigit(100));
        
        if(formulas.isLeapYear(2016)){
            System.out.println("Leap year");
        }
        else
            System.out.println("Not leap year");
        
    }
    
}
