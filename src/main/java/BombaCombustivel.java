class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;
    private double valorTotalAbastecido;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.valorTotalAbastecido = 0.0;
    }

    public void abastecerPorValor(double valor) {
        double litrosAbastecidos = valor / valorLitro;
        if (litrosAbastecidos <= quantidadeCombustivel) {
            quantidadeCombustivel -= litrosAbastecidos;
            valorTotalAbastecido += valor;
            System.out.println("Foram abastecidos " + litrosAbastecidos + " litros.");
        } else {
            System.out.println("Não há combustível suficiente na bomba.");
        }
    }

    public void abastecerPorLitro(double litros) {
        double valorPagar = litros * valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            valorTotalAbastecido += valorPagar;
            System.out.println("O valor a ser pago é R$ " + valorPagar);
        } else {
            System.out.println("Não há combustível suficiente na bomba.");
        }
    }

    public void alterarValor(double novoValor) {
        this.valorLitro = novoValor;
    }

    public void alterarCombustivel(String novoCombustivel) {
        this.tipoCombustivel = novoCombustivel;
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        this.quantidadeCombustivel = novaQuantidade;
    }

    public double getValorTotalAbastecido() {
        return valorTotalAbastecido;
    }
}