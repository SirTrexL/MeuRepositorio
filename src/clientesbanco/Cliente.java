package clientesbanco;

public class Cliente {
    private String nome;
    private String codCliente;

    public Cliente(String nome, String codCliente) {
        this.nome = nome;
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
