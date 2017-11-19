package escalas;

abstract class Grados {
    double grados;
    Escala escala;

    public Grados(double grados, Escala escala) {
        this.grados = grados;
        this.escala = escala;
    }

    double lambda() {
        return escala.lambdaDesdeGrados(this);
    }
}
