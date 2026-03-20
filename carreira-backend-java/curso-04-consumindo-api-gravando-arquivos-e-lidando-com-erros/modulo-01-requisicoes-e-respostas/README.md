# Módulo 01 — Requisições e Respostas

## 📚 Sobre o Módulo

Primeiro módulo do Curso 04 da formação **Desenvolvedor Back-end Java** na Alura.
Introdução ao consumo de APIs HTTP em Java utilizando as classes nativas `HttpClient`, `HttpRequest` e `HttpResponse`.

---

## 🎯 Conteúdo Estudado

- O que é uma API e seu funcionamento básico
- Como funciona a API do OMDb para busca de filmes
- Realizando consultas com o Postman
- Integração com APIs em Java utilizando:
  - `HttpClient` — responsável por realizar a conexão
  - `HttpRequest` — representa a requisição (URL, método, headers)
  - `HttpResponse` — armazena a resposta do servidor
- Padrão **Builder** aplicado ao `HttpRequest`
- Padrão **Factory Method** aplicado ao `HttpClient.newHttpClient()`
- Leitura de variáveis de ambiente com `System.getenv()`
- Boas práticas de segurança — chaves de API via variáveis de ambiente
- Tratamento básico de exceções com `throws IOException, InterruptedException`
- Formato JSON como retorno de APIs

---

## 🗂️ Estrutura

```
modulo-01-requsicoes-e-respostas/
├── src/
│   └── br.com.givanildo.modulo01.desafios/
│       ├── ex01_api_google_books/
│       │   ├── principal/
│       │   │   └── ApiGoogleBooks.java
│       │   └── model/
│       ├── ex02_api_coingecko/
│       │   └── principal/
│       │       └── ApiCoinGecko.java
│       └── ex03_api_themealdb/
│           └── principal/
│               └── ApiTheMealDB.java
└── README.md
```

---

## ✏️ Desafios

### Desafio 01 — Google Books API
Programa que recebe o nome de um livro via `Scanner`, consulta a [Google Books API](https://developers.google.com/books) e exibe o JSON retornado com informações como título, autor, editora, número de páginas e preço.

**Conceitos aplicados:**
- `HttpClient`, `HttpRequest`, `HttpResponse`
- `String.format()` para montar a URL dinamicamente
- `System.getenv()` para leitura segura da chave de API
- `.replace(" ", "+")` para tratar espaços na busca

---

### Desafio 02 — CoinGecko API
Programa que recebe o nome de uma criptomoeda via `Scanner`, consulta a [CoinGecko API](https://www.coingecko.com/api/documentation) e exibe a cotação atual em Real Brasileiro (BRL).

**Conceitos aplicados:**
- `HttpClient`, `HttpRequest`, `HttpResponse`
- `String.format()` para montar a URL dinamicamente
- `System.getenv()` para leitura segura da chave de API
- Parâmetro `vs_currencies=brl` para cotação em reais

---

### Desafio 03 — TheMealDB API
Programa que recebe o nome de uma receita em inglês via `Scanner`, consulta a [TheMealDB API](https://www.themealdb.com/api.php) e exibe o JSON retornado com as informações da receita.

**Conceitos aplicados:**
- `HttpClient`, `HttpRequest`, `HttpResponse`
- `String.format()` para montar a URL dinamicamente
- API pública — sem necessidade de chave
- `.replace(" ", "+")` para tratar espaços na busca

---

## 🔑 Variáveis de Ambiente Utilizadas

| Variável | API |
|---|---|
| `GOOGLE_BOOKS_API_KEY` | Google Books API |
| `COINGECKO_API_KEY` | CoinGecko API |
| `OMDB_API_KEY` | OMDb API (projeto ScreenMatch) |

---

## 📝 Aprendizados Importantes

- O construtor do `HttpClient` é privado — usa-se o padrão **Factory Method** via `HttpClient.newHttpClient()`
- O `HttpRequest` usa o padrão **Builder**: `newBuilder()` inicia, `.uri()` configura e `.build()` entrega o objeto pronto
- Chaves de API nunca devem ficar no código-fonte — sempre em variáveis de ambiente com `System.getenv()`
- Espaços na busca devem ser substituídos por `+` com `.replace(" ", "+")`
- O JSON retornado pela API é uma `String` bruta — a extração dos dados será feita com **Gson** no Módulo 02