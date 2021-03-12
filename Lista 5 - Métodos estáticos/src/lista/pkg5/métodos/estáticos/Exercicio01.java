package lista.pkg5.métodos.estáticos;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ConversaoDeTemperatura calc = new ConversaoDeTemperatura();
        int opt;
        double resultado;

        do {

            opt = Menu();
            switch (opt) {

                case 1:
                    // 1- Celsius para Fahrenheit
                    try {
                        System.out.println("Digite a temperatura que deseja converter. ");
                        resultado = calc.CelsiusParaFahrenheit(entrada.nextDouble());
                    } catch (InputMismatchException e) {
                        System.err.println("Erro - Valor digitado inválido. ");
                        entrada.next();
                    }
                    break;

                case 2:
                    // 2- Fahrenheit para Celsius
                    try {
                        System.out.println("Digite a temperatura que deseja converter. ");
                        resultado = calc.FahrenheitParaCelsius(entrada.nextDouble());
                    } catch (InputMismatchException e) {
                        System.err.println("Erro - Valor digitado inválido. ");
                        entrada.next();
                    }
                    break;

                case 3:
                    // 3- Celsius para Kelvin
                    try {
                        System.out.println("Digite a temperatura que deseja converter. ");
                        resultado = calc.CelsiusParaKelvin(entrada.nextDouble());
                    } catch (InputMismatchException e) {
                        System.err.println("Erro - Valor digitado inválido. ");
                        entrada.next();
                    }
                    break;

                case 4:
                    // 4- Kelvin para Celsius
                    try {
                        System.out.println("Digite a temperatura que deseja converter. ");
                        resultado = calc.KelvinParaCelsius(entrada.nextDouble());
                    } catch (InputMismatchException e) {
                        System.err.println("Erro - Valor digitado inválido. ");
                        entrada.next();
                    }
                    break;

                case 5:
                    // 5- Fahrenheit para Kelvin
                    try {
                        System.out.println("Digite a temperatura que deseja converter. ");
                        resultado = calc.CelsiusParaKelvin(calc.FahrenheitParaCelsius(entrada.nextDouble()));
                    } catch (InputMismatchException e) {
                        System.err.println("Erro - Valor digitado inválido. ");
                        entrada.next();
                    }
                    break;

                case 6:
                    // 6- Kelvin para Fahrenheit
                    try {
                        System.out.println("Digite a temperatura que deseja converter. ");
                        resultado = calc.CelsiusParaFahrenheit(calc.KelvinParaCelsius(entrada.nextDouble()));
                    } catch (InputMismatchException e) {
                        System.err.println("Erro - Valor digitado inválido. ");
                        entrada.next();
                    }
                    break;

                case 7:

                    System.out.println("Obrigado por utilizar o programa. ");

                    break;

                default:

                    System.err.println("Erro - Valor digitado inválido. ");

            }

        } while (opt != 7);

    }

    public static int Menu() {

        /*
	+----------------------------+ 
	| Conversão de Temperatura   | 
	+----------------------------+ 
	| 1- Celsius para Fahrenheit | 
	| 2- Fahrenheit para Celsius | 
	| 3- Celsius para Kelvin     | 
	| 4- Kelvin para Celsius     | 
	| 5- Fahrenheit para Kelvin  | 
	| 6- Kelvin para Fahrenheit  | 
	| 7- Sair                    | 
	+----------------------------+ 
         */
        Scanner entrada = new Scanner(System.in);
        int opt = 0;
        System.out.println("+----------------------------+\n| Conversão de Temperatura   |\n+----------------------------+\n| 1- Celsius para Fahrenheit |\n| 2- Fahrenheit para Celsius |\n| 3- Celsius para Kelvin     |\n| 4- Kelvin para Celsius     |\n| 5- Fahrenheit para Kelvin  |\n| 6- Kelvin para Fahrenheit  |\n| 7- Sair                    |\n+----------------------------+");
        if (entrada.hasNextInt()) {
            opt = entrada.nextInt();
        }
        return opt;

    }
}
