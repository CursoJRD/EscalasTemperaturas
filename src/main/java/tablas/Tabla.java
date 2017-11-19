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
        Grados gradosOrigen;
        while (grados <= gradosFinales) {
            gradosOrigen = escalaOrigen.grados(grados);
            sb.append(gradosOrigen + ",");
            for(Escala escala: escalasDestino) {
                sb.append(escala.grados(gradosOrigen) + ",");
            }
            sb.append("\n");
            grados += paso;
        }
        return sb.toString();
    }
}
