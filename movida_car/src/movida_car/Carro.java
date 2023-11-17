package movida_car;

public class Carro extends Veiculo {

    public Carro(String marca, String modelo, int ano, double diaria) {
        super(marca, modelo, ano, diaria);
    }
    @Override
    public void setDiaria(double valor) {
        super.setDiaria(valor * 1.1);
    }
    @Override
    public String toString() {
    	return String.format("Carro Sport - Marca = %s , Modelo = %s, Ano = %d, Diaria = %.2f R$ ", 
    			getMarca(), getModelo(), getAno(), getPrecoDiaria());
    }
}



