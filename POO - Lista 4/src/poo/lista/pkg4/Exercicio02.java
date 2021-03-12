package poo.lista.pkg4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {

    public static int Menu(String veiculo1, String veiculo2) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(veiculo1 + "\n1- Mover veículo\n2- Abastecer\n\n" + veiculo2 + "\n3- Mover veículo\n4- Abastecer\n\n5- Sair");
        int opt = entrada.nextInt();

        return opt;
    }

    public static String[] RecebeDados() {
        Scanner entrada = new Scanner(System.in);
        String[] carro = new String[3];
        int combustivel = 0, tanque = 0;

        // Modelo do veículo
        System.out.println("Qual é o nome do veículo? ");
        carro[0] = entrada.nextLine();

        // Tipo de combustível
        do {
            try {
                System.out.println("Que tipo de combustível ele consome? (0 - gasolina & 1 - alcool) ");
                combustivel = entrada.nextInt();
                if (combustivel == 0 || combustivel == 1) {
                    carro[1] = String.valueOf(combustivel);
                    break;
                } // Verifica se valor informado é compatível
                else {
                    System.err.println("Erro - São válidos apenas os valores de 0 e 1! ");
                }
            } catch (InputMismatchException e) {
                System.err.println("Erro - Valor digitado inválido! ");
                entrada.next();
            }
        } // Repete o bloco quando o valor informado não for compatível
        while (combustivel != 0 || combustivel != 1);

        do {
            try {
                System.out.println("Quantos litros tem o tanque do veículo?. ");
                tanque = entrada.nextInt();
                // Verifica se o valor informado é um número positivo
                if (tanque < 40 || tanque > 50) {
                    System.err.println("Erro - O tanque pode variar de 40 a 50 litros! ");
                }
            } // Tratamento de exceção 
            catch (InputMismatchException e) {
                System.err.println("Erro - Valor digitado inválido! ");
                entrada.next();
            }
        } // Repete o bloco quando o valor informado não for compatível 
        while (tanque < 40 || tanque > 50);
        carro[2] = String.valueOf(tanque);

        return carro;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opt;

        System.out.println("Preencha os dados do primeiro veículo. ");
        String[] construtor = RecebeDados();

        Veiculo carro1 = new Veiculo(construtor[0], Integer.parseInt(construtor[1]), Integer.parseInt(construtor[2]), 0);

        System.out.println("Preencha os dados do segundo veículo. ");
        construtor = RecebeDados();

        Veiculo carro2 = new Veiculo(construtor[0], Integer.parseInt(construtor[1]), Integer.parseInt(construtor[2]), 0);

        do {

            opt = Menu(carro1.getModelo(), carro2.getModelo());

            switch (opt) {

                // Primeiro Veículo
                case 1:
                    // 1- Mover veículo
                    try {
                        System.out.println("Quantos quilometros o veículo andará?. ");
                        carro1.MoverVeiculo(entrada.nextInt());
                    } catch (InputMismatchException e) {
                        System.err.println("Erro - Valor digitado inválido! ");
                        entrada.next();
                    }
                    break;
                case 2:
                    // 2- Abastecer
                    try {
                        System.out.println("Quantos litros você irá abastecer? ");
                        carro1.Abastecer(entrada.nextInt());
                    } catch (InputMismatchException e) {
                        System.err.println("Erro - Valor digitado inválido! ");
                        entrada.next();
                    }
                    break;

                // Segundo Veículo
                case 3:
                    // 3- Mover veículo
                    try {
                        System.out.println("Quantos quilometros o veículo andará?. ");
                        carro2.MoverVeiculo(entrada.nextInt());
                    } catch (InputMismatchException e) {
                        System.err.println("Erro - Valor digitado inválido! ");
                        entrada.next();
                    }
                    break;
                case 4:
                    // 2- Abastecer
                    try {
                        System.out.println("Quantos litros você irá abastecer? ");
                        carro2.Abastecer(entrada.nextInt());
                    } catch (InputMismatchException e) {
                        System.err.println("Erro - Valor digitado inválido! ");
                        entrada.next();
                    }
                    break;

                case 5:
                    // 5- Sair
                    System.out.println("Obrigado por utilizar o programa. ");
                    break;

                default:
                    System.err.println("Erro - valor digitado inválido. ");
            }

        } while (opt != 5);

    }

}
