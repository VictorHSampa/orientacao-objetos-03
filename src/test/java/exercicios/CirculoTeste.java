package exercicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class CirculoTeste {
    private Circulo c1;

    @BeforeEach
    public void beforeEach(){
        c1 = new Circulo(5.0);
    }

    @Test
    public void criarObjetoCirculo() {
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributoRaio() {
        assertEquals(5.0, c1.getRaio());
    }

    @Test
    public void metodoSetRaio() {
        c1.setRaio(10.0);
        assertEquals(10.0, c1.getRaio());
    }

    @Test
    public void metodoSetRaioIncorreto() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> c1.setRaio(-7.0));
        assertEquals("O raio deve ser positivo", exception.getMessage());
    }

    @Test
    public void metodoCalcularArea() {
        Double valorEsperado = 78.53981633974483;
        assertEquals(valorEsperado, c1.calcArea());
    }

    @Test
    public void metodoCalcularPerimetro() {
        Double valorEsperado = 31.41592653589793;
        assertEquals(valorEsperado, c1.calcPerimetro());
    }
}
