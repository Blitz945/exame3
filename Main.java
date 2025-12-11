public class Main {
    public static void main(String[] args) {
        GestorEnvios gestor = new GestorEnvios(4);

        EnvioLocal Envio1 = new EnvioLocal("uy7866", "clara",40000, 130);
        EnvioLocal Envio2= new EnvioLocal("HGF6775", "Andres",56000,300);
        Enviointernacional inter1 = new Enviointernacional("dgh7888", "pedro",  6000,   120000);
        Enviointernacional inter2= new Enviointernacional("dgh7888", "Vanesa",20000,    30000);

        gestor.agregarEnvio(Envio1);
        gestor.agregarEnvio(Envio2);
        gestor.agregarEnvio(inter1);
        gestor.agregarEnvio(inter2);
      
        double totalEnviosduana = 0.0;
        double totalcostobase = 0.0;       
        for(Envio ca : gestor.getEnvio()){
            if (ca!= null){
                System.out.println(ca.obternerDetalles());
                totalEnviosduana += ca.calcularcostoTotal();
                totalcostobase += ca.getcostoBase();
                


            }
                
            
        }
        
        System.out.println("Costo base total:" + totalcostobase);
        System.out.println("costo total de los envio realizados " + totalEnviosduana);
        




    }
}
