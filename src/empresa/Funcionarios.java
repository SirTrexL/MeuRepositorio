package empresa;


public class Funcionarios {
    private String nome;
    private double salario;
    private final double salarioBase = 60000;
    private final double aumentoSalMax =30000;

    public Funcionarios() {
        this.nome = nome;
        this.salario = salarioBase;
        
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void aumentarSalario(double aumentoSal) {
        ;
        salario += aumentoSal;
    }
    
    public void mostrarDadosFuncionario(String nomeFun){
        System.out.println("O funcionario chama-se: "+ nomeFun);
        System.out.println("O novo salario e:"+ this.salario);
        
    }
    
}
