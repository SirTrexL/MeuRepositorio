
package empresa;
import java.util.Scanner;
public class TesteFuncionario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Funcionarios funcionario = new Funcionarios();
        System.out.println("Qual é o nome do funcionario?");
        String novoNome = teclado.nextLine();
        funcionario.setNome(novoNome);
        System.out.println("O seu salario base entao sera: "+funcionario.getSalario());
        System.out.println("Pretende aumentar o salario deste funcionario?\n\n (sim ou não");
        novoNome = teclado.nextLine();
        
        if(novoNome == "sim"){
            funcionario.aumentarSalario(0);
        }
        funcionario.mostrarDadosFuncionario(funcionario.getNome());
    }
    
    
    
}
