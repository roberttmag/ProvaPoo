package movida_car;

public class CarroSuv extends Veiculo {

    // Construtor que chama o construtor da classe pai (Veiculo)
    public CarroSuv(String marca, String modelo, int ano, double diaria) {
        super(marca, modelo, ano, diaria);
    }

    // Sobrescrever o método setDiaria para aplicar 50% a mais sobre o preço informado
    @Override
    public void setDiaria(double valor) {
        super.setDiaria(valor * 1.5); 
    }

    // Sobrescrever toString para incluir informações específicas do CarroSUV
    @Override
    public String toString() {
    	return String.format("Carro SUV  - Marca = %s, Modelo = %s, Ano = %d, Diaria = %.2f R$",
    			getMarca(), getModelo(), getAno(), getPrecoDiaria());
    }
}
