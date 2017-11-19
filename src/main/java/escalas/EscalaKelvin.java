package escalas;

public class EscalaKelvin extends Escala {
    public EscalaKelvin() {
        super(273.15, 373.15);
    }

    @Override
    Grados grados(double temperatura) {
        return new GradosKelvin(temperatura);
    }
}
