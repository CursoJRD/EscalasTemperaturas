package tablas;

import escalas.Escala;
import escalas.Grados;

import java.util.ArrayList;
import java.util.List;

public class Tabla {
    private Escala escalaOrigen;
    private List<Escala> escalasDestino = new ArrayList<>();
    private double gradosIniciales;
    private double gradosFinales;
    private double paso;

    public Tabla(double gradosIniciales, double gradosFinales, double paso) {
        this.gradosIniciales = gradosIniciales;
        this.gradosFinales = gradosFinales;
        this.paso = paso;
    }

    public void setEscalaOrigen(Escala escalaOrigen) {
        this.escalaOrigen = escalaOrigen;
    }

    public void addEscalaDestino(Escala escalaDestino) {
        escalasDestino.add(escalaDestino);
    }

    public String tabla(){
        StringBuilder sb = new StringBuilder();
        double grados = gradosIniciales;
        Grados gradosOrigen, gradosDestino;
        while (grados <= gradosFinales) {
            sb.append(grados);
            sb.append(",");
            gradosOrigen = escalaOrigen.grados(grados);
            for(Escala escala: escalasDestino) {
                gradosDestino = escala.grados(gradosOrigen);
                sb.append(gradosDestino);
                sb.append(",");
            }
            sb.append("\n");
            grados += paso;
        }
        return sb.toString();
    }
}
