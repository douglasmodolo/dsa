package com.estudos.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * LC 1 - Two Sum (Easy)
 * https://leetcode.com/problems/two-sum/
 * Padrão: HashMap
 * Tempo: O(n) | Espaço: O(n)
 * Ideia: para cada número, verificar se o complemento (target - num) já foi visto.
 */
public class LC0001_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> vistos = new HashMap<>(); // valor -> índice
        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];
            if (vistos.containsKey(complemento)) {
                return new int[]{vistos.get(complemento), i};
            }
            vistos.put(nums[i], i);
        }
        return new int[0];
    }
}
