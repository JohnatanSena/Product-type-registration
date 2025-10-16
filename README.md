# Product Management System

Um projeto Java para gerenciamento de produtos com diferentes categorias, demonstrando conceitos fundamentais de Programação Orientada a Objetos.

## 📋 Sobre o Projeto

Sistema que permite cadastrar e exibir informações de produtos com diferentes características:
- **Produtos Comuns**: Produtos padrão sem taxas adicionais
- **Produtos Usados**: Produtos com data de fabricação
- **Produtos Importados**: Produtos com taxa de importação

## 🏗️ Estrutura do Projeto

```
src/
└── entities/
    ├── Product.java (classe abstrata)
    ├── UsedProduct.java
    └── ImportedProduct.java
```

## 🔧 Conceitos Demonstrados

- **Herança**: `UsedProduct` e `ImportedProduct` herdam de `Product`
- **Polimorfismo**: Método `priceTag()` sobrescrito nas subclasses
- **Upcasting**: Tratamento de objetos específicos como genéricos
- **Downcasting**: Conversão de objetos genéricos para específicos quando necessário

## 🚀 Funcionamento

1. O usuário informa a quantidade de produtos
2. Para cada produto, seleciona o tipo (c/u/i):
    - **c**: Common (Comum)
    - **u**: Used (Usado)
    - **i**: Imported (Importado)
3. Coleta dados específicos conforme o tipo
4. Exibe todas as etiquetas de preço formatadas

## 📝 Exemplo de Saída

```
Tablet $ 280.00 (Customs fee: $ 20.00)
Notebook $ 1100.00
Iphone (used) $ 400.00 (Manufacture date: 15/03/2017)
```

## 🎯 Objetivos de Aprendizado

- Implementação de hierarquia de classes
- Aplicação de polimorfismo em cenários reais
- Manipulação de diferentes tipos de produtos de forma uniforme
- Prática com upcasting e downcasting