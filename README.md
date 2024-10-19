# Sistema de Gerenciamento Financeiro

Este projeto implementa um sistema de gerenciamento financeiro simples que permite a criação de clientes, contas bancárias e cartões de crédito. O sistema fornece funcionalidades básicas como depósitos, saques, transferências e impressão de extratos.

## Objetos do Projeto

O sistema é composto pelos seguintes objetos Java:

### 1. Cliente
Classe responsável por armazenar informações sobre um cliente.

- **Atributos**:
  - `codigo`: Código único do cliente.
  - `nome`: Nome do cliente.

- **Métodos**:
  - Getters e Setters para os atributos.
  - `toString()`: Retorna uma representação em String do cliente.

### 2. CartaoCredito
Classe responsável por armazenar informações sobre um cartão de crédito associado a um cliente.

- **Atributos**:
  - `numero`: Número do cartão.
  - `dataValidade`: Data de validade do cartão.
  - `cvv`: Código de segurança do cartão.
  - `cliente`: Referência ao cliente associado ao cartão.

- **Métodos**:
  - Getters e Setters para os atributos.
  - `toString()`: Retorna uma representação em String do cartão de crédito.

### 3. Agencia
Classe que representa uma agência bancária.

- **Atributos**:
  - `numero`: Número da agência.

- **Métodos**:
  - Getters e Setters para os atributos.
  - `toString()`: Retorna uma representação em String da agência.

### 4. Conta
Classe responsável por gerenciar as contas bancárias dos clientes.

- **Atributos**:
  - `numero`: Número da conta.
  - `saldo`: Saldo atual da conta.
  - `limite`: Limite de crédito da conta.
  - `cliente`: Referência ao cliente associado à conta.
  - `agencia`: Referência à agência onde a conta está registrada.

- **Métodos**:
  - `depositar(double valor)`: Adiciona um valor ao saldo.
  - `sacar(double valor)`: Retira um valor do saldo.
  - `extrato()`: Imprime o extrato da conta.
  - `transferir(double valor, Conta destino)`: Transfere um valor para outra conta.
  - Getters e Setters para os atributos.
  - `toString()`: Retorna uma representação em String da conta.

### 5. Main
Classe principal que demonstra a utilização das classes acima.

- **Funcionalidades**:
  - Criação de clientes e contas.
  - Criação de cartões de crédito.
  - Realização de operações bancárias como depósitos, saques e transferências.
  - Impressão de informações sobre clientes, cartões, agências e contas.

## Como Usar

1. Clone o repositório.
2. Abra o projeto em uma IDE compatível com Java.
3. Execute a classe `Main` para ver a demonstração das funcionalidades.

## Pré-requisitos

- Java 11 ou superior.


