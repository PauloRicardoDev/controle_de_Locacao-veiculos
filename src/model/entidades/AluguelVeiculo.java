package model.entidades;

import java.util.Date;

public class AluguelVeiculo {

    private Date instante_retirada;
    private Date instante_devolucao;
    private Veiculo veiculo;
    private Fatura fatura;

    public AluguelVeiculo(){}

    public AluguelVeiculo(Date instante_saida, Date instante_devolucao, Veiculo veiculo) {
        this.instante_retirada = instante_saida;
        this.instante_devolucao = instante_devolucao;
        this.veiculo = veiculo;
    }

    public Date getInstante_retirada() {
        return instante_retirada;
    }

    public void setInstante_retirada(Date instante_retirada) {
        this.instante_retirada = instante_retirada;
    }

    public Date getInstante_devolucao() {
        return instante_devolucao;
    }

    public void setInstante_devolucao(Date instante_devolucao) {
        this.instante_devolucao = instante_devolucao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Fatura getFatura() {
        return this.fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
}
