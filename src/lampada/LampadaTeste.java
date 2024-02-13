package lampada;

public class LampadaTeste {

    public static void main(String[] args) {
        Lampada lampada1 = new Lampada("LED",1.1,"Amarela","Phillips",120,1);
        Lampada lampada2 = new Lampada("Encandescente",1.1,"Amarela","Phillips",120,1);
        
        System.out.println("\n"+lampada1.getTipo()+"\n"+lampada1.getVoltagem()+"\n");
    }
    
}
