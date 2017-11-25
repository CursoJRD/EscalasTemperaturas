package escalas;

public abstract class Grados {
    double grados;
    Escala escala;

    public Grados(double grados, Escala escala) {
        this.grados = grados;
        this.escala = escala;
    }

    double lambda() {
        return escala.lambdaDesdeGrados(this);
    }

    @Override
    public String toString() {
        return "" + grados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grados grados1 = (Grados) o;

        if (Double.compare(grados1.grados, grados) != 0) return false;
        return escala.equals(grados1.escala);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(grados);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + escala.hashCode();
        return result;
    }
}
