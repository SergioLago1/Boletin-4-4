/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg4.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Boletin44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pulperia unPulpo = new Pulperia (Integer.parseInt(JOptionPane.showInputDialog("Introduzca los kg de pataca que teña")),Integer.parseInt(JOptionPane.showInputDialog("Introduzca los kg de pulpo que teña")));
        unPulpo.engadirPolbo(Integer.parseInt(JOptionPane.showInputDialog("Introduzca los kg de polbo que chegou no reparto")));
        unPulpo.engadirPatacas(Integer.parseInt(JOptionPane.showInputDialog("Introduzca los kg de pataca que chegou no reparto ")));
        unPulpo.amosarPatacas();
        unPulpo.amosarPolbo();
        unPulpo.clientes(unPulpo.getPataca(), unPulpo.getPulpo());
    }
    
}