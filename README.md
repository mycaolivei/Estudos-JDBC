# Estudos-JDBC
# 🛒 Sistema de Produtos — Projeto de Estudos

## 📌 Sobre o projeto

Este projeto foi desenvolvido com o objetivo de consolidar conhecimentos em **Java, Programação Orientada a Objetos, JDBC, acesso a banco de dados, tratamento de exceções e arquitetura em camadas**.

O projeto consiste em um sistema simples de gerenciamento de produtos, permitindo realizar operações de **CRUD**:

- Inserção de produtos;
- Consulta de produtos;
- Atualização de produtos;
- Exclusão de produtos.

> ⚠️ Este é um projeto desenvolvido para fins de **estudo e aprendizado**. A aplicação será evoluída gradualmente conforme novos conteúdos forem estudados.

---

## 🧠 Conteúdos estudados

### Java

- Fundamentos de Java;
- Programação Orientada a Objetos (POO);
- Classes e objetos;
- Encapsulamento;
- Construtores;
- Herança;
- Polimorfismo;
- Interfaces;
- `ArrayList`;
- `enum`;
- Validação de dados;
- `toString()`;
- `throw` e `throws`;
- Exceções verificadas e não verificadas;
- `try-catch`;
- `try-with-resources`.

### JDBC

Foi utilizado **JDBC (Java Database Connectivity)** para realizar a comunicação entre a aplicação Java e o banco de dados.

Principais conceitos estudados:

- `Connection`;
- `PreparedStatement`;
- `ResultSet`;
- `executeQuery()`;
- `executeUpdate()`;
- `SQLException`;
- Propagação de exceções;
- Fechamento automático de recursos com `try-with-resources`.

### SQL

Foram estudados e utilizados conceitos como:

- `SELECT`;
- `INSERT`;
- `UPDATE`;
- `DELETE`;
- `WHERE`;
- `JOIN`;
- `GROUP BY`;
- `HAVING`;
- `COUNT`;
- `SUM`;
- `AVG`;
- `MIN`;
- `MAX`;
- `DISTINCT`;
- `LIKE`;
- `ORDER BY`;
- `LIMIT`;
- `CASE`;
- `ALTER TABLE`;
- Chaves primárias e estrangeiras;
- Relacionamentos entre tabelas;
- Views;
- Validação e análise de dados.

---

## 🏗️ Arquitetura atual

## 📁 Estrutura do projeto

Atualmente, o projeto está organizado de forma a separar as responsabilidades das classes.

```text
src/
└── Exercicios/
    ├── Produto.java
    ├── ProdutoDAO.java
    ├── ProdutoService.java
    ├── TesteProduto.java
    ├── ProdutoNaoEncontradoException.java
    └── ProdutoDuplicadoException.java
