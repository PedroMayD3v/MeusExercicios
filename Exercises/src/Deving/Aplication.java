package Deving;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Carro;

public class Aplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        // Cria a lista
        List<Carro> lista = new ArrayList<>();
        LocalDateTime d01 = LocalDateTime.parse("2022-06-01T04:01");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        int numeroCarros;
        int ver;
        int escolha;
        int tax = 0;
        int novopreco = 0;

        System.out.println("Bem-vindo! Quantos carros serão lidos?");
        numeroCarros = sc.nextInt();

        for (int i = 0; i < numeroCarros; i++) {
            // Instancia um objeto na classe Carro e adiciona à lista
            sc.nextLine();
            System.out.print("Digite a marca: ");
            String marca = sc.nextLine();
            System.out.print("Digite o modelo: ");
            String modelo = sc.nextLine();
            System.out.print("Digite o preço: ");
            int preço = sc.nextInt();
            System.out.print("Digite a placa: ");
            int placa = sc.nextInt();
            Carro carro = new Carro(marca, modelo, preço, placa);

            lista.add(carro);
        }

        System.out.println("Digite a placa do veículo para verificar o preço: ");
        ver = sc.nextInt();

        for (Carro carro : lista) {
            if (carro.getPlaca() == ver) {
                System.out.println("Preço do veículo: " + carro.getPreço());
                break;
            }
        }

        System.out.println("Digite o valor da multa: ");
        int multa = sc.nextInt();

        for (Carro carro : lista) {
            if (carro.getPlaca() == ver) {
                int novoPreco = carro.getPreço() + multa;
                carro.setPreço(novoPreco);
                System.out.println("Preço atualizado: " + novoPreco + " " + carro.getMarca());
                break;
            }
        }

        System.out.println("Você deseja inserir algum outro tipo de veículo na lista? (Y/N)");
        String resposta = sc.next();

        if (resposta.equalsIgnoreCase("Y")) {
            System.out.println("------ Escolha ------");
            System.out.println("1 - CAMINHÃO");
            System.out.println("2 - MOTO");
            System.out.println("Digite a opção: ");
            escolha = sc.nextInt();

            sc.nextLine();
            System.out.print("Digite a marca: ");
            String marca = sc.nextLine();
            System.out.print("Digite o modelo: ");
            String modelo = sc.nextLine();
            System.out.print("Digite o preço: ");
            int preço = sc.nextInt();
            System.out.print("Digite a placa: ");
            int placa = sc.nextInt();

            if (escolha == 1) {
                Carro caminhao = new Carro(marca, modelo, preço, placa);
                lista.add(caminhao);
            } else if (escolha == 2) {
                Carro moto = new Carro(marca, modelo, preço, placa);
                lista.add(moto);
            }

            System.out.println("Deseja aplicar multa a qual novo veiculo: ");
            int aux = sc.nextInt();

            System.out.println("Qual preço da nova multa?: ");
            int novaMulta = sc.nextInt();

            novopreco = 0;

            for (int i = 0; i < lista.size(); i++) {
                if (aux == lista.get(i).getPlaca()) {
                    tax = Carro.multa(lista.get(i).getPreço(), novaMulta);
                    novopreco = lista.get(i).getPreço() + tax;
                    lista.get(i).setPreço(novopreco);
                    break;
                }
   
        }

        System.out.println("Lista de veículos atualizados com multas: ");
        for (Carro carro : lista) {
            System.out.println(carro);
        }

        System.out.println("Programa feito e terminado em: " + d01.format(fmt1));
        sc.close();
    }
}
}