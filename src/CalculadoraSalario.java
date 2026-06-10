public class CalculadoraSalario {
    public double calcularSalarioNeto(double salarioBase, double horasExtras, double descuentos) {
        double salarioNeto = salarioBase + horasExtras - descuentos;
        return salarioNeto;
    }

    public double calcularSalarioBase(double v, double h) {
        return v * h;
    }

    public double calcularHorasExtra(double horas, double valor) {
        return horas * valor * 1.5;
    }

    public double calcularDescuentos(double salarioBase) {
        double salud = salarioBase * 0.04;
        double pension = salarioBase * 0.04;

        return salud + pension;
    }
}