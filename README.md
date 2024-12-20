# Desafio de Automação de Testes em API

## 🎯 Objetivo

O objetivo deste desafio é **demonstrar seus conhecimentos em Automação de Testes de API**, com foco em conceitos essenciais como:

- Arquitetura de Automação de Testes
- Orientação a Objetos
- Design Patterns
- Clean Code
  
---

## 💻 Requisitos

### 📌 Linguagem
A linguagem recomendada para o desenvolvimento do desafio é **Java**.

### 📚 Frameworks e Bibliotecas
Utilize as seguintes bibliotecas e frameworks para auxiliar no desenvolvimento:

- **[RestAssured](https://rest-assured.io/)**: Framework para automação de testes de API.
- **[JUnit5](https://junit.org/junit5/)**: Framework para organização e execução dos testes.

---

## 🚀 Desafio API

Você deverá utilizar a seguinte **API de CEP** para realizar o desafio:

**[API de CEP](https://viacep.com.br/ws/CEP/json)**

### Cenários de Teste

Você deverá validar os seguintes cenários de teste ao fazer requisições para a API:

#### 1️⃣ **Cenário 1: CEP Válido**
- Realize uma requisição para um **CEP válido** (exemplo: `01001000`).
- Valide a resposta da API para garantir que os dados retornados correspondem ao esperado.

#### 2️⃣ **Cenário 2: CEP Inválido**
- Realize uma requisição para um **CEP inválido** (exemplo: `00000000`).
- Valide a resposta da API, garantindo que ela retorne o erro esperado ou uma mensagem de "não encontrado".

### ⚠️ Observações

- O **CEP** deve ser passado diretamente na URL da requisição.
- Certifique-se de validar corretamente os diferentes cenários (válido e inválido) conforme a documentação da API.

---

## 🗂 Estrutura do Repositório

O repositório deve conter a seguinte estrutura básica de diretórios e arquivos:

```plaintext
|- src
   |- main
      |- java
         |- org.example
            |- models
                  |- Cep.java
|- test
   |- java
   |- org.example
      |- api
         |- TestCepValidation
      |- ApiClient
         |- CepService.java
|- pom.xml
```

---

## 🛠 Instruções para Execução

### 1. **Clone o repositório**
Clone o repositório para o seu ambiente local utilizando o seguinte comando:

```bash
git clone https://github.com/GabrielSbruzzi/ValidarCEP.git
```

### 2. **Instale as dependências**
Caso esteja utilizando **Maven**:

```bash
mvn install
```

Ou, se estiver utilizando **Gradle**:

```bash
gradle build
```

### 3. **Execute os testes**
Para rodar os testes com **JUnit5**:

- **Com Maven**:

```bash
mvn test
```

- **Com Gradle**:

```bash
gradle test
```

## 👨‍💻 Autor

- **Gabriel Sbruzzi**  
  - GitHub: [@GabrielSbruzzi](https://github.com/GabrielSbruzzi)
  - LinkedIn: [Gabriel Sbruzzi](https://www.linkedin.com/in/gabriel-sbruzzi)

---
