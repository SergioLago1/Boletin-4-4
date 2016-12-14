/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg4.pkg4;

/**
 *
 * @author slagogonzalez
 */
public class Pulperia {
       private int kgPatacas, kgPulpo;
   
    public Pulperia(){
        
    }
    public Pulperia(int pat, int pulp){
        kgPatacas = pat;
        kgPulpo = pulp;
    }
    
    public int getPataca(){
        return kgPatacas;
    }
    public int getPulpo(){
        return kgPulpo;
    }
    public void engadirPolbo (int x){
        kgPulpo=kgPulpo+x;
    }
    public void engadirPatacas (int x){
        kgPatacas= kgPatacas + x;
    }
    public void amosarPolbo (){
        System.out.println("Ten no almacen "+ kgPulpo+" kg de pulpo");
    }
    public void amosarPatacas (){
        System.out.println("Ten no almacen "+kgPatacas+" kg de patacas");
    }
    public void clientes (int pataca,int pulpo){
        System.out.println("Puedes atender a "+pulpo/2*3+" clientes");
        
    }
}

