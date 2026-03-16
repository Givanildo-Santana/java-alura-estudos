# Módulo 01 — Requisições e Respostas

## 📚 Sobre o Módulo

Primeiro módulo do Curso 04 da formação **Desenvolvedor Back-end Java** na Alura.
Introdução ao consumo de APIs HTTP em Java utilizando as classes nativas `HttpClient`, `HttpRequest` e `HttpResponse`.

---

## 🎯 Conteúdo Estudado

- O que é uma API e como ela funciona
- Realizando consultas com o Postman
- Classes nativas do Java para consumo de HTTP:
    - `HttpClient` — responsável por realizar a conexão
    - `HttpRequest` — representa a requisição (URL, método, headers)
    - `HttpResponse` — armazena a resposta do servidor
- Padrão Builder aplicado ao `HttpRequest`
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
│       ├── ex01_google_books/
│       │   ├── principal/
│       │   │   └── APIGoogleBooks.java
│       │   └── model/
│       └── ex02/
└── README.md
```

---

## ✏️ Desafios

### Desafio 01 — Google Books API
Programa que recebe o nome de um livro via `Scanner`, consulta a [Google Books API](https://developers.google.com/books) e exibe o JSON completo retornado com informações como título, autor, editora, número de páginas e preço.

**Conceitos aplicados:**
- `HttpClient`, `HttpRequest`, `HttpResponse`
- `String.format()` para montar a URL dinamicamente
- `System.getenv()` para leitura segura da chave de API
- `.replace(" ", "+")` para tratar espaços na busca

---

## 🔑 Variáveis de Ambiente Utilizadas

| Variável | API |
|---|---|
| `GOOGLE_BOOKS_KEY` | Google Books API |
| `OMDB_API_KEY` | OMDb API |

---

## 📝 Aprendizados Importantes

- O construtor do `HttpClient` é privado — usa-se o padrão **Factory Method** via `HttpClient.newHttpClient()`
- O `HttpRequest` usa o padrão **Builder**: `newBuilder()` inicia, `.uri()` configura e `.build()` entrega o objeto pronto
- Chaves de API nunca devem ficar no código-fonte — sempre em variáveis de ambiente
- O JSON retornado pela API é uma `String` — a extração dos dados será feita com **Gson** no Módulo 02