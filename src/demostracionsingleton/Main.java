/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracionsingleton;

/**
 *
 * @author juliana
 */
public class Main {
    
    public static void main(String[] args){
        
    DemostracionSingleton manzana = DemostracionSingleton.getInstancia("manzana");
    DemostracionSingleton naranja = DemostracionSingleton.getInstancia("naranja");
       
    }
}
