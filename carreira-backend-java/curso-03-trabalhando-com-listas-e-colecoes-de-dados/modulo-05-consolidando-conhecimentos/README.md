# Módulo 05 — Consolidando conhecimentos

Desafio final do curso que aplica todos os conceitos aprendidos — listas, ordenação, construtores e encapsulamento — em uma aplicação de cartão de crédito com registro de compras.

---

## O que foi aprendido

- Aplicar listas e ordenação em uma aplicação real;
- Organizar responsabilidades entre classes;
- Usar `Comparator` para ordenar compras por valor;
- Encapsulamento e validação de dados no construtor.

---

## Desafio

Aplicação de cartão de crédito no console com as funcionalidades:

- Informar o limite do cartão;
- Registrar compras com descrição e valor;
- Validar se há limite disponível antes de realizar a compra;
- Exibir lista de compras ordenadas por valor ao sair;
- Exibir o limite disponível ao final.

---

## Estrutura do módulo

```
modulo05.desafios/
├── model/
│   ├── Cartao.java          — limite, validação no construtor e débito de compras
│   ├── Compra.java          — descrição e valor com toString formatado
│   └── ValidadorCompra.java — valida se o valor da compra cabe no limite do cartão
└── principal/
    └── Principal.java       — menu interativo com Scanner e lista ordenada por Comparator
```

---

## Como executar

1. Abra o projeto na sua IDE (IntelliJ IDEA, por exemplo).
2. Navegue até:

   `curso-03-trabalhando-com-listas-e-colecoes-de-dados/src/`

3. Localize a classe `Principal` do pacote `modulo05.desafios`.
4. Execute a aplicação (botão de **Run**) e siga o menu no console.