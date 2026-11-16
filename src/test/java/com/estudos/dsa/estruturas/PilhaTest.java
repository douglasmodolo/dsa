package com.estudos.dsa.estruturas;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest {

    @Test
    void novaPilhaEstaVazia() {
        Pilha<Integer> pilha = new Pilha<>();
        assertTrue(pilha.isEmpty());
        assertEquals(0, pilha.size());
    }

    @Test
    void popRetornaEmOrdemLifo() {
        Pilha<Integer> pilha = new Pilha<>();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        assertEquals(3, pilha.pop());
        assertEquals(2, pilha.pop());
        assertEquals(1, pilha.pop());
        assertTrue(pilha.isEmpty());
    }

    @Test
    void peekNaoRemove() {
        Pilha<String> pilha = new Pilha<>();
        pilha.push("a");
        assertEquals("a", pilha.peek());
        assertEquals(1, pilha.size());
    }

    @Test
    void popEmPilhaVaziaLancaExcecao() {
        assertThrows(NoSuchElementException.class, () -> new Pilha<>().pop());
    }
}
