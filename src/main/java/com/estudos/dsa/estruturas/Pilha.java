package com.estudos.dsa.estruturas;

import java.util.NoSuchElementException;

/**
 * Pilha (LIFO) implementada com lista ligada.
 * push / pop / peek: O(1)
 */
public class Pilha<T> {

    private static class No<T> {
        final T valor;
        final No<T> proximo;

        No(T valor, No<T> proximo) {
            this.valor = valor;
            this.proximo = proximo;
        }
    }

    private No<T> topo;
    private int tamanho;

    public void push(T valor) {
        topo = new No<>(valor, topo);
        tamanho++;
    }

    public T pop() {
        T valor = peek();
        topo = topo.proximo;
        tamanho--;
        return valor;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Pilha vazia");
        }
        return topo.valor;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int size() {
        return tamanho;
    }
}
