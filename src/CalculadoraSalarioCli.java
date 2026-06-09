import java.util.Scanner;

public class CalculadoraSalarioCli {

    Scanner scanner = new Scanner(System.in);
    CalculadoraSalario calc = new CalculadoraSalario();

    public void iniciar() {
        int opcion;

        do {
            System.out.println("=== Calculadora de Salario ===");
            System.out.println("1. Calcular salario base");
            System.out.println("2. Calcular pago por horas extra");
            System.out.println("3. Calcular descuentos");
            System.out.println("4. Calcular salario neto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 2:
                    System.out.print("Horas trabajadas: ");
                    int horas = scanner.nextInt();

                    System.out.print("Valor por hora: ");
                    double valor = scanner.nextDouble();

                    System.out.println("El pago por horas extra es: " + calc.calcularHorasExtras(horas, valor));
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Selecciona una opción valida");
            }

            System.out.println();

        } while (opcion != 5);
    }
}
