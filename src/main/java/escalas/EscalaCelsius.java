package escalas;

public class EscalaCelsius extends Escala {
    public EscalaCelsius() {
        super(0, 100);
    }

    @Override
    public Grados grados(double grados) {
        return new GradosCelsius(grados);
    }
}
