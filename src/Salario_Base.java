import java.util.Scanner;
    public class Salario_Base {
        public double calcularSalarioBase(double v,double h,double pb) {

            pb = v * h;


            Scanner entrada=new Scanner (System.in);
            System.out.println("Ingrese su valor por hora: ");
            v=entrada.nextDouble();
            System.out.println("Ingrese sus horas trabajadas: ");
            h=entrada.nextDouble();
            System.out.println("Su Salario Base es de: "+pb);
            return pb;

        }
    }

