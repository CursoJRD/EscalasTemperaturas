package escalas;

public class EscalaKelvin extends Escala {
    public EscalaKelvin() {
        super(273.15, 373.15);
    }

    @Override
    public Grados grados(double grados) {
        return new GradosKelvin(grados);
    }
}
