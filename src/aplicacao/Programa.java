package aplicacao;

import model.entidades.AluguelVeiculo;
import model.entidades.Veiculo;
import model.servico.ServicoDeAluguel;
import model.servico.ServicoImpostoBrasileiro;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Informe o modelo do veículo: ");
            var modelo = sc.nextLine();
            System.out.print("Informe a marca do veículo: ");
            var marca = sc.nextLine();
            System.out.print("Informe o modelo do veículo: ");
            var ano = sc.nextLine();
            System.out.print("Informe a data de retirada do veículo: ");
            var retirada = sdf.parse(sc.nextLine());
            System.out.print("Informe a data de devolução do veículo: ");
            var devolucao = sdf.parse(sc.nextLine());

            AluguelVeiculo aluguelVeiculo = new AluguelVeiculo(retirada, devolucao, new Veiculo(modelo,
                    marca, ano));

            System.out.print("Informe o valor cobrado por hora de locação: ");
            var valorHora = sc.nextDouble();

            System.out.print("Informe o valor cobrado por dia de locação: ");
            var valorDia = sc.nextDouble();

            ServicoDeAluguel servicoDeAluguel =
                    new ServicoDeAluguel(valorHora, valorDia, new ServicoImpostoBrasileiro());

            servicoDeAluguel.processandoFatura(aluguelVeiculo);

            System.out.println("FATURA");
            System.out.println(aluguelVeiculo.getVeiculo());
            System.out.println("Pagemento Básico: R$" + String.format("%.2f",
                    aluguelVeiculo.getFatura().getPagamentoBasico()));
            System.out.println("Imposto: R$" + String.format("%.2f",
                    aluguelVeiculo.getFatura().getImposto()));
            System.out.println("Pagemento Total: R$" + String.format("%.2f",
                    aluguelVeiculo.getFatura().getPagamentoTotal()));

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
