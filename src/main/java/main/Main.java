package main;

import escalas.EscalaCelsius;
import escalas.EscalaKelvin;
import tablas.Tabla;

public class Main {
    public static void main(String[] args) {
        Tabla tabla = new Tabla(0, 100, 10);
        tabla.setEscalaOrigen(new EscalaCelsius());
        tabla.addEscalaDestino(new EscalaKelvin());
        System.out.println(tabla.tabla());
    }
}
