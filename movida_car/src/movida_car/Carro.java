package movida_car;

public class Carro extends Veiculo {

    // Construtor que chama o construtor da classe pai (Veiculo)
    public Carro(String marca, String modelo, int ano, double diaria) {
        super(marca, modelo, ano, diaria);
        
    }
    // Sobrescrever o método setDiaria para aplicar 10% a mais sobre o preço informado
    @Override
    public void setDiaria(double valor) {
        super.setDiaria(valor * 1.1);
    }
    
    // Sobrescrever toString para incluir informações específicas do Carro
    @Override
    public String toString() {
    	return String.format("Carro Sport - Marca = %s , Modelo = %s, Ano = %d, Diaria = %.2f R$ ", 
    			getMarca(), getModelo(), getAno(), getPrecoDiaria());
    }
}



