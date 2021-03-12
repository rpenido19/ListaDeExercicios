package poo.lista.pkg4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Televisao televisao = new Televisao(0, 1);
        Scanner entrada = new Scanner(System.in);
        int opt;
        do {
            opt = Menu();

            switch (opt) {
                case 1:
                    // 1- Consulta
                    televisao.ConsultaTv();
                    break;
                case 2:
                    //2- Aumentar Volume
                    televisao.VolumeMais();
                    break;
                case 3:
                    // 3- Diminuir Volume
                    televisao.VolumeMenos();
                    break;
                case 4:
                    // 4- Próximo Canal
                    televisao.CanalSeguinte();
                    break;
                case 5:
                    // 5- Canal Anterior
                    televisao.CanalAnterior();
                    break;
                case 6:
                    // 6- Digitar Canal
                    try {
                        System.out.println("Deseja mudar para qual canal? ");
                        televisao.MudaCanal(entrada.nextInt());
                    } catch (InputMismatchException e) {
                        System.err.println("Erro - Valor digitado não é numérico! ");
                        entrada.next();
                    }
                    break;
                case 7:
                    // 7- Sair
                    System.out.println("Obrigado por utilizar o programa. ");
                    break;
                default:
                    System.err.println("Erro - Valor digitado inválido! ");
            }

        } while (opt != 7);
    }

    public static int Menu() {
        Scanner entrada = new Scanner(System.in);
        int opt = 0;

        System.out.print("+----------------------+\n| Televisão            |\n+----------------------+\n| 1- Consulta          |\n| 2- Aumentar Volume   |\n| 3- Diminuir Volume   |\n| 4- Próximo Canal     |\n| 5- Canal Anterior    |\n| 6- Digitar Canal     |\n| 7- Sair              |\n+----------------------+\n");
        if (entrada.hasNextInt()) {
            opt = entrada.nextInt();
        }

        return opt;
    }
}
