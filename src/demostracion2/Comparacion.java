/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion2;

/**
 *
 * @author juliana
 */
public class Comparacion {
    
     public void comparar(){
        SingletonDem frutica1;
        SingletonDem frutica2;
        
        frutica1 = SingletonDem.getInstancia();
        frutica2 = SingletonDem.getInstancia();
        
        frutica1.setValor("Manzana");
       //System.out.println(frutica2.getValor()); 
        
        if(frutica1.equals(frutica2)){
            System.out.println("Estan tomando una sola instancia: "+frutica1.getValor()+" == "+frutica2.getValor());
        }
    }
}
