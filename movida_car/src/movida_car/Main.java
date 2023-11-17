package movida_car;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Veiculo veiculo = new Veiculo("Toyota", "Yaris", 2022, 150.0);
        System.out.println(veiculo);

        Carro carro = new Carro("Toyota", "Corolla", 2023, 300.0);
        System.out.println(carro);
        
        CarroSedan sedan = new CarroSedan("Ford", "Fusion", 2020, 200.0);
        System.out.println(sedan);

    
        sedan.setDiaria(200.0);
        System.out.println("Nova diária do sedan com 10%: " + String.format("%.2f R$", sedan.getPrecoDiaria()));

        CarroSuv suv = new CarroSuv("Jeep", "Renegade", 2021, 250.0);
        System.out.println(suv);

        suv.setDiaria(250.0);
        System.out.println("Nova diária do SUV com 50%: " + String.format("%.2f R$", suv.getPrecoDiaria()));
    
        CarroSedan sedan1 = new CarroSedan("Ford", "Fusion", 2020, 200.0);
        CarroSuv suv1 = new CarroSuv("Jeep", "Renegade", 2021, 250.0);

        Locacao locacaoSedan = new Locacao(sedan1, 1);
        Locacao locacaoSUV = new Locacao(suv1, 1);

        System.out.println("Valor da locação do Sedan: " + String.format("%.2f R$", locacaoSedan.calcularValorLocacao()));
        System.out.println("Valor da locação do SUV: " + String.format("%.2f R$", locacaoSUV.calcularValorLocacao()));
        
        
        Scanner scanner = new Scanner(System.in);
        
        Locacao locacao = null;

        while (locacao == null) {
            scanner.nextLine();
        	System.out.println("Digite os dados para a Locação:");
            System.out.print("Escolha o veículo (Digite '1' para Sedan ou '2' para SUV): ");

            int escolhaVeiculo;
            int diasLocacao;

            if (scanner.hasNextInt()) {
                escolhaVeiculo = scanner.nextInt();
                System.out.print("Dias da locação: ");
                
                if (scanner.hasNextInt()) {
                    diasLocacao = scanner.nextInt();

                    if (escolhaVeiculo == 1) {
                        locacao = new Locacao(sedan, diasLocacao);
                    } else if (escolhaVeiculo == 2) {
                        locacao = new Locacao(suv, diasLocacao);
                    } else {
                        System.out.println("Opção inválida. Tente novamente.");
                    }
                } else {
                    scanner.next();
                    System.out.println("Opção inválida para dias da locação. Tente novamente.");
                }
            } else 
            
                scanner.next();
                System.out.println("Opção inválida para veículo. Tente novamente.");
            }
        }

       
        System.out.println("\nValor da locação: " + String.format("%.2f R$", locacao.calcularValorLocacao()));
   
        Veiculo veiculoEscolhido = locacao.getObjAluguel();

        if (veiculoEscolhido instanceof CarroSuv) {
            CarroSuv suvEscolhido = (CarroSuv) veiculoEscolhido;
            System.out.println("\nDetalhes do SUV Escolhido:");
            System.out.println("Marca: " + suvEscolhido.getMarca());
            System.out.println("Modelo: " + suvEscolhido.getModelo());
            System.out.println("Ano: " + suvEscolhido.getAno());
            System.out.println("Diária: " + String.format("%.2f R$", suvEscolhido.getPrecoDiaria()));
        } else if (veiculoEscolhido instanceof CarroSedan) {
            CarroSedan sedanEscolhido = (CarroSedan) veiculoEscolhido;
            System.out.println("\nDetalhes do Sedan Escolhido:");
            System.out.println("Marca: " + sedanEscolhido.getMarca());
            System.out.println("Modelo: " + sedanEscolhido.getModelo());
            System.out.println("Ano: " + sedanEscolhido.getAno());
            System.out.println("Diária: " + String.format("%.2f R$", sedanEscolhido.getPrecoDiaria()));
        } else {
            System.out.println("\nDetalhes do Veículo Escolhido:");
            System.out.println("Marca: " + veiculoEscolhido.getMarca());
            System.out.println("Modelo: " + veiculoEscolhido.getModelo());
            System.out.println("Ano: " + veiculoEscolhido.getAno());
            System.out.println("Diária: " + String.format("%.2f R$", veiculoEscolhido.getPrecoDiaria()));
        }

        System.out.println("Dias da Locação: " + locacao.getDias());
        System.out.println("Valor Total da Locação: " + String.format("%.2f R$", locacao.calcularValorLocacao()));
        System.out.println("A Localiza agradece a preferência!");
     
        
            if(scanner!=null)
                scanner.close();
            
            
        }

    }





