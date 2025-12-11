public class Envio {

    private String codigo;
    private String destinatario;
    private double costoBase;

    public Envio (String codigo, String destinatario, double costoBase){
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.costoBase = costoBase;

    }
    public String getCodigo(){
        return codigo;
    }
    public String gerDestinatario(){
        return destinatario;

    }
     public void setDestinatario(String destinatario){
        this.destinatario = destinatario;

    }
    public double getcostoBase(){
        return costoBase;

    }
    public void setcostoBase(double costoBase){
        this.costoBase = costoBase;

    }

    public String obternerDetalles(){
        return " Codigo " + codigo + " Destinatario " + destinatario + " Costo Base: " + costoBase;

    }
  
    public double calcularcostoTotal(){
        return getcostoBase();
        

    }
}  