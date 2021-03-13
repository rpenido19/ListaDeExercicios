package lista.pkg5.métodos.estáticos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ConversaoDeUnidadesDeVolume calc = new ConversaoDeUnidadesDeVolume();
        int opt;
        double resultado;

        do {

            opt = Menu();
            switch (opt) {

                case 1:
                    // 1- Litros para centímetros cúbicos
                    try {
                        System.out.println("Quantos litros deseja converter? ");
                        resultado = calc.LitrosParaCentimetrosCubicos(entrada.nextDouble());
                        System.out.println(resultado + " centímetros cúbicos. ");
                    } catch (InputMismatchException e) {
                        System.err.println("Erro - Valor digitado inválido. ");
                        entrada.next();
                    }
                    break;

                case 2:
                    // 2- Metros cúbicos para litros
                    try {
                        System.out.println("Quantos metros cúbicos deseja converter? ");
                        resultado = calc.MetrosCubicosParaLitros(entrada.nextDouble());
                        System.out.println(resultado + " litros. ");
                    } catch (InputMismatchException e) {
                        System.err.println("Erro - Valor digitado inválido. ");
                        entrada.next();
                    }
                    break;

                case 3:
                    // 3- Metros cúbicos para pés cúbicos
                    try {
                        System.out.println("Quantos metros cúbicos deseja converter? ");
                        resultado = calc.MetrosCubicosParaPesCubicos(entrada.nextDouble());
                        System.out.println(resultado + " pés cúbicos. ");
                    } catch (InputMismatchException e) {
                        System.err.println("Erro - Valor digitado inválido. ");
                        entrada.next();
                    }
                    break;

                case 4:
                    // 4- Galões americanos para polegadas cúbicas
                    try {
                        System.out.println("Quantos galões americanos deseja converter? ");
                        resultado = calc.GaloesAmericanosParaPolegadasCubicas(entrada.nextDouble());
                        System.out.println(resultado + " polegadas cúbicas. ");
                    } catch (InputMismatchException e) {
                        System.err.println("Erro - Valor digitado inválido. ");
                        entrada.next();
                    }
                    break;

                case 5:
                    // 5- Galões americanos para litros
                    try {
                        System.out.println("Quantos galões americanos deseja converter? ");
                        resultado = calc.GaloesAmericanosParaLitros(entrada.nextDouble());
                        System.out.println(resultado + " litros. ");
                    } catch (InputMismatchException e) {
                        System.err.println("Erro - Valor digitado inválido. ");
                        entrada.next();
                    }
                    break;

                case 6:
                    // 6- Sair
                    System.out.println("Obrigado por utilizar o prorama. ");
                    break;

                default:
                    System.err.println("Erro - Valor digitado inválido. ");

            }
        } while (opt != 6);
    }

    public static int Menu() {

        /*
		+---------------------------------------------+
		| Conversao De Unidades De Volume             |
		+---------------------------------------------+
		| 1- Litros para centímetros cúbicos          |
		| 2- Metros cúbicos para litros               |
		| 3- Metros cúbicos para pés cúbicos          |
		| 4- Galões americanos para polegadas cúbicas |
		| 5- Galões americanos para litros            |
		| 6- Sair                                     |
		+---------------------------------------------+
         */
        Scanner entrada = new Scanner(System.in);
        int opt = 0;
        System.out.println("+---------------------------------------------+\n| Conversao De Unidades De Volume             |\n+---------------------------------------------+\n| 1- Litros para centímetros cúbicos          |\n| 2- Metros cúbicos para litros               |\n| 3- Metros cúbicos para pés cúbicos          |\n| 4- Galões americanos para polegadas cúbicas |\n| 5- Galões americanos para litros            |\n| 6- Sair                                     |\n+---------------------------------------------+");
        if (entrada.hasNextInt()) {
            opt = entrada.nextInt();
        }
        return opt;

    }
}
