import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.0, 1000.0);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Abastecer por valor");
            System.out.println("2. Abastecer por litro");
            System.out.println("3. Alterar valor do litro");
            System.out.println("4. Alterar tipo de combustível");
            System.out.println("5. Verificar valor total abastecido");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser abastecido:");
                    double valorAbastecimento = scanner.nextDouble();
                    bomba.abastecerPorValor(valorAbastecimento);
                    break;
                case 2:
                    System.out.println("Digite a quantidade de litros a ser abastecida:");
                    double litrosAbastecimento = scanner.nextDouble();
                    bomba.abastecerPorLitro(litrosAbastecimento);
                    break;
                case 3:
                    System.out.println("Digite o novo valor do litro:");
                    double novoValor = scanner.nextDouble();
                    bomba.alterarValor(novoValor);
                    break;
                case 4:
                    System.out.println("Digite o novo tipo de combustível:");
                    String novoCombustivel = scanner.next();
                    bomba.alterarCombustivel(novoCombustivel);
                    break;
                case 5:
                    System.out.println("O valor total abastecido é: R$ " + bomba.getValorTotalAbastecido());
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Escolha uma opção de 1 a 6.");
            }
        }
    }
}