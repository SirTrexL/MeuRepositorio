package clientesbanco;

public class ClientesTeste {

    public static void main(String[] args) {
Cliente cliente1 = new Cliente("Cebolado Rabudo","20211415");
Cliente cliente2 = new Cliente("Beto Pissa","20214567");

        System.out.println("O nome do primeiro cliente é:"+cliente1.getNome()+"\nE o seu nº de cliente é:"+cliente1.getCodCliente()+"\n\n");
        System.out.println("O nome do segundo cliente é:"+cliente2.getNome()+"\nE o seu nº de cliente é:"+cliente2.getCodCliente());
    }
    
}
