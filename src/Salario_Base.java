import java.util.Scanner;

public class Salario_Base {
    public double calcularSalarioBase() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su valor por hora: ");
        double v = entrada.nextDouble();

        System.out.println("Ingrese sus horas trabajadas: ");
        double h = entrada.nextDouble();

        double pb = v * h;

        System.out.println("Su Salario Base es de: " + pb);
        return pb;
    }
    public static void main(String[] args) {
        Salario_Base programa = new Salario_Base();
        programa.calcularSalarioBase();
    }
}