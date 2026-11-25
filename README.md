# DSA em Java

Repositório de estudos: estruturas de dados, algoritmos, LeetCode e system design.
Fluxo: assistir à aula → resumir em `notas/` → implementar em `src/main` → testar em `src/test`.

## Estrutura

| Pasta | Conteúdo |
|-------|----------|
| `notas/` | Resumos das aulas em Markdown (DSA, system design, padrões de LeetCode) |
| `src/main/java/com/estudos/dsa/estruturas` | Estruturas implementadas do zero |
| `src/main/java/com/estudos/dsa/algoritmos` | Ordenação, busca, programação dinâmica |
| `src/main/java/com/estudos/leetcode` | Problemas organizados por padrão |
| `src/main/java/com/estudos/systemdesign` | Protótipos pequenos (LRU cache, rate limiter...) |
| `src/test/java/...` | Testes JUnit 5, mesma estrutura |

## Como rodar

```bash
mvn test
```

## Progresso

### DSA
- [ ] Big O 🟡 em andamento ([notas](notas/dsa/01-big-o.md))
- [ ] Arrays 🟡 em andamento ([notas](notas/dsa/02-arrays.md))
- [ ] Listas ligadas
- [ ] Pilhas e filas
- [ ] Hash tables
- [ ] Árvores / BST
- [ ] Heaps
- [ ] Grafos
- [ ] Ordenação
- [ ] Busca binária
- [ ] Programação dinâmica

### System Design
- [ ] Escalabilidade
- [ ] Load balancer
- [ ] Cache
- [ ] Bancos de dados (SQL vs NoSQL, sharding, replicação)
- [ ] Filas e mensageria

### LeetCode (1)

| # | Problema | Padrão | Dificuldade |
|---|----------|--------|-------------|
| 1 | [Two Sum](src/main/java/com/estudos/leetcode/arrays/LC0001_TwoSum.java) | HashMap | Easy |
