# Módulo 01 — Atividades básicas de POO

Este módulo reúne exercícios extras de programação orientada a objetos, feitos a partir do curso **“Java: aplicando a Orientação a Objetos”** da Alura.

O foco aqui é praticar os conceitos fundamentais de POO:

- criação de classes;
- definição de atributos;
- implementação de métodos (void e com retorno);
- instanciação de objetos;
- uso de um menu no console para testar os objetos.

## Estrutura do módulo

Dentro de `modulo-01-atividades-poo-basicas/src/` temos:

- `Pessoa.java`  
  Classe simples com um método que exibe uma mensagem no console (`"Olá Mundo"`), usada para treinar a criação de classes e métodos.

- `Calculadora.java`  
  Classe com um método que recebe um número como parâmetro e retorna o dobro desse valor.

- `Musica.java`  
  Classe que representa uma música, com atributos como título, artista, ano de lançamento e controle de avaliações.  
  Possui métodos para:
    - exibir a ficha técnica;
    - registrar avaliações;
    - calcular a média das avaliações.

- `Carro.java`  
  Classe que representa um carro, com atributos modelo, ano e cor.  
  Possui métodos para:
    - exibir a ficha técnica;
    - calcular a idade do veículo a partir do ano atual informado.

- `Aluno.java`  
  Classe que representa um aluno, com atributos nome e idade, além de um método para exibir essas informações formatadas.

- `Curso2Principal.java`  
  Classe principal (com `main`) que apresenta um **menu no console** permitindo escolher qual exercício executar:

    - `1 - Pessoa` → exibe a mensagem da classe `Pessoa`;
    - `2 - Calculadora` → pede um número e mostra o dobro;
    - `3 - Música` → cadastra uma música e permite visualizar/atribuir nota;
    - `4 - Carro` → cadastra um carro, mostra a ficha técnica e a idade do veículo;
    - `5 - Aluno` → cadastra um aluno e exibe as informações;
    - `6 - PARA SAIR` → encerra o programa.

## Conceitos praticados

- Classes, atributos e métodos
- Instanciação e reuso de objetos
- Interação com o usuário via console usando `Scanner`
- Estruturas condicionais (`if/else`)
- Laços de repetição (`while`)
- Organização de exercícios em um módulo específico dentro da carreira

## Como executar

1. Abra o projeto na sua IDE de preferência (IntelliJ IDEA, por exemplo).
2. Navegue até:

   `curso-02-aplicando a Orientação a Objetos/modulo-01-atividades-poo-basicas/src/`

3. Localize a classe `Curso2Principal`.
4. Execute a aplicação (botão de **Run** da IDE) para abrir o menu interativo no console.
