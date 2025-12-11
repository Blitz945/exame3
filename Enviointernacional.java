public class Enviointernacional extends Envio {
     private double impuestoAnduana;
    
    
    public Enviointernacional (String codigo,String destinatario,double costoBase,double impuestoAnduana){
        super(codigo,destinatario,costoBase);
        this.impuestoAnduana = impuestoAnduana;

    }
    public double getimpuestoAduana(){
        return impuestoAnduana;
    }
    public void setimpuestoAduana(int impuestoAnduana){
        this.impuestoAnduana = impuestoAnduana;

    }
    @Override
    public String obternerDetalles(){
        String resultado = super.obternerDetalles();
        resultado +=" Impuesto de aduana: " + impuestoAnduana;
        return resultado;


    }
    @Override
    public double calcularcostoTotal(){
        return super.calcularcostoTotal() + this.impuestoAnduana;

    }
    
}   
