public class GestorEnvios {
    private Envio[] envios;
    private int contador;

    public GestorEnvios(int cantidad){
        envios =  new Envio[cantidad];
        contador = 0;

    }
    public void agregarEnvio(Envio ca){
        if (contador < envios.length) {
            envios[contador] = ca;
            contador ++;
            
        }else{
            System.out.println("No se puede agregar mas envios");
        }
    }
        
    public  Envio[] getEnvio() {
        return envios;
    }
    public int getcontador(){
        return contador;
    }

    
}