package Test;

import static org.junit.jupiter.api.Assertions.*;
import mundo.Operaciones;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OperacionesTest
{
    private Operaciones op;
    @BeforeEach
    public void setUp()
    {
        op = new Operaciones(10, 5);
    }

    @Test
    public void sumar()
    {
        assertEquals(15, op.sumar());
        assertNotEquals(5, op.sumar());
        assertNotEquals(50, op.sumar());
        assertNotEquals(2, op.sumar());
    }

    @Test
    void restar()
    {
        assertEquals(5, op.restar());
        assertNotEquals(15, op.restar());
        assertNotEquals(50, op.restar());
        assertNotEquals(2, op.restar());
    }

    @Test
    void multiplicar()
    {
        assertEquals(50, op.multiplicar());
        assertNotEquals(15, op.multiplicar());
        assertNotEquals(5, op.multiplicar());
        assertNotEquals(2, op.multiplicar());
    }

    @Test
    void dividir()
    {
        assertEquals(2, op.dividir());
        assertNotEquals(15, op.dividir());
        assertNotEquals(5, op.dividir());
        assertNotEquals(50, op.dividir());
    }
}