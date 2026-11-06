package br.pucrs.gcs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    private final Calculadora calc = new Calculadora();

    @Test
    void deveSomarDoisNumeros() {
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    void deveDividirDoisNumeros() {
        assertEquals(5, calc.dividir(10, 2));
    }

    @Test
    void deveLancarErroAoDividirPorZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
    }
}