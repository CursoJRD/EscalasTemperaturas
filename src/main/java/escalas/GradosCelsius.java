package escalas;

class GradosCelsius extends Grados {
    private static EscalaCelsius ESCALA_CELSIUS = new EscalaCelsius();

    GradosCelsius(double grados) {
        super(grados, ESCALA_CELSIUS);
    }
}
