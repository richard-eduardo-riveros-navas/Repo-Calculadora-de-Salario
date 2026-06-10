public class CalculadoraSalario {
    public double calcularSalarioNeto(double salarioBase, double pagoExtras, double descuentos) {
        double salarioNeto = salarioBase + pagoExtras - descuentos;
        return salarioNeto;
    }
}
