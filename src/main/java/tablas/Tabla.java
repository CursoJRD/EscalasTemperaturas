package tablas;

import escalas.Escala;
import escalas.Grados;

import java.util.ArrayList;
import java.util.List;

public class Tabla {
    private List<Escala> escalas = new ArrayList<>();
    private double gradosIniciales;
    private double gradosFinales;
    private double paso;

    public Tabla(double gradosIniciales, double gradosFinales, double paso) {
        this.gradosIniciales = gradosIniciales;
        this.gradosFinales = gradosFinales;
        this.paso = paso;
    }

    public void addEscala(Escala escala) {
        escalas.add(escala);
    }

    public String tabla(){
        StringBuilder sb = new StringBuilder();
        double grados = gradosIniciales;
        Escala escalaOrigen = escalas.get(0);
        Grados gradosOrigen, gradosDestino;
        while (grados <= gradosFinales) {
            sb.append(grados);
            sb.append(",");
            gradosOrigen = escalaOrigen.grados(grados);
            for(int i = 1; i < escalas.size(); i++) {
                gradosDestino = escalas.get(i).grados(gradosOrigen);
                sb.append(gradosDestino);
                sb.append(",");
            }
            sb.append("\n");
            grados += paso;
        }
        return sb.toString();
    }
}
