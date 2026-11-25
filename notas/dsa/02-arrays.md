# Arrays

> Status: 🟡 visão geral vista, o aprofundamento vem depois no curso.

## Resumo da aula

- Array é uma lista de elementos, cada um numa **posição (índice) começando em 0**.
- É um **espaço contíguo na memória**: os elementos ficam um colado no outro.
- Simples, mas não tanto: é uma das estruturas mais incompreendidas da computação.

### A memória é só bits, e o tipo diz como interpretar

Os mesmos bits `1111000011110000` podem ser lidos como:

- 4 elementos de 4 bits: `[1111 0000 1111 0000]`
- 2 elementos de 8 bits: `[11110000 11110000]`
- 8 elementos de 2 bits: `[11 11 00 00 11 11 00 00]`

Por isso a linguagem precisa saber o **tipo** (o tamanho de cada elemento) para saber onde um termina e o outro começa.

### Por que o acesso é O(1)

Eu tenho um ponteiro para o **início** do array e todos os elementos têm o **mesmo tamanho**. Então não preciso varrer a memória: basta fazer uma conta.

```
endereço de arr[i] = início + i × tamanho_do_elemento
```

Exemplo com `i32` (32 bits = 4 bytes):

| Acesso | Conta | Posição |
|---|---|---|
| `arr[0]` (1º) | início + 0 × 4 | exatamente o início |
| `arr[2]` (3º) | início + 2 × 4 | início + 8 bytes |
| `arr[3]` (4º, o último de um array de 4) | início + 3 × 4 | início + 12 bytes |

A conta leva o mesmo tempo para qualquer índice, então **ler e alterar `arr[i]` é O(1)**.

> ⚠️ Num array de 4 elementos, `arr[4]` **não existe**, porque os índices vão de 0 a 3. Em Java isso lança `ArrayIndexOutOfBoundsException`; em Rust, o programa entra em pânico (`panic`).

### Tamanho fixo

- Não dá para "esticar" um array no lugar: o espaço logo depois dele na memória pode já estar ocupado.
- Para crescer, é preciso **alocar um array maior e copiar tudo**, o que é O(n).
- Por isso existem os **arrays dinâmicos**, que fazem essa cópia por você:
  - Rust: `[i32; 4]` tem tamanho fixo; `Vec<i32>` cresce.
  - Java: `int[]` tem tamanho fixo; `ArrayList<Integer>` cresce.

## Comparando linguagens

| | Declaração | Contíguo? |
|---|---|---|
| Rust | `let a: [i32; 4] = [1, 2, 3, 4];` | Sim: tipo e tamanho fixos |
| Java | `int[] a = {1, 2, 3, 4};` ou `new int[4]` | Sim: tipo e tamanho fixos |
| JavaScript | `const a = [1, 2, "banana", [1, 2]];` | Não necessariamente: aceita tipos misturados |

- **JavaScript:** na especificação, o array é um **objeto** com chaves numéricas. Os motores (como o V8) tentam guardá-lo de forma contígua quando todos os elementos são do mesmo tipo, mas misturar tipos tira essa otimização. É mais fácil para aprender e menos eficiente.
- **Java tem os dois mundos:**
  - `int[]` guarda os **valores** colados na memória (como em Rust).
  - `Integer[]` e `ArrayList<Integer>` guardam **referências** (ponteiros) contíguas, e cada `Integer` é um objeto em outro lugar da memória. O acesso ao índice continua O(1), mas há um "pulo" a mais, então é menos eficiente que `int[]`.

## Complexidades (o que já sei, e o que vem na parte aprofundada)

| Operação | Array | Visto na aula? |
|---|---|---|
| Acessar `arr[i]` | O(1) | ✅ |
| Alterar `arr[i]` | O(1) | ✅ |
| Buscar um valor (não ordenado) | O(n) | ainda não |
| Inserir/remover no **fim** (array dinâmico) | O(1) amortizado | ainda não |
| Inserir/remover no **início/meio** | O(n): precisa deslocar os elementos | ainda não |
| Crescer além da capacidade | O(n): aloca um novo e copia | ✅ (ideia) |

## Dúvidas / pontos para revisar

- [ ] Por que inserir no **início** custa O(n) e no **fim** custa O(1)?
- [ ] Como o `ArrayList` decide o tamanho novo ao crescer, e por que o `add` é "O(1) **amortizado**"?
- [ ] Diferença prática entre `int[]` e `ArrayList<Integer>` (autoboxing, memória).
