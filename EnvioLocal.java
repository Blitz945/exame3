public class EnvioLocal extends Envio {
    private int distanciaKm;

     public EnvioLocal(String codigo,String destinatario,double costoBase,int distanciaKm){
        super(codigo, destinatario, costoBase);
        this.distanciaKm = distanciaKm;


    }
    public double getdistanciaKm(){
        return distanciaKm;
    }
    public void setvalorLentes(int distancia){
        this.distanciaKm = distancia;
        
    }
    @Override

    public String obternerDetalles(){
        String resultado = super.obternerDetalles();
        resultado +=" Distacia: " + distanciaKm;
        return resultado;
        
    }
    @Override

    public double calcularcostoTotal(){
        return super.calcularcostoTotal();

    }
    
}
