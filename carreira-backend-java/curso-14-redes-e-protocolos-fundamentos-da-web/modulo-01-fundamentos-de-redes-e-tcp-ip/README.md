# Módulo 01 — Fundamentos de Redes e TCP/IP

## 📚 Sobre o Módulo

Primeiro módulo do Curso 14 da formação **Desenvolvedor Back-end Java** na Alura.
Módulo teórico focado nos fundamentos de redes, protocolos de comunicação e infraestrutura da web.

---

## 🎯 Conteúdo Estudado

- Diferença entre LAN, WAN e Internet
- Protocolo TCP/IP e suas camadas
- TCP vs UDP — confiabilidade vs velocidade
- Endereçamento IP — identificação de dispositivos na rede
- DNS — resolução de nomes de domínio para endereços IP
- Estrutura de URLs e domínios
- Fluxo de requisição entre navegador e servidor
- Infraestrutura global da internet — servidores, roteadores e cabos

---

## 📝 Conceitos Importantes

**Camadas do TCP/IP:**
```
Aplicação   → HTTP, HTTPS, DNS
Transporte  → TCP (confiável) e UDP (rápido)
Rede        → IP (endereçamento)
Física      → cabo, fibra, Wi-Fi
```

**TCP vs UDP:**

| | TCP | UDP |
|---|---|---|
| Entrega | Garantida | Sem garantia |
| Velocidade | Mais lento | Mais rápido |
| Uso | HTTP, banco de dados | Streaming, jogos |

**DNS:**
- Traduz `viacep.com.br` para `200.238.111.17`
- Sem DNS você precisaria memorizar IPs para acessar sites

**URL:**
```
https://viacep.com.br:443/ws/07866060/json/
  │          │          │       │
HTTPS      domínio    porta   path
```

**IP + Porta:**
- IP identifica o servidor
- Porta identifica o serviço dentro do servidor
- Spring Boot roda por padrão na porta `8080`