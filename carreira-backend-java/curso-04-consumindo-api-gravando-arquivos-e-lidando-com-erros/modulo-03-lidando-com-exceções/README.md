# Módulo 03 — Lidando com Exceções

## 📚 Sobre o Módulo

Terceiro módulo do Curso 04 da formação **Desenvolvedor Back-end Java** na Alura.
Foco no tratamento de erros em Java com o bloco `try/catch`, captura de múltiplas exceções e criação de exceções personalizadas.

---

## 🎯 Conteúdo Estudado

- O que são exceções no Java e por que elas existem
- Bloco `try/catch` para capturar e tratar erros em tempo de execução
- Captura de múltiplas exceções com múltiplos blocos `catch`
- Bloco `finally` — código que executa independente do resultado
- Criação de exceções personalizadas com `extends RuntimeException`
- Uso de `super(mensagem)` para delegar a mensagem ao construtor da classe pai
- Diferença entre `throws` (propaga o erro) e `try/catch` (trata localmente)
- Exceções checadas vs. não checadas (`RuntimeException`)
- Lançamento de exceções com `throw new MinhaException(...)`

---

## 🗂️ Estrutura

```
modulo-03-lidando-com-excecoes/
├── desafios/
│   ├── ex01_tratando_divisao_por_zero/
│   │   └── principal/
│   │       └── Principal.java
│   ├── ex02_validando_senha/
│   │   ├── excecao/
│   │   │   └── SenhaInvalidaException.java
│   │   └── principal/
│   │       └── Principal.java
│   └── ex03_usuario_github/
│       ├── excecao/
│       │   └── ErroConsultaGitHubException.java
│       ├── model/
│       │   └── UsuarioGitHub.java
│       └── principal/
│           └── Principal.java
└── README.md
```

---

## ✏️ Desafios

### Desafio 01 — Tratando Divisão por Zero
Programa que solicita dois números ao usuário e realiza a divisão, tratando a exceção `ArithmeticException` caso o divisor seja zero.

**Conceitos aplicados:**
- `try/catch` com `ArithmeticException`
- Mensagem amigável ao usuário no bloco `catch`

---

### Desafio 02 — Validando Senha
Programa que lê uma senha do usuário e lança uma exceção personalizada caso ela não atenda ao critério mínimo de 8 caracteres.

**Conceitos aplicados:**
- Exceção personalizada `SenhaInvalidaException extends RuntimeException`
- `super(mensagem)` no construtor da exceção
- Método de validação separado com `throw new SenhaInvalidaException(...)`
- `try/catch` capturando a exceção personalizada

---

### Desafio 03 — Consulta Usuário GitHub
Programa que consulta informações de um usuário na API pública do GitHub, trata o caso de usuário não encontrado com uma exceção personalizada e exibe os dados formatados.

**Conceitos aplicados:**
- `ErroConsultaGitHubException extends RuntimeException`
- `super(mensagem)` no construtor da exceção
- `record UsuarioGitHub` para receber os dados brutos da API
- `toString()` formatado com `String.format()` no record
- `HttpClient`, `HttpRequest`, `HttpResponse` para consumo da API
- `Gson` para desserialização do JSON
- Verificação de `login == null` para detectar usuário inexistente
- `try/catch` com captura específica de `ErroConsultaGitHubException` + `catch` genérico + `finally`
- API pública utilizada: [GitHub REST API — Users](https://docs.github.com/rest/users/users)

---

## 📝 Aprendizados Importantes

- Exceções personalizadas extendem `RuntimeException` — não precisam ser declaradas com `throws`
- `super(mensagem)` no construtor delega a mensagem ao pai — não é necessário redeclarar o atributo nem sobrescrever `getMessage()`
- `finally` sempre executa, independente de exceção ou não — útil para fechar recursos
- Múltiplos `catch` devem ir do mais específico para o mais genérico — `catch (Exception e)` sempre por último
- `record` é ideal para representar dados vindos de APIs — sem lógica, só estrutura
- A ordem dos blocos `catch` importa — exceções mais específicas devem vir antes das genéricas
- `new Gson()` é suficiente quando os campos Java casam exatamente com os campos do JSON