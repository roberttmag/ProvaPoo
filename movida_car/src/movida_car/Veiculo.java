package movida_car;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double diaria;

    // Construtor
    public Veiculo(String marca, String modelo, int ano, double diaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.diaria = diaria;
    }

   
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPrecoDiaria() {
        return diaria;
    }

   
    public void setDiaria(double valor) {
        this.diaria = valor;
    }

    // toString para representação textual do objeto
    @Override
    public String toString() {
        return String.format("Carro Simples - Marca = %s , Modelo = %s, Ano = %d, Diaria = %.2f R$", marca, modelo, ano, diaria); 
       
        
    }
    
}



