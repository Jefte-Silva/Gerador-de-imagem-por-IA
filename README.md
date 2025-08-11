# 🖼️ Criando Imagens com IA

Aplicação Java com Spring Boot que simula a geração de imagens a partir de prompts de texto. 
Ideal para estudo de arquitetura MVC, integração com serviços, e design de páginas dinâmicas usando Thymeleaf.
Este projeto **não está integrado com a OpenAI** (ainda). Ele simula o comportamento de uma IA usando o serviço, via.placeholder.com.

---

## 🚀 Tecnologias utilizadas

- ☕ Java 21
- 🌱 Spring Boot
- 🧠 URLEncoder
- 🖼️ Placeholder.com
- 🎨 HTML, CSS e Thymeleaf
- 🧪 (Futuro) Spring AI + OpenAI

---

## ⚙️ Como funciona

1. O usuário envia um prompt pelo formulário
2. O controller recebe e envia ao serviço `IAService`
3. O serviço gera uma URL simulada com texto
4. A imagem é exibida na mesma página via Thymeleaf

---

## ⚙️ Exemplo de imagem gerada 

- 🖼️ https[:]//via.placeholder.com/400x300?text=Prompt

---

## 📌 Próximos passos

- 🔗 Integração com IA real  
- 🖼️ Histórico de imagens por sessão  
- 🎙️ Entrada de voz  
- 🧑‍🎨 Interface visual com preview


