# Projeto ScreenMatch

Projeto principal do curso **"Java: aplicando a Orientação a Objetos"** da Alura, desenvolvido e evoluído ao longo dos módulos.

O ScreenMatch é um catálogo de filmes e séries no console, usado para praticar os conceitos de POO na prática.

---

## Estrutura do projeto

```
projeto-screenmatch/src/
└── br/com/givanildo/screenmatch/
    ├── model/
    │   ├── Titulo.java       — classe base com atributos e métodos comuns a filmes e séries
    │   ├── Filme.java        — herda de Titulo, adiciona atributo diretor
    │   ├── Serie.java        — herda de Titulo, calcula duração com base em temporadas e episódios
    │   └── Episodio.java     — implementa Classificavel com base no total de avaliações
    ├── calculos/
    │   ├── CalculadoraDeTempo.java   — acumula o tempo total de filmes e séries via polimorfismo
    │   ├── Classificavel.java        — interface com o método getClassificacao()
    │   └── FiltroRecomendacao.java   — filtra títulos com base na classificação
    └── principal/
        └── principal.br.com.givanildo.modulo02.desafios.Principal.java    — classe principal com o método main
```

---

## Conceitos praticados

- Organização por pacotes (`br.com.givanildo.screenmatch`);
- Separação de responsabilidades (`model/`, `calculos/` e `principal/`);
- Encapsulamento com atributos `private`, getters e setters;
- Herança — `Filme` e `Serie` herdam de `Titulo`;
- Polimorfismo com `@Override` em `getDuracaoEmMinutos()` na classe `Serie`;
- Polimorfismo na `CalculadoraDeTempo`, que recebe qualquer `Titulo`;
- Interface `Classificavel` implementada por `Filme`, `Serie` e `Episodio`;
- `FiltroRecomendacao` que recebe qualquer `Classificavel` — polimorfismo com interface;
- Métodos de avaliação e cálculo de média.

---

## Como executar

1. Abra o projeto na sua IDE de preferência (IntelliJ IDEA, por exemplo).
2. Navegue até:

   `projeto-screenmatch/src/br/com/givanildo/screenmatch/principal/`

3. Localize a classe `principal.br.com.givanildo.modulo02.desafios.Principal`.
4. Execute a aplicação pelo botão de **Run** da IDE.