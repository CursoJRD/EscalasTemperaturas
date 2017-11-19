package escalas;

public abstract class Escala {
    private double puntoCongelacion;
    private double puntoEbullicion;

    public Escala(double puntoCongelacion, double puntoEbullicion) {
        this.puntoCongelacion = puntoCongelacion;
        this.puntoEbullicion = puntoEbullicion;
    }

    double temperatura(double lambda) {
        double temperatura = puntoCongelacion * (1 - lambda) + puntoEbullicion * lambda;
        return temperatura;
    }

    abstract Grados grados(double temperatura);

    double lambda(Grados grados) {
        double lambda = (grados.grados - puntoCongelacion) / (puntoEbullicion - puntoCongelacion);
        return lambda;
    }

    public Grados grados(Grados grados) {
        double lambda = grados.lambda();
        return grados(temperatura(lambda));
    }
}
