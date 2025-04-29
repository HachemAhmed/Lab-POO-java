import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Corrida p = new Corrida();

        System.out.print("Digite o modelo: ");
        String modelo = scanner.nextLine();
        p.setModelo(modelo);

        System.out.print("Digite o motor: ");
        float motorização = scanner.nextFloat();
        scanner.nextLine();
        p.setMotorização(motorização);

        System.out.print("Digite o fabricante: ");
        String fabricante = scanner.nextLine();
        p.setFabricante(fabricante);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        p.setNome(nome);

        System.out.print("Digite a quilometragem inicial: ");
        int quilometragemInicial = scanner.nextInt();
        scanner.nextLine();
        p.setQuilometragemInicial(quilometragemInicial);

        System.out.print("Digite o quilometragem final: ");
        int quilometragemFinal = scanner.nextInt();
        scanner.nextLine();
        p.setQuilometragemFinal(quilometragemFinal);

        p.imprimir();
        scanner.close();
    }
}
