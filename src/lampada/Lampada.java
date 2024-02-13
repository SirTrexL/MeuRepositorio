package lampada;


public class Lampada {
    private String tipo;
    private double voltagem;
    private String cor;
    private String marca;
    private double preço;
    private double potencia;
    private boolean status;

    public Lampada(String tipo, double voltagem, String cor, String marca, double preço, double potencia) {
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.cor = cor;
        this.marca = marca;
        this.preço = preço;
        this.potencia = potencia;
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreço() {
        return preço;
    }

    public double getPotencia() {
        return potencia;
    }

    public boolean isStatus() {
        return status;
    }

    public void setTipo(String tipo) {
       if((tipo == "Encandescente") || (tipo == "LED"))
        this.tipo = tipo;
       else
            System.out.println("Não pode assumir outro valor");
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void acenderLampada(){
    
    this.status = true;
    
    }
    
    public void apagarLampada(){
    
    this.status = true;
    
    }
}
