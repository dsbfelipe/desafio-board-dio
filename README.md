<img src="https://raw.githubusercontent.com/dsbfelipe/readme-banners/main/images/dio.png">
<img align="right" src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white">

<br>
<br>

Este repositório contém um projeto desenvolvido para criar um sistema de boards customizáveis para acompanhamento e gerenciamento de tarefas, utilizando Java e persistência em banco de dados MySQL.

## 📝 Objetivo do Projeto

Construir uma aplicação que simula boards de tarefas, permitindo criação, manipulação e controle de cards dentro de colunas específicas, respeitando regras de fluxo, bloqueios e organização.

## 🔧 Funcionalidades

- **Menu Inicial**: Criação, seleção, exclusão de boards e opção para sair da aplicação.

- **Persistência em Banco**: Armazenamento dos boards, colunas e cards em banco MySQL.

- **Boards Personalizados**: Cada board possui colunas configuráveis com regras fixas de tipos e posições.

- **Fluxo de Cards**: Os cards transitam entre as colunas obedecendo a ordem definida, com exceção dos cancelamentos.

- **Bloqueio de Cards**: Cards podem ser bloqueados e desbloqueados mediante motivo informado, impedindo movimentação enquanto bloqueados.

- **enu de Manipulação do Board**: Controle de movimentação dos cards, criação, bloqueio, desbloqueio e encerramento do board.

## 📋 Regras Implementadas

- Um board possui um nome e no mínimo 3 colunas:

  - Uma coluna inicial (primeira posição)

  - Uma ou mais colunas pendentes (intermediárias)

  - Uma coluna final (penúltima posição)

  - Uma coluna de cancelamento (última posição)

- Apenas 1 coluna por board pode ser do tipo inicial, final e cancelamento.

- Colunas pendentes podem ser múltiplas.

- Cada coluna possui nome, ordem e tipo (Inicial, Pendente, Final, Cancelamento).

- Cards possuem título, descrição, data de criação e status de bloqueio.

- Movimentação dos cards segue a ordem das colunas, não sendo possível pular etapas, exceto para cancelar que pode vir de qualquer coluna, exceto a final.

- Cards bloqueados não podem ser movidos até serem desbloqueados com motivo registrado.

## 💻 Tecnologias

- Java JDK 21

- Banco de dados MySQL

- JDBC para conexão e persistência

- IntelliJ

- Git & GitHub

📝 Desafios e Aprendizados

- Modelagem do domínio complexa com regras rígidas para controle de fluxo dos cards.

- Implementação da persistência relacional mantendo integridade entre boards, colunas e cards.

- Desenvolvimento de menu interativo e consistente para manipulação de estados e ações dos cards e boards.

- Aplicação dos conceitos de orientação a objetos para organização do código e reutilização.

## 💡 Créditos

- Projeto realizado no Bootcamp GFT Start #7 - Java, da plataforma DIO em parceria com a GFT.

- Desafio proposto pelo professor José Luiz Abreu Cardoso Junior.
