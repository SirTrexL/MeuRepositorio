
package caneta;

public class Caneta {
private String marca;
private String cor;
private double tamanho;

public Caneta(String cor,String marca,double tamanho){
this.cor = cor;
this.marca = marca;
this.tamanho = tamanho;
}

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    public void introduzirDados(){
    
    
    }

    
}
