package model.entidades;

public class Veiculo {

    private String modelo;
    private String marca;
    private String ano;

    public Veiculo(){}

    public Veiculo(String modelo, String marca, String ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Veiculo(" +
                "Modelo: '" + modelo + '\'' +
                ", Marca: '" + marca + '\'' +
                ", Ano: '" + ano + '\'' +
                ')';
    }
}
