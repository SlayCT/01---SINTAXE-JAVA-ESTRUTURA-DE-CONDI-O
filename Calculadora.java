import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("MENU DE OPÇÕES:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Raiz quadrada");
        System.out.print("Escolha uma opção: ");

        int opcao = sc.nextInt();

        switch(opcao) {

            case 1:
                System.out.print("Digite o primeiro número: ");
                double a = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                double b = sc.nextDouble();
                System.out.println("Resultado: " + (a + b));
                break;

            case 2:
                System.out.print("Digite o primeiro número: ");
                a = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                b = sc.nextDouble();
                System.out.println("Resultado: " + (a - b));
                break;

            case 3:
                System.out.print("Digite o primeiro número: ");
                a = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                b = sc.nextDouble();
                System.out.println("Resultado: " + (a * b));
                break;

            case 4:
                System.out.print("Digite o primeiro número: ");
                a = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                b = sc.nextDouble();
                
                if (b != 0) {
                    System.out.println("Resultado: " + (a / b));
                } else {
                    System.out.println("Não pode dividir por zero!");
                }
                break;

            case 5:
                System.out.print("Digite um número: ");
                a = sc.nextDouble();
                System.out.println("Resultado: " + Math.sqrt(a));
                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}