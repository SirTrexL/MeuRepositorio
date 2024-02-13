
package caneta;


public class CanetaTeste {
    Caneta caneta = new Caneta("Azul","BIC",1.1);
    public static void main(String[] args) {
        Caneta caneta = new Caneta("Azul","BIC",1.1);
        
        System.out.println("A marca da minha caneta e: "+ caneta.getMarca());
        System.out.println("A cor da minha caneta e "+ caneta.getCor());
        System.out.println("O tamanho da minha caneta e:"+ caneta.getTamanho());
    }
}
