# Carreira — Desenvolvedor Back-end Java (Alura)

Estudos, exercícios e desafios realizados na carreira **Desenvolvedor Back-end Java** da Alura.

Os materiais estão organizados por curso, e dentro de cada curso por módulos e desafios.

---

## 🗺️ Estrutura da Carreira

A carreira é dividida em **Base** + **3 Níveis**, totalizando 63 cursos e mais de 500 horas de conteúdo:

| Etapa | Foco | Cursos | Carga |
|---|---|---|---|
| 🟢 Base | Fundamentos de Programação | 2 | — |
| 🔵 Nível 1 | Aplicações Web com Java e Spring | 24 | 190h |
| 🔵 Nível 2 | APIs Seguras, Microsserviços e CI/CD | 16 | 152h |
| 🔵 Nível 3 | Sistemas Reativos, Observabilidade e Arquitetura Avançada | 18 | 168h |

---

## 📁 Cursos neste repositório

### 🟢 Base — Fundamentos de Programação

- `base-fundamentos-de-programacao/curso-01-boas-vindas-e-primeiros-passos/`
  Curso introdutório da carreira, focado em orientação:
  - estrutura da carreira e certificados;
  - navegação na plataforma Alura;
  - equipe de apoio (fórum, Discord, Luri);
  - dicas de estudo e hábitos.

- `base-fundamentos-de-programacao/curso-02-pensamento-computacional/`
  Fundamentos da computação e lógica de programação:
  - pensamento computacional e decomposição de problemas;
  - algoritmos e fluxogramas;
  - lógica de programação (pseudocódigo);
  - linguagens de programação e compiladores.

### 🔵 Nível 1 — Aplicações Web com Java e Spring

- `curso-01-criando-sua-primeira-aplicacao/`
  Curso introdutório de Java, focado em:
  - instalação e configuração do ambiente (JDK + IntelliJ);
  - tipos de dados, variáveis e operações básicas;
  - leitura de dados com `Scanner`;
  - condicionais (`if/else`) e loops (`for`, `while`);
  - criação de menus no console.

  Estrutura do curso:
  - `modulo-01-primeiro-programa-em-java/` — configuração do ambiente, JVM/JRE/JDK, primeiro programa
  - `modulo-02-construindo-o-catalogo-de-filmes/` — variáveis, tipos primitivos, casting e operações
  - `modulo-03-controlando-o-fluxo-da-aplicacao/` — `Scanner`, `if/else`, `for/while` (menu, tabuada, par/ímpar, fatorial)
  - `modulo-04-consolidando-conhecimentos/` — simulador de conta bancária no console
  - `docs/` — certificado do curso

- `curso-02-aplicando-a-orientacao-a-objetos/`
  Curso de POO, focado em:
  - criação de classes, atributos e métodos;
  - encapsulamento com `private`, getters e setters;
  - uso de `this`;
  - organização por pacotes (`br.com.givanildo...`);
  - herança, polimorfismo e interfaces;
  - modelagem de um projeto real (ScreenMatch).

  Estrutura do curso:
  - `modulo-01-modelando-o-screenmatch/` — classes básicas (Pessoa, Calculadora, Música, Carro, Aluno) com menu interativo
  - `modulo-02-controlando-o-acesso-e-a-escrita-nos-dados-da-aplicacao/` — 5 desafios de encapsulamento com pacotes separados por exercício
  - `modulo-03-reaproveitando-caracteristicas-e-comportamentos/` — herança, polimorfismo e modificador `protected`
  - `modulo-04-aplicando-comportamentos-em-comum/` — interfaces, contratos e polimorfismo com `implements`
  - `modulo-05-consolidando-conhecimentos/` — desafio final com Audio, Musica, Podcast e Preferidas
  - `projeto-screenmatch/` — projeto principal do curso, evoluído ao longo dos módulos
  - `docs/` — certificado do curso

- `curso-03-trabalhando-com-listas-e-colecoes-de-dados/`
  Curso de listas e coleções, focado em:
  - `ArrayList` e manipulação com `add()`, `size()` e `get()`;
  - construtores e uso de `super`;
  - foreach, casting e `instanceof`;
  - ordenação com `Collections.sort`, `Comparable` e `Comparator`;
  - interface `List` e polimorfismo com `ArrayList` e `LinkedList`.

  Estrutura do curso:
  - `modulo-01-colecao-de-filmes/` — ArrayList, toString e manipulação de listas
  - `modulo-02-construindo-objetos/` — construtores e super
  - `modulo-03-lista-de-objetos-distintos/` — foreach, casting e instanceof
  - `modulo-04-ordenando-dados/` — Comparable, Comparator e interface List
  - `modulo-05-consolidando-conhecimentos/` — desafio final com cartão de crédito e lista de compras
  - `projeto-screenmatch/` — projeto ScreenMatch evoluído com os conceitos do curso
  - `docs/` — certificado do curso

- `curso-04-consumindo-api-gravando-arquivos-e-lidando-com-erros/`
  Curso de integração com APIs e persistência, focado em:
  - requisições HTTP com `HttpClient`, `HttpRequest` e `HttpResponse`;
  - desserialização de JSON com Gson e `record`;
  - tratamento de exceções com `try/catch` e exceções personalizadas;
  - escrita em arquivos com `FileWriter` e serialização com `gson.toJson()`.

  Estrutura do curso:
  - `modulo-01-requsicoes-e-respostas/` — HttpClient, HttpRequest, HttpResponse e consumo de APIs públicas
  - `modulo-02-utilizando-uma-biblioteca-externa/` — Gson, fromJson, @SerializedName e records
  - `modulo-03-lidando-com-excecoes/` — try/catch, exceções customizadas e hierarquia de exceções
  - `modulo-04-persistindo-dados-em-arquivos/` — FileWriter, toJson e setPrettyPrinting
  - `modulo-05-consolidando-conhecimentos/` — projeto ViaCEP com consulta de endereço e geração de JSON
  - `projeto-screenmatch/` — projeto ScreenMatch com OMDb API, record TituloOMDb e geração de filmes.json
  - `docs/` — certificado do curso

---

## 🧭 Como navegar

1. Entre na pasta da carreira: `carreira-backend-java/`
2. Escolha o curso desejado, por exemplo: `curso-01-criando-sua-primeira-aplicacao/`
3. Dentro do curso, escolha um módulo ou desafio
4. Leia o `README.md` da pasta para entender o exercício
5. Abra a pasta `src/` e execute a classe que contém o método `main`

---

## 📊 Progresso

### Base
- ✅ Curso 01 — Boas-vindas e primeiros passos
- ✅ Curso 02 — Pensamento computacional

### Nível 1 — Aplicações Web com Java e Spring
- ✅ Curso 01 — Java: criando a sua primeira aplicação
  - ✅ Módulo 01 — Primeiro programa em Java
  - ✅ Módulo 02 — Construindo o catálogo de filmes
  - ✅ Módulo 03 — Controlando o fluxo da aplicação
  - ✅ Módulo 04 — Consolidando conhecimentos
- ✅ Curso 02 — Java: aplicando a Orientação a Objetos
  - ✅ Módulo 01 — Modelando o ScreenMatch
  - ✅ Módulo 02 — Controlando o acesso e a escrita nos dados da aplicação
  - ✅ Módulo 03 — Reaproveitando características e comportamentos
  - ✅ Módulo 04 — Aplicando comportamentos em comum
  - ✅ Módulo 05 — Consolidando conhecimentos
- ✅ Curso 03 — Java: trabalhando com listas e coleções de dados
  - ✅ Módulo 01 — Coleção de filmes
  - ✅ Módulo 02 — Construindo objetos
  - ✅ Módulo 03 — Lista de objetos distintos
  - ✅ Módulo 04 — Ordenando dados
  - ✅ Módulo 05 — Consolidando conhecimentos
- ✅ Curso 04 — Java: consumindo API, gravando arquivos e lidando com erros
  - ✅ Módulo 01 — Requisições e respostas
  - ✅ Módulo 02 — Utilizando uma biblioteca externa
  - ✅ Módulo 03 — Lidando com exceções
  - ✅ Módulo 04 — Persistindo dados em arquivos
  - ✅ Módulo 05 — Consolidando conhecimentos
- ⏳ Curso 05 — Praticando Java com desafios
- ⏳ Cursos 06–24 — Spring Boot, DevOps...

### Nível 2 — APIs Seguras, Microsserviços e CI/CD
- ⏳ A iniciar

### Nível 3 — Sistemas Reativos, Observabilidade e Arquitetura Avançada
- ⏳ A iniciar