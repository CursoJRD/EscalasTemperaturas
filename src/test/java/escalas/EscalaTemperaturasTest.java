package escalas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EscalaTemperaturasTest {
    @Test
    public void escalaCelsius() {
        Escala escalaKelvin = new EscalaKelvin();
        Escala escalaCelsius = new EscalaCelsius();

        assertEquals(escalaKelvin.grados(273.15).grados, escalaKelvin.grados(escalaCelsius.grados(0)).grados);
    }

    @Test
    public void escalaKelvin() {
        Escala escalaKelvin = new EscalaKelvin();
        Escala escalaCelsius = new EscalaCelsius();

        assertEquals(escalaCelsius.grados(100).grados, escalaCelsius.grados(escalaKelvin.grados(373.15)).grados);
    }
}
