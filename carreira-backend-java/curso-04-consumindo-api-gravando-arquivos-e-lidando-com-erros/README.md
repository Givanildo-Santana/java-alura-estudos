# Curso 04 — Java: Consumindo API, Gravando Arquivos e Lidando com Erros

Este diretório reúne os materiais de estudo, exercícios e projetos do **quarto curso** da carreira de Desenvolvedor Back-end Java na Alura.

O foco deste curso é integração com APIs externas, manipulação de dados no formato JSON, persistência em arquivos e tratamento de exceções.

---

## Estrutura do curso

- `modulo-01-requsicoes-e-respostas/`
  Consumo de APIs HTTP em Java:
    - requisições HTTP com `HttpClient`, `HttpRequest` e `HttpResponse`;
    - leitura do corpo da resposta com `BodyHandlers.ofString()`;
    - consumo de APIs públicas (Google Books, CoinGecko, TheMealDB, OMDb).

- `modulo-02-utilizando-uma-biblioteca-externa/`
  Desserialização de JSON com Gson:
    - adição de dependência externa com `.jar`;
    - conversão de JSON em objetos Java com `gson.fromJson()`;
    - mapeamento de campos com `@SerializedName`;
    - uso de `record` como DTO para dados de APIs;
    - `FieldNamingPolicy.UPPER_CAMEL_CASE` para APIs com nomes em PascalCase.

- `modulo-03-lidando-com-excecoes/`
  Tratamento de erros em Java:
    - bloco `try/catch` para captura de exceções;
    - captura de múltiplas exceções com múltiplos `catch`;
    - bloco `finally`;
    - criação de exceções personalizadas com `extends RuntimeException`;
    - diferença entre exceções checadas e não checadas.

- `modulo-04-persistindo-dados-em-arquivos/`
  Escrita de dados em arquivos:
    - escrita em arquivos com `FileWriter`;
    - serialização de objetos para JSON com `gson.toJson()`;
    - formatação elegante do JSON com `setPrettyPrinting()`.

- `modulo-05-consolidando-conhecimentos/`
  Projeto final que aplica todos os conceitos do curso:
    - aplicação de consulta de CEP via API ViaCEP;
    - menu para o usuário informar o CEP;
    - geração de arquivo `.json` com os dados do endereço.

- `projeto-screenmatch/`
  Projeto ScreenMatch evoluído ao longo dos módulos:
    - consumo da OMDb API com `HttpClient`;
    - desserialização com Gson e record `TituloOMDb`;
    - exceção personalizada `ErroDeConversaoDeAnoException`;
    - busca de múltiplos filmes com loop e geração de `filmes.json`.

- `docs/`
  Documentos relacionados ao curso (certificado de conclusão).

---

## Como executar os exercícios

1. Abra o projeto na sua IDE de preferência (IntelliJ IDEA, por exemplo).
2. Navegue até o módulo desejado dentro de `src/`.
3. Localize a classe que contém o método `main`.
4. Execute a aplicação pelo botão de **Run** da IDE.

---

## Progresso

- ✅ Módulo 01 — Requisições e respostas
- ✅ Módulo 02 — Utilizando uma biblioteca externa
- ✅ Módulo 03 — Lidando com exceções
- ✅ Módulo 04 — Persistindo dados em arquivos
- ✅ Módulo 05 — Consolidando conhecimentos