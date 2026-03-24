# Módulo 05 — Consolidando Conhecimentos

## 📚 Sobre o Módulo

Quinto e último módulo do Curso 04 da formação **Desenvolvedor Back-end Java** na Alura.
Projeto prático de consolidação que integra todos os conceitos do curso: consumo de API, tratamento de exceções, desserialização com Gson e persistência em arquivo JSON.

---

## 🎯 Conteúdo Aplicado

- Consumo de API REST pública com `HttpClient`, `HttpRequest` e `HttpResponse`
- Desserialização de JSON para objeto Java com `Gson` e `record`
- Tratamento de exceções com `try/catch` e `RuntimeException`
- Persistência de dados em arquivo `.json` com `FileWriter`
- Separação de responsabilidades em classes distintas

---

## 🗂️ Estrutura
```
modulo-05-consolidando-conhecimentos/
├── desafio/
│   ├── model/
│   │   ├── ConsultaCep.java
│   │   ├── Endereco.java
│   │   └── SalvaEmJson.java
│   └── principal/
│       └── Principal.java
└── README.md
```

---

## 🚀 Projeto — Consulta ViaCEP

Aplicação que recebe um CEP do usuário, consulta a API pública ViaCEP, exibe os dados do endereço e salva o resultado em um arquivo `Consulta.json`.

**API utilizada:** [ViaCEP](https://viacep.com.br)

---

## 🗃️ Classes

### ConsultaCep.java
Responsável por fazer a requisição HTTP à API ViaCEP e retornar o endereço desserializado.

**Conceitos aplicados:**
- `HttpClient`, `HttpRequest`, `HttpResponse` para consumo da API
- `Gson.fromJson()` para desserializar o JSON no record `Endereco`
- Captura de `IOException | InterruptedException` relançada como `RuntimeException`
- Captura de `JsonSyntaxException` para CEPs com formato inválido

---

### Endereco.java
Record que mapeia os campos retornados pela API ViaCEP.

**Conceitos aplicados:**
- `record` para representar dados imutáveis vindos de uma API
- `toString()` customizado para exibição formatada no console

---

### SalvaEmJson.java
Responsável por persistir o objeto `Endereco` em um arquivo `Consulta.json`.

**Conceitos aplicados:**
- `FileWriter` para escrita em arquivo
- `GsonBuilder` com `setPrettyPrinting()` para JSON formatado

---

## 📝 Aprendizados Importantes

- `String` é imutável em Java — `replace()` deve ser reatribuído: `cep = cep.replace("-", "")`
- `setPrettyPrinting()` só afeta `toJson()` — não tem efeito no `fromJson()`
- CEP com traço no formato correto (`00000-000`) é aceito pela ViaCEP diretamente
- Gson serializa atributos `private` via reflexão — getters não são necessários
- `RuntimeException` não precisa ser declarada com `throws` — ideal para erros de negócio
- A camada de modelo **lança** a exceção — a camada `Principal` **captura** e comunica ao usuário