# Módulo 04 — Persistindo Dados em Arquivos

## 📚 Sobre o Módulo

Quarto módulo do Curso 04 da formação **Desenvolvedor Back-end Java** na Alura.
Foco na escrita de dados em arquivos e na serialização de objetos Java para o formato JSON utilizando a biblioteca Gson.

---

## 🎯 Conteúdo Estudado

- Escrita de dados em arquivos com `FileWriter` do pacote `java.io`
- Serialização de objetos Java para JSON com `gson.toJson()`
- Formatação elegante do JSON com `GsonBuilder` e `.setPrettyPrinting()`
- Diferença entre `toJson()` (objeto → JSON) e `fromJson()` (JSON → objeto)

---

## 🗂️ Estrutura
```
modulo-04-persistindo-dados-em-arquivos/
├── desafios/
│   ├── ex01_escrevendo_em_um_arquivo_txt/
│   │   └── principal/
│   │       └── Principal.java
│   ├── ex02_serializando_titulo_para_json/
│   │   ├── model/
│   │   │   └── Titulo.java
│   │   └── principal/
│   │       └── Principal.java
│   ├── ex03_pretty_printing_com_gson/
│   │   ├── model/
│   │   │   └── Titulo.java
│   │   └── principal/
│   │       └── Principal.java
│   └── ex04_veiculo_com_gson/
│       ├── model/
│       │   └── Veiculo.java
│       └── principal/
│           └── Principal.java
└── README.md
```

---

## ✏️ Desafios

### Desafio 01 — Escrevendo em Arquivo TXT
Programa que escreve uma mensagem em um arquivo `arquivo.txt` utilizando `FileWriter`.

**Conceitos aplicados:**
- `FileWriter` para criação e escrita em arquivos
- `writer.close()` para fechar o recurso após o uso

---

### Desafio 02 — Serializando Titulo para JSON
Programa que instancia um objeto `Titulo`, serializa para JSON com Gson e imprime o resultado.

**Conceitos aplicados:**
- `gson.toJson()` para serializar objeto → JSON
- `@SerializedName` para mapear campos Java com nomes diferentes do JSON
- `new Gson()` para instância simples sem configurações extras

---

### Desafio 03 — Pretty Printing com Gson
Modificação do exercício anterior para gerar o JSON com formatação elegante.

**Conceitos aplicados:**
- `GsonBuilder` para configuração avançada do Gson
- `.setPrettyPrinting()` para indentação e quebras de linha no JSON
- `.create()` para instanciar o Gson configurado

---

### Desafio 04 — Serializando Veiculo com Gson
Programa que instancia um objeto `Veiculo` e serializa para JSON utilizando Gson.

**Conceitos aplicados:**
- Criação de classe modelo com construtor e getters
- `gson.toJson()` para serializar objeto → JSON
- Gson acessa atributos privados diretamente via reflexão — independente de getters

---

## 📝 Aprendizados Importantes

- `FileWriter` cria o arquivo automaticamente se ele não existir
- `gson.toJson()` serializa (objeto → JSON) — `gson.fromJson()` desserializa (JSON → objeto)
- `setPrettyPrinting()` não afeta `fromJson()` — só tem efeito na saída do `toJson()`
- Gson acessa atributos `private` via reflexão — getters não são necessários para serialização
- `@SerializedName` permite mapear campos Java com nomes diferentes dos campos do JSON
- `GsonBuilder` é usado quando precisamos configurar o comportamento do Gson antes de instanciá-lo