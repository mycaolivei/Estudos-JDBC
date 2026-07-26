# Estudos-JDBC
# 🛒 Sistema de Gerenciamento de Produtos (Java + JDBC + MySQL)

Este projeto consiste em uma aplicação Java para o gerenciamento de produtos, desenvolvida no **Eclipse IDE** com banco de dados **MySQL**. O objetivo principal é entender na prática o funcionamento da conectividade via **JDBC**, a arquitetura por separação de responsabilidades e a lógica que o **Spring Boot** abstrai por baixo dos panos.

---

## 📌 Status Atual do Projeto

O sistema já possui a estrutura de camadas definida e funcionalidade básica de persistência de dados.

- [x] Configuração da conexão com o MySQL via DAO.
- [x] Mapeamento do modelo de dados (`Produto`).
- [x] Interface de interação via terminal (Menu interativo).
- [x] **[FUNCIONAL]** Inserção de produtos no banco de dados.
- [ ] **[EM ANDAMENTO]** Adição e refinamento de métodos na camada de regras de negócio (`ProdutoService`).
- [ ] Implementação completa das demais operações do CRUD (Listar, Atualizar, Deletar).

---

## 📂 Estrutura e Separação de Responsabilidades

A aplicação está dividida em classes específicas para garantir o desacoplamento do código:

```text
src/
 └── br/com/projeto/
      ├── Produto.java         # Representa o modelo do produto (atributos, getters/setters)
      ├── ProdutoDAO.java      # Responsável pela conexão e operações diretas no MySQL
      ├── ProdutoService.java  # Contém as regras de negócio e validações
      └── testeProduto.java    # Interface de interação com o usuário (Menu/CLI)
