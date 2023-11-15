# Projeto POO - Estoque 


O sistema de gestão de estoque é um software que gerencia o controle de estoque de uma
empresa. O sistema é composto por três entidades principais: Produto, Fornecedor e
Estoque. O sistema permite que os usuários possam gerenciar a entrada e saída de
produtos, controlar o estoque de cada produto, além de realizar outras funções de gestão
de estoque.


```mermaid
---
title: Estoque
---
classDiagram
    Produto "1..*" -- "1" Estoque
    
    class Produto {
        +id_produto int
        +codigo_produto int
        +nome_produto string
        +descricao string
        +id_fornecedor int
        +data_cadastro date
        +cadastrarProduto(String nome) void
        +buscarProdutosPorNome(String nome) String
        +listarProdutos() String
        +deletarProduto(int id) void
    }
    class Estoque {
        +produto produto
        +quantidade int
        +armazen String
        +prateleira string
        +atualizarEstoqueProdutos() String
        +adicionarEstoqueProdutos(Produto produto) String
        +removerEstoqueProdutos(Produto produto) String
        +listarProdutosDisponiveis() String
    }
    class Fornecedor {
        +id_fornecedor: int
        +rg String
        +telefone int
        +email String
        +data_cadastro date
        +data_nascimento date
        +nome_fornecedor String
        +cnpj string
        +endereco endereco
        +cpf String
        +cadastrarFornecedor(String nome) void
        +buscarFornecedorPorNome(String nome) String
        +listarFornecedor() String
        +deletarFornecedor(String cnpj) void
    }
    Fornecedor "1" -- "1..*" Produto
```

