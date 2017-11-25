package escalas;

public abstract class Escala {
    private double puntoCongelacion;
    private double puntoEbullicion;

    public Escala(double puntoCongelacion, double puntoEbullicion) {
        this.puntoCongelacion = puntoCongelacion;
        this.puntoEbullicion = puntoEbullicion;
    }

    double gradosDesdeLambda(double lambda) {
        double grados = puntoCongelacion * (1 - lambda) + puntoEbullicion * lambda;
        return grados;
    }

    double lambdaDesdeGrados(Grados grados) {
        double lambda = (grados.grados - puntoCongelacion) / (puntoEbullicion - puntoCongelacion);
        return lambda;
    }

    public Grados grados(Grados grados) {
        double lambda = grados.lambda();
        return grados(gradosDesdeLambda(lambda));
    }

    public abstract Grados grados(double grados);
}
