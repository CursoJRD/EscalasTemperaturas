package escalas;

class GradosKelvin extends Grados {
    private static EscalaKelvin ESCALA_KELVIN = new EscalaKelvin();

    GradosKelvin(double temperatura) {
        super(temperatura, ESCALA_KELVIN);
    }
}
