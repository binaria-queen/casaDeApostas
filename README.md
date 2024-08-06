# Casa de Apostas
Esse projeto é uma aplicação simples de uma simulação de uma casa de apostas 
para a disciplina de Programação Orientada a Objetos 
do curso Análise e Desenvolvimento de Sistemas do Instituto Federal da Bahia. 

## Sumário

- [Visão Geral](#visão-geral)
- [Pré-requisitos](#pré-requisitos)
- [Configuração do Banco de Dados](#configuração-do-banco-de-dados)
- [Como Executar o Projeto](#como-executar-o-projeto)
- [Endpoints da API](#endpoints-da-api)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Visão Geral

Este projeto permite a criação, leitura, atualização e exclusão de eventos. Cada evento tem os seguintes campos:

- `idEvento`: Identificador do evento (gerado automaticamente).
- `idAposta`: Identificador da aposta associada ao evento.
- `nome`: Nome do evento.
- `descricao`: Descrição do evento.
- `dataHoraEvento`: Data e hora do evento.
- `odds`: Odds associadas ao evento, armazenadas como uma string JSON.
- `dataHoraAposta`: Data e hora da aposta.

O projeto usa Spring Boot para configurar e gerenciar o contexto da aplicação e JDBC para interagir diretamente com o banco de dados.

## Pré-requisitos

Antes de executar o projeto, certifique-se de ter o seguinte instalado:

- JDK 11 ou superior
- Maven
- (Opcional) Um IDE como IntelliJ IDEA ou Eclipse

## Configuração do Banco de Dados

Este projeto usa um banco de dados em memória H2 para desenvolvimento e testes. A configuração está definida em `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.datasource.initialization-mode=always
