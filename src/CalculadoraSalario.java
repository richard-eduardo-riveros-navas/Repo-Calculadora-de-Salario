public class CalculadoraSalario {


    public double calcularSalarioBase(double v, double h) {
        return v * h;
    }

    public double calcularHorasExtra(double horas, double valor) {
        return horas * valor * 1.5;
    }

}