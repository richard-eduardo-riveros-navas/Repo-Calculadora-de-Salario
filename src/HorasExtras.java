public class HorasExtras{

    public double calcularHorasExtras(int horasTrabajadas, double valorHora) {

        int horasNormales = 40;
        double pagoExtras = 0;

        if (horasTrabajadas > horasNormales) {
            int horasExtras = horasTrabajadas - horasNormales;
            pagoExtras = horasExtras * valorHora * 1.5;
        }

        return pagoExtras;
    }
}