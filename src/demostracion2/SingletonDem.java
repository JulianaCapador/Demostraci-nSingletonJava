package demostracion2;

/**
 *
 * @author juliana
 */
public class SingletonDem {
    
    private static SingletonDem instancia;
    private String valor;
    
    
    private SingletonDem(){
        //Constructor Privado
    }
    
    public static SingletonDem getInstancia(){
        
        if (instancia == null){
            instancia = new SingletonDem();
        }
        
        return instancia;
    }
    
    public void instancia(String fruta){
        System.out.println(fruta);
    }

    public void setValor(String fruta) {
        this.valor = fruta;
    }

    public String getValor() {
        return valor;
    }
}
