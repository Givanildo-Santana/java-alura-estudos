# Módulo 04 — Ordenando dados

Este módulo apresenta como ordenar listas em Java com `Collections.sort`, a interface `Comparable` e o método `sort` com `Comparator`.

---

## O que foi aprendido

- Ordenar uma lista com `Collections.sort`;
- Implementar a interface `Comparable` em classes próprias para habilitar ordenação;
- Implementar corretamente o método `compareTo` para definir a ordem dos elementos;
- Flexibilizar a ordenação via `list.sort(Comparator.comparing(...))` sem alterar a classe;
- Que `ArrayList` implementa a interface `List`, assim como `LinkedList`;
- Declarar variáveis de lista como `List` para ganhar polimorfismo e flexibilidade de trocar a implementação.

---

## Estrutura do módulo

- `projeto-screenmatch/` — `Titulo` implementa `Comparable`, lista ordenada por nome com `Collections.sort` e por ano com `Comparator`
- `desafios/` — exercícios práticos com ordenação, Comparable e polimorfismo com List

---

## Desafios

| Exercício | Classes | Descrição |
|---|---|---|
| `ex01_lista_ordenada` | `Principal` | Lista de inteiros ordenada com `Collections.sort` |
| `ex02_titulo_comparable` | `Titulo` | Classe com `Comparable` implementado |
| `ex03_implementando_collections` | `Titulo`, `Principal` | Lista de títulos ordenada com `Collections.sort` |
| `ex04_list_arraylist_linkedlist` | `Principal` | Demonstração de `ArrayList` e `LinkedList` com interface `List` |
| `ex05_polimorfismo_com_list` | `Principal` | Polimorfismo trocando implementação da mesma variável `List` |

---

## Como executar

1. Abra o projeto na sua IDE (IntelliJ IDEA, por exemplo).
2. Navegue até:

   `curso-03-trabalhando-com-listas-e-colecoes-de-dados/src/`

3. Localize a classe `Principal` do pacote desejado.
4. Execute a aplicação (botão de **Run**).