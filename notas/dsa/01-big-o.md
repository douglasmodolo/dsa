# Big O

> Status: 🟡 em andamento. Primeira aula vista, preciso estudar mais.

## Resumo da aula

- Big O fala de **escalabilidade**, não necessariamente de **performance**: descreve como o custo **cresce** quando o input cresce.
- **Complexidade de tempo**: quanto tempo (nº de operações) o algoritmo leva.
- **Complexidade de espaço**: quanta memória **adicional** precisa ser alocada.
- Na maioria das vezes, analisamos o **pior caso** (visão pessimista). Às vezes se fala do caso **médio**, por exemplo: `HashMap.get` é O(1) em média, mas pode degradar com muitas colisões.

Da que mais escala para a que menos escala:

```
O(1) > O(log n) > O(n) > O(n log n) > O(n²) > O(2ⁿ)
```

## Complexidades comuns

| Notação | Nome | Exemplo |
|---------|------|---------|
| O(1) | Constante | Acessar `arr[0]` (qualquer índice), independente do tamanho |
| O(log n) | Logarítmica | Busca binária; loop que divide `n` por 2 a cada volta |
| O(n) | Linear | Percorrer um array; busca linear |
| O(n log n) | Linearítmica | Merge sort, heap sort, quicksort (caso médio) |
| O(n²) | Quadrática | Dois loops aninhados sobre o mesmo input |
| O(2ⁿ) | Exponencial | Fibonacci recursivo ingênuo (ainda vou ver) |

### O(log n) e a busca binária

- **Pré-requisito: o array precisa estar ordenado.** É isso que permite descartar metade a cada passo.
- Cada passo corta o problema pela metade, então **dobrar o input acrescenta só +1 passo**.
  - `log2(10) ≈ 3,3`, `log2(20) ≈ 4,3`, `log2(40) ≈ 5,3`: cada um é o anterior +1.
- Exemplo: achar o 3 em `[1..20]`:
  1. meio = índice `(0+19)/2 = 9`, ou seja, o elemento **10**. 3 < 10, então descarto o 10 e a direita. Sobra `[1..9]`.
  2. meio = **5**. Descarto o 5 e a direita. Sobra `[1..4]`.
  3. meio = **2**. Descarto o 2 e a esquerda. Sobra `[3, 4]`.
  4. meio = **3**. Achei. Foram 4 etapas. Com `[1..10]` foram 3 etapas: **dobrou o array, +1 etapa**.

Comparando no **pior caso**:

| Tamanho | Busca linear O(n) | Busca binária O(log n) |
|---|---|---|
| 10 | 10 passos | ~4 |
| 20 | 20 passos | ~5 |
| 1.000.000 | 1.000.000 | ~20 |

### O(n log n)

- Merge sort: divide o array ao meio até sobrar 1 elemento (são **log n níveis**). Em cada nível, juntar tudo de forma ordenada custa **O(n)**. Total: **n × log n**.
- Ordenações "boas" por comparação são O(n log n). As "ingênuas" (bubble, insertion, selection) são O(n²).

### O(n²)

```java
for (int x : arr) {
    for (int y : arr) { ... }
}
```

- É O(n²) quando os dois loops percorrem o **mesmo** input. Com dois inputs diferentes, é **O(n·m)**.
- `for j = i + 1` (comparar todos os pares) **continua O(n²)**: n(n−1)/2 = n²/2 − n/2, que simplifica para O(n²).

### Espaço

- Devolver um array com o dobro de cada elemento: um array novo de tamanho n, então **O(n) de espaço**.
- Somar os elementos: só uma variável `soma`, então **O(1) de espaço** (o tempo continua O(n)).

## Regras de simplificação

1. **Descartar constantes**: O(2n) vira O(n); O(n²/2) vira O(n²).
2. **Descartar termos menores**: O(n² + n) vira O(n²).
3. Loops **em sequência** se **somam**: O(n) + O(n) = O(n).
4. Loops **aninhados** se **multiplicam**: O(n) × O(n) = O(n²).

## Escalabilidade ≠ performance

Big O ignora constantes. Por exemplo, um O(n) com 1000 operações por elemento contra um O(n²) com 1 operação por par:

| n | O(n) × 1000 | O(n²) | Mais rápido |
|---|---|---|---|
| 10 | 10.000 | 100 | O(n²) |
| 1.000 | 1.000.000 | 1.000.000 | empate |
| 1.000.000 | 10⁹ | 10¹² | O(n) |

O Big O garante que o O(n) vence **a partir de algum n**, não sempre. Exemplo real: o `Arrays.sort` do Java usa insertion sort (O(n²)) em pedaços pequenos do array.

## Exercícios que respondi

| # | Código | Minha resposta | Correto |
|---|---|---|---|
| 1 | dois loops `0..n` em sequência | O(2n) → O(n) | ✅ |
| 2 | loop aninhado com `j = i + 1` | O(n²) | ✅ |
| 3 | `while (n > 1) n = n / 2;` | não soube | ❌ O(log n): dobrar n acrescenta +1 volta, igual à busca binária |
| 4 | O(n)×1000 vs O(n²), para n = 10 | "O(n) sempre ganha" | ❌ para n pequeno, o O(n²) ganha (ver tabela acima) |

## Dúvidas / pontos para revisar

- [ ] **Intuição de log n**: refazer à mão a tabela do `while (n > 1) n /= 2` para n = 16, 32 e 64.
- [ ] Constantes vs crescimento: por que o Big O "esconde" as constantes.
- [ ] Ver O(2ⁿ) e a complexidade de espaço de recursão (pilha de chamadas).
