# Módulo 04 — Consolidando conhecimentos

Desafio final do curso que aplica todos os conceitos aprendidos — variáveis, condicionais, loops e leitura de dados — em uma aplicação real de conta bancária no console.

---

## O que foi aprendido

- Leitura de dados com `Scanner`;
- Estruturas condicionais (`if/else`);
- Estrutura de repetição (`while`);
- Controle de fluxo com menus numéricos;
- Atualização de variáveis ao longo da execução;
- Formatação de saída com `System.out.printf`.

---

## Exercício

- **ContaBancaria**: simula uma conta bancária simples no terminal com as funcionalidades:
    - Exibe os dados fixos da cliente:
        - Nome: `Jaqueline Oliveira`
        - Tipo de conta: `Corrente`
        - Saldo inicial: `R$ 2500,00`
    - Menu interativo com as opções:
        1. Consultar saldo
        2. Receber valor (depósito)
        3. Transferir valor
        4. Sair
    - Atualiza o saldo após cada operação;
    - Valida valores inválidos (≤ 0);
    - Impede transferências com valor maior que o saldo disponível.

---

## Como executar

1. Localize a classe `ContaBancaria.java` dentro de `src/`.
2. Execute pela IDE (botão **Run**) ou via terminal:

```bash
javac ContaBancaria.java
java ContaBancaria
```

---

## Exemplo de uso

```text
**************************************************
Dados inicias do cliente:

Nome:            Jaqueline Oliveira
Tipo conta:      Corrente
Saldo inicial:   R$ 2500,00
**************************************************

Operações

1. Consultar saldo
2. Receber valor (depósito)
3. Transferir valor
4. Sair

Digite a opção desejada: 2

Opção selecionada '2' Depósito

Informe o valor do depósito: 500

****************************************
Saldo após o depósito: R$ 3000,00
****************************************
```