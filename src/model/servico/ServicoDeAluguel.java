package model.servico;

import model.entidades.AluguelVeiculo;
import model.entidades.Fatura;

public class ServicoDeAluguel {

    private Double precoHora;
    private Double precoDia;
    private ServicoDeImposto servicoImposto;

    public ServicoDeAluguel(Double precohora, Double precoDia, ServicoDeImposto servicoImposto) {
        this.precoHora = precohora;
        this.precoDia = precoDia;
        this.servicoImposto = servicoImposto;
    }

    public void processandoFatura(AluguelVeiculo aluguelVeiculo){
        long intante1 = aluguelVeiculo.getInstante_retirada().getTime();
        long instant2 = aluguelVeiculo.getInstante_devolucao().getTime();

        double horas = (double)(instant2 - intante1)/ 1000/60/60;
        double valorpagamentobasico;
        if (horas < 12.00){
            valorpagamentobasico = Math.ceil(horas) * precoHora;
        }else {
            valorpagamentobasico = Math.ceil(horas / 24) * precoDia;
        }

        double imposto = servicoImposto.imposto(valorpagamentobasico);

        aluguelVeiculo.setFatura(new Fatura(valorpagamentobasico, imposto));

    }

}
