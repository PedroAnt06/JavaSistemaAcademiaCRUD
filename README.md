# Sistema de Controle de Academia (Java CLI)

Sistema simples de controle de clientes e mensalidades desenvolvido em Java, utilizando conceitos fundamentais de Programação Orientada a Objetos (POO) e armazenamento em memória, com interface via linha de comando (CLI).

O objetivo do projeto é demonstrar lógica de programação, organização de código, separação de responsabilidades e regras básicas de negócio, sendo ideal para estudos e apresentações técnicas.

---

## Descrição Geral

O sistema permite o gerenciamento de clientes de uma academia, incluindo cadastro, edição, inativação e controle básico de mensalidades.  
Toda a aplicação roda em ambiente de terminal, sem uso de banco de dados, mantendo os dados em memória durante a execução.

---

## Funcionalidades

- Cadastro de clientes
- Listagem de clientes cadastrados
- Edição de dados do cliente
- Inativação de clientes
- Controle de mensalidade (paga ou não paga)
- Listagem de clientes inadimplentes

---

## Demonstração das Funcionalidades

### Cadastro de Cliente
Neste fluxo é possível cadastrar um novo cliente informando nome, telefone e plano.

![CadastrarCliente](https://github.com/user-attachments/assets/38afd937-a167-46a3-8c9d-c09abed6ea99)

---

### Listagem de Clientes
Exibe todos os clientes cadastrados no sistema.

![ListarClientes](https://github.com/user-attachments/assets/cd0a3484-034a-49b5-931a-12b37fd87735)

---

### Edição de Cliente
Permite alterar nome, telefone e plano de um cliente existente.

![EditarCliente](https://github.com/user-attachments/assets/9abf519e-df93-434e-a6ee-b8f96e06d8ba)

---

### Inativação de Cliente
Permite inativar um cliente sem removê-lo da lista, mantendo o histórico.

![InativarAtivarCliente](https://github.com/user-attachments/assets/d551ee09-aa14-4755-ba0c-726af7d26b0f)

---

### Controle de Mensalidade
Funcionalidade para marcar a mensalidade do cliente como paga ou não paga.

![GerenciarMensalidade](https://github.com/user-attachments/assets/b7f52b76-b833-4a1f-b220-f739ff15a6bd)

---

### Listagem de Inadimplentes
Lista todos os clientes ativos que possuem mensalidade não paga.

![ListarInadimplentes](https://github.com/user-attachments/assets/e5e7a216-7712-4174-b75f-11e7e2af82eb)

---

## Estrutura do Projeto

src/
├── application/
│ └── Program.java
├── entities/
│ ├── Cliente.java
│ └── Plano.java
└── service/
└── AcademiaService.java


---

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos
- Collections (List)
- Aplicação em linha de comando (CLI)

---

## Possíveis Melhorias Futuras

- Persistência de dados (arquivo ou banco de dados)
- Implementação de mensalidades por período (mês/ano)
- Criação de relatórios financeiros
- Refatoração para arquitetura REST com Spring Boot

---

## Como Executar o Projeto

1. Clone o repositório
2. Abra o projeto em uma IDE Java
3. Execute a classe `Program`
4. Utilize o menu exibido no terminal para interagir com o sistema

---

## Observações

Projeto desenvolvido com foco educacional, visando demonstrar conceitos de POO e lógica de programação em Java de forma simples e objetiva.
