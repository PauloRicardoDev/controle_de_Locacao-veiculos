package model.servico;

public class ServicoImpostoBrasileiro  implements ServicoDeImposto{
    @Override
    public double imposto(double quantia) {
        if (quantia <= 100.00){
            return quantia * 0.20;
        }else {
            return quantia * 0.15;
        }
    }
}
