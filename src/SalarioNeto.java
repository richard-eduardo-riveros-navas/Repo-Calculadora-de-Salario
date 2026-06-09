public class SalarioNeto {
    public static double calcularSalarioNeto(double salarioBase, double horasExtras, double descuentos) {
        double salarioNeto = salarioBase + horasExtras - descuentos;
        return salarioNeto;
    }
}