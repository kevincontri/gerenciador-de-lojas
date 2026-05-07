# Gerenciador de Lojas

Sistema orientado a objetos em Java para gerenciamento de lojas em um shopping. Permite cadastrar lojas de diferentes tipos e produtos com controle de validade.

## Estrutura do Projeto

```
gerenciador-lojas/
├── Principal.java              # Ponto de entrada do programa
└── app/
    ├── main/
    │   ├── Loja.java           # Classe base de loja
    │   ├── Produto.java        # Classe de produto
    │   └── Shopping.java       # Classe de shopping
    ├── stores/
    │   ├── Alimentacao.java    # Loja de alimentação (tem alvará)
    │   ├── Bijuteria.java      # Loja de bijuteria (tem meta de vendas)
    │   ├── Cosmetico.java      # Loja de cosméticos (tem taxa de comercialização)
    │   ├── Informatica.java    # Loja de informática (tem seguro de eletrônicos)
    │   └── Vestuario.java      # Loja de vestuário (tem flag de importados)
    └── utilities/
        ├── Data.java           # Representação e validação de datas
        └── Endereco.java       # Representação de endereço
```

## Funcionalidades

- Criar uma loja com nome, funcionários, salário base, endereço e data de fundação
- Criar um produto com nome, preço e data de validade
- Verificar automaticamente se um produto está vencido
- Tipos especializados de loja com atributos próprios

## Como Compilar e Executar

**Compilar** (a partir da pasta raiz):
```bash
javac app/utilities/Data.java app/utilities/Endereco.java app/main/Produto.java app/main/Loja.java app/stores/*.java app/main/Shopping.java Principal.java
```

**Executar:**
```bash
java Principal
```
