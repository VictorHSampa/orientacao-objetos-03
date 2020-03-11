package exercicios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTeste {
    private Retangulo r1;

    @BeforeEach
    public void beforeEach(){
        r1 = new Retangulo(4.0, 5.0);
    }

    @Test
    public void criarObjetoRetangulo() {
        assertNotNull(r1);
    }

    @Test
    public void presencaAtributoBase() {
        assertEquals(4.0, r1.getBase());
    }

    @Test
    public void presencaAtributoAltura() {
        assertEquals(5.0, r1.getAltura());
    }

    @Test
    public void metodoSetBaseCorreto() {
        r1.setBase(10.0);
        assertEquals(10.0, r1.getBase());
    }

    @Test
    public void metodoSetAlturaCorreto() {
        r1.setAltura(10.0);
        assertEquals(10.0, r1.getAltura());
    }

    @Test
    public void metodoSetBaseIncorreto() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> r1.setBase(-3.0));
        assertEquals("A base deve ser positiva", exception.getMessage());
    }

    @Test
    public void metodoSetAlturaIncorreto() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> r1.setAltura(-3.0));
        assertEquals("A altura deve ser positiva", exception.getMessage());
    }

    @Test
    public void metodoCalcularArea() {
        Double valorEsperado = 20.0;
        assertEquals(valorEsperado, r1.calcArea());
    }

    @Test
    public void metodoCalcularPerimetro() {
        Double valorEsperado = 18.0;
        assertEquals(valorEsperado, r1.calcPerimetro());
    }
}
