package com.estudos.leetcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LC0001_TwoSumTest {

    private final LC0001_TwoSum solucao = new LC0001_TwoSum();

    @Test
    void exemplo1() {
        assertArrayEquals(new int[]{0, 1}, solucao.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void exemplo2() {
        assertArrayEquals(new int[]{1, 2}, solucao.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void numerosRepetidos() {
        assertArrayEquals(new int[]{0, 1}, solucao.twoSum(new int[]{3, 3}, 6));
    }

    @Test
    void semSolucao() {
        assertArrayEquals(new int[0], solucao.twoSum(new int[]{1, 2}, 10));
    }
}
