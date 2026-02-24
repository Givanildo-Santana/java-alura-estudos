# Desafio — Conta Bancária no Console

Exercício em Java que simula uma conta bancária simples no terminal, permitindo consultar saldo, receber depósitos e realizar transferências.

## Conteúdos praticados

- Leitura de dados com `Scanner`
- Estruturas condicionais (`if/else`)
- Estrutura de repetição (`while`)
- Controle de fluxo com menus numéricos
- Atualização de variáveis (saldo da conta) ao longo da execução
- Formatação de saída com `System.out.printf`

## Exercício

- **ContaBancaria**: exibe os dados iniciais de uma cliente e permite interagir com a conta por meio de um menu no console:
    - Mostra os dados fixos da cliente:
        - Nome: `Jaqueline Oliveira`
        - Tipo de conta: `Corrente`
        - Saldo inicial: `R$ 2500,00`
    - Apresenta um menu com as opções:
         1. Consultar saldo
         2. Receber valor (depósito)
         3. Transferir valor
         4. Sair
    - Atualiza o saldo após cada depósito ou transferência
    - Valida valores inválidos (depósito/transferência menor ou igual a zero)
    - Impede transferências com valor maior que o saldo disponível

## Como executar

- Necessário ter Java 17 ou superior instalado
- Recomendada uma IDE como IntelliJ IDEA, Eclipse ou VS Code com suporte a Java

Passos gerais:

1. Certifique-se de que o projeto está configurado com o pacote:

    - `br.com.givanildo.alura.desafios.contabancaria`

2. Localize a classe principal:

    - `ContaBancaria.java`

3. Compile e execute a aplicação pela sua IDE **ou**, via terminal, algo equivalente a:

    - Compilação:

      ```bash
      javac src/br/com/givanildo/alura/desafios/contabancaria/ContaBancaria.java
      ```

    - Execução:

      ```bash
      java br.com.givanildo.alura.desafios.contabancaria.ContaBancaria
      ```

   > Os caminhos podem variar conforme a estrutura do seu repositório.

## Exemplo de uso

Trecho de uma interação típica no console:

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

Opção selecionada '2' Deposito

Informe o valor do deposito: 500

****************************************
Saldo após o depósito: R$ 3000,00
****************************************