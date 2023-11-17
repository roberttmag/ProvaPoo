package movida_car;

public class Locacao {
    private Veiculo objAluguel;
    private int dias;
   
    public Locacao(Veiculo objAluguel, int dias) {
        this.objAluguel = objAluguel;
        this.dias = dias;
    }
    public double calcularValorLocacao() {
        if (objAluguel instanceof CarroSuv) {
            return dias * ((CarroSuv) objAluguel).getPrecoDiaria();
        } else if (objAluguel instanceof CarroSedan) {
            return dias * ((CarroSedan) objAluguel).getPrecoDiaria();
        } else {
            throw new IllegalArgumentException("Tipo de veículo não suportado para locação."); 
        }
    }
    public Veiculo getObjAluguel() {
        return objAluguel;
    }

    public int getDias() {
        return dias;
    }
}
