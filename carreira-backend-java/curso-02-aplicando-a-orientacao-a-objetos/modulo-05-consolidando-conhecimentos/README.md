# Módulo 05 — Consolidando conhecimentos

Desafio final do curso que aplica todos os conceitos de POO aprendidos — abstração, herança, encapsulamento e polimorfismo — em uma aplicação de cadastro de músicas e podcasts.

---

## O que foi aprendido

- Abstração com classe base `Audio`;
- Encapsulamento com atributos `private`, getters e setters;
- Herança — `Musica` e `Podcast` estendem `Audio`;
- Polimorfismo com `@Override` em `getClassificacao()`;
- Separação de responsabilidades com a classe `Preferidas`;
- Organização por pacotes (`model` e `principal`).

---

## Estrutura do módulo

```
br.com.givanildo.modulo05.ex/
├── model/
│   ├── Audio.java       — classe base com titulo, totalReproducoes, totalCurtidas
│   ├── Musica.java      — herda Audio, adiciona album, artista e genero
│   ├── Podcast.java     — herda Audio, adiciona apresentador e descricao
│   └── Preferidas.java  — recebe qualquer Audio e exibe mensagem com base na classificacao
└── principal/
    └── Principal.java   — menu interativo para cadastrar música ou podcast e verificar preferência
```

---

## Regras de classificação

| Classe | Condição | Classificação |
|---|---|---|
| `Musica` | Mais de 2000 reproduções | 10 |
| `Musica` | Até 2000 reproduções | 7 |
| `Podcast` | Mais de 500 curtidas | 10 |
| `Podcast` | Até 500 curtidas | 8 |

---

## Como executar

1. Abra o projeto na sua IDE (IntelliJ IDEA, por exemplo).
2. Navegue até:

   `curso-02-aplicando-a-orientacao-a-objetos/modulo-05-consolidando-conhecimentos/src/`

3. Localize a classe `Principal`.
4. Execute a aplicação (botão de **Run**) e siga o menu no console.