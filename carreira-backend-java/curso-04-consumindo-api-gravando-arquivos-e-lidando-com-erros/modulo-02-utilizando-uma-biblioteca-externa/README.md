# Módulo 02 — Utilizando uma Biblioteca Externa

## 📚 Sobre o Módulo

Segundo módulo do Curso 04 da formação **Desenvolvedor Back-end Java** na Alura.
Foco na utilização da biblioteca **Gson** do Google para converter JSON em objetos Java (desserialização).

---

## 🎯 Conteúdo Estudado

- O que são bibliotecas Java e como instalá-las manualmente via arquivo `.jar`
- Como configurar uma dependência externa no IntelliJ via `Project Structure > Dependencies`
- O que é desserialização — transformar uma String JSON em objeto Java
- Utilização da biblioteca **Gson** para converter JSON em objetos Java
- O que é um `record` — estrutura simplificada para representar dados
- Diferença entre `record` e classe normal
- `GsonBuilder` com `FieldNamingPolicy.UPPER_CAMEL_CASE` para casar campos com letras maiúsculas
- `setLenient()` para flexibilizar a conversão de JSONs com campos ausentes ou extras
- JSON aninhado — desserialização de objetos dentro de objetos
- Text blocks `"""` para representar JSON de forma legível no código

---

## 🗂️ Estrutura

```
modulo-02-utilizando-uma-biblioteca-externa/
├── src/
│   └── br.com.givanildo.modulo02.desafios/
│       ├── ex01_record_pessoa/
│       │   ├── model/
│       │   │   └── Pessoa.java
│       │   └── principal/
│       │       └── Principal.java
│       ├── ex02_record_pessoa_flexivel/
│       │   └── principal/
│       │       └── Principal.java
│       └── ex03_record_livro_aninhado/
│           ├── model/
│           │   ├── Editora.java
│           │   └── Livro.java
│           └── principal/
│               └── Principal.java
└── README.md
```

---

## ✏️ Desafios

### Desafio 01 — Record Pessoa
Programa que desserializa um JSON representando uma pessoa em um objeto do tipo `Pessoa` usando o Gson.

**Conceitos aplicados:**
- `record` para representar dados de forma concisa
- `GsonBuilder` com `UPPER_CAMEL_CASE`
- `gson.fromJson()` para desserializar

---

### Desafio 02 — Record Pessoa Flexível
Programa que testa a flexibilidade do Gson ao converter JSONs com campos ausentes ou campos extras não mapeados no record.

**Conceitos aplicados:**
- Gson ignorando campos extras automaticamente
- Gson preenchendo campos ausentes com `null` ou `0`
- `setLenient()` para maior tolerância na conversão

---

### Desafio 03 — Record Livro Aninhado
Programa que desserializa um JSON aninhado representando um livro com sua editora em objetos Java.

**Conceitos aplicados:**
- JSON aninhado — objeto dentro de objeto
- Classes `Livro` e `Editora` separadas
- Gson desserializando objetos aninhados automaticamente
- `toString()` formatado com `String.format()`

---

## 📝 Aprendizados Importantes

- `record` é uma estrutura simplificada do Java 16+ — o Java gera construtor, getters e `toString()` automaticamente
- Getters de um `record` são chamados pelo nome do campo com parênteses: `pessoa.nome()` — não `pessoa.getNome()`
- O Gson por padrão ignora campos extras e preenche campos ausentes — é flexível sem configuração adicional
- `GsonBuilder` é necessário quando os nomes dos campos no JSON diferem dos atributos da classe
- `UPPER_CAMEL_CASE` transforma `titulo` em `Titulo` automaticamente para casar com o JSON
- Text blocks `"""` tornam JSONs hardcoded muito mais legíveis no código