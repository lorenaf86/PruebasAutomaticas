package edu.pruebas.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import edu.pruebas.Calculo;

class CalculoTest {

    @Test
    void standardAssertions() {
    	Calculo a = new Calculo(5,7);
        assertEquals(a.getX(), 5);
        assertEquals(a.getY(), 7,  "Ahora el mensaje opcional de la aserción es el último parámetro.");
        assertTrue(a.sumar() == 12, () -> "Al usar una lambda para indicar el mensaje, "
                + "esta se evalúa cuando se va a mostrar (no cuando se ejecuta el assert), "
                + "de esta manera se evita el tiempo de construir mensajes complejos innecesariamente.");
    }
    
    @Test
    void sumaTest() {
    	Calculo calc = new Calculo(5, 6);
        assertEquals(11, calc.sumar(), "La salida es la suma de los dos elementos");
    }
 


}
