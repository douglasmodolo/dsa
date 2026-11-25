# Revisão espaçada

Controle de revisões, mantido pelo Claude durante as sessões de estudo.

## Como funciona

- **No começo de cada sessão:** antes de matéria nova, faço as revisões vencidas (data ≤ hoje). É um aquecimento de 3 a 5 perguntas.
- **Intervalos:** 1 → 3 → 7 → 14 → 30 dias.
  - Acertou bem: sobe para o próximo intervalo.
  - Acertou com dúvida: repete o mesmo intervalo.
  - Errou: volta para 1 dia.
- **No fim de cada bloco do curso:** uma **prova do bloco** com 8 a 10 perguntas misturadas, corrigida e registrada no histórico.
- **Formatos das perguntas:** múltipla escolha, "o que este código imprime / qual a complexidade", explicar com as próprias palavras, comparar duas abordagens, verdadeiro ou falso com justificativa.

## Agenda

| Assunto | Visto em | Intervalo atual | Próxima revisão | Pontos fracos |
|---|---|---|---|---|
| Big O | 2026-11-23 | 1 dia | 2026-11-25 | intuição de log n; constantes importam para n pequeno |
| Arrays | 2026-11-24 | 1 dia | 2026-11-25 | conta de endereço em bytes; índice fora dos limites; inserção no início vs fim |

## Blocos do curso

### Bloco 1: Estruturas de dados (visão geral)

- [x] Big O
- [x] Arrays
- [ ] Linked Lists
- [ ] Queues / Filas
- [ ] Hashmap
- [ ] Resumo das estruturas de dados (leitura)
- [ ] Stack / Pilha
- [ ] Binary Trees / Árvores binárias
- [ ] Grafos
- [ ] Trie
- [ ] B-Tree
- [ ] **Prova do bloco 1**

### Bloco 2: Resolução de problemas + Arrays + Strings (padrões)

- [ ] Como abordar um problema: várias soluções, comunicar o raciocínio
- [ ] Arrays estáticos vs dinâmicos; cache e arrays
- [ ] Mapas de frequência; hash para duplicados; interseção de arrays
- [ ] Two Pointers; Sliding Window
- [ ] Binary Search; Exponential Search
- [ ] Subarrays (problema complexo); problema com HashMap
- [ ] Strings: imutabilidade; inverter strings
- [ ] **Prova do bloco 2**

### Bloco 3: Linked Lists + Sorting

- [ ] Implementação de linked list
- [ ] Inverter; achar o meio; detectar ciclo; palíndromo
- [ ] Bubble sort, quick sort, merge sort (explicação + código)
- [ ] **Prova do bloco 3**

### Bloco 4: Binários + Binary Trees

- [ ] Shift, AND, OR, NOT, XOR + problemas
- [ ] Implementação de árvore binária; traversals (pre/in/post-order)
- [ ] Construir árvore a partir dos traversals
- [ ] DFS e BFS em árvores + problemas
- [ ] **Prova do bloco 4**

### Bloco 5: Grafos + Stack + Heap

- [ ] Clonar grafo; grafo direcionado; Course Schedule (207)
- [ ] Dijkstra (explicação, implementação, problema)
- [ ] Min stack; parênteses balanceados; Daily Temperatures (739); monotonic stack
- [ ] Heap (teoria, implementação, exercícios)
- [ ] **Prova do bloco 5**

### Bloco 6: LeetCode avançado + Bônus + Workshop

- [ ] LRU Cache; Knapsack; Dynamic Programming; fila circular
- [ ] Bônus: implementar um HashMap; Bloom filter; array em C
- [ ] Workshop dos 10 LeetCodes: 1, 191, 17, 21, 104, 198, 125, 155, 200, 3
- [ ] **Prova final de DSA**

### Depois: System Design

A ordem ainda não foi definida. Temas: SQL/NoSQL, filas, load balancer, API gateway, networking, auth, DNS, cache, CDN, arquitetura, microsserviços e estimativas.

## Histórico

| Data | Tipo | Assuntos | Resultado | Observações |
|---|---|---|---|---|
| 2026-11-23 | exercícios | Big O | 2/4 | errou o `while (n > 1) n /= 2` e "O(n) sempre ganha" |
