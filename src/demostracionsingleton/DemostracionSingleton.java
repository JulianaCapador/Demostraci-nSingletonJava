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
public class DemostracionSingleton {

    private static DemostracionSingleton instancia;
    private String fruta;

    private DemostracionSingleton (String fruta){
        //Constructor privado 
        this.fruta = fruta;
        System.out.println("La fruta es: "+this.fruta);
        
    }
    
    public static DemostracionSingleton  getInstancia(String fruta){    
        
        if(instancia == null){
             instancia = new DemostracionSingleton(fruta);
        }else{
            System.out.println("No se puede crear porque la fruta "+fruta+ " porque ya existe un objeto");
        }
        
        return instancia;
    }
}
