package movida_car;

public class Locacao {
    private Veiculo objAluguel;
    private int dias;
   

    // Construtor para receber o veículo SUV ou Sedan e a quantidade de dias
    public Locacao(Veiculo objAluguel, int dias) {
        this.objAluguel = objAluguel;
        this.dias = dias;
    }
    
    // Método para calcular o valor da locação
    public double calcularValorLocacao() {
    	
        // Verifica se o veículo é um CarroSUV ou CarroSedan e calcula o valor da locação
        if (objAluguel instanceof CarroSuv) {
            return dias * ((CarroSuv) objAluguel).getPrecoDiaria();
        } else if (objAluguel instanceof CarroSedan) {
            return dias * ((CarroSedan) objAluguel).getPrecoDiaria();
        } else {
            // Adicione a lógica necessária para outros tipos de veículos, se aplicável
            throw new IllegalArgumentException("Tipo de veículo não suportado para locação."); 
        }
    }

    // Adiciona os métodos getVeiculo() e getDias()
    public Veiculo getObjAluguel() {
        return objAluguel;
    }

    public int getDias() {
        return dias;
    }
}
