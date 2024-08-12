# Projeto Base

Esse repositório contém código e configurações base para as atividades/projetos da disciplina "Desenvolvimento de Aplicações Corporativas" do IFPB - Campus Cajazeiras. Os requisitos necessários para a execução desse projeto são:

- JDK versão 17. Download [aqui](https://www.oracle.com/br/java/technologies/downloads/#jdk17) ou use um gerenciador de versões como [SDKMAN!](https://sdkman.io/install) (Recomendado!)
- [Docker](https://www.docker.com/products/docker-desktop/)

# Executando

Ao fazer o clone do repositório, abra o terminal no diretório do projeto e execute os comandos

```
docker compose up
./mvnw clean
./mvnw install
./mvnw spring-boot:run
```