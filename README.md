
# EduManage

Este repositório contém o código e configurações do **EduManage**, um sistema de gerenciamento escolar desenvolvido como parte da disciplina **Desenvolvimento de Aplicações Corporativas** no IFPB - Campus Cajazeiras. O projeto utiliza Java Persistence API (JPA) para gerenciar a persistência de dados e inclui a implementação de várias entidades e seus relacionamentos para simular o funcionamento de um sistema escolar.

## Descrição do Domínio

O **EduManage** é um sistema de gerenciamento escolar que permite o controle de alunos, professores, disciplinas, matrículas, notas e outras informações relacionadas ao ambiente educacional. O sistema foi projetado para oferecer uma visão completa da organização escolar, incluindo:

- Cadastro de estudantes e professores.
- Gerenciamento de disciplinas e turmas.
- Controle de matrículas e avaliação de notas.
- Estruturação de cursos e suas disciplinas.

O diagrama de entidade-relacionamento (ER) evidencia a modelagem do sistema, com pelo menos 10 entidades mapeadas e seus respectivos relacionamentos.

### Principais Entidades

- **Estudante**: Representa os alunos matriculados na instituição.
- **Professor**: Professores responsáveis por ministrar as disciplinas.
- **Disciplina**: As matérias oferecidas pela instituição.
- **Turma**: Agrupamento de alunos em uma mesma classe/horário.
- **Curso**: Conjunto de disciplinas que compõem uma formação acadêmica.
- **Matrícula**: Registro de um aluno em uma turma.
- **Nota**: Avaliação atribuída a um aluno em uma disciplina.
- **Avaliação**: Prova ou trabalho avaliativo para atribuir notas.
- **Endereço**: Dados de localização de estudantes e professores.
- **Instituição**: Escola ou universidade que oferece os cursos e disciplinas.

## Diagrama de Entidade-Relacionamento

Abaixo está o diagrama de entidade-relacionamento do sistema **EduManage**, que representa as entidades e seus respectivos relacionamentos:

![Diagrama de Entidade-Relacionamento](https://imgur.com/jSrwidF.png)

### Entidades
- **Estudante**:
- Atributos: id, nome, matrícula, dataNascimento, endereço, email, telefone.
Relacionamentos: Um estudante pode estar matriculado em várias disciplinas (Many-to-Many com Disciplina).

- **Professor**:
- Atributos: id, nome, cpf, especialidade, email, telefone.
Relacionamentos: Um professor pode lecionar várias disciplinas (One-to-Many com Disciplina).

- **Disciplina**:
- Atributos: id, nome, cargaHorária, codigo.
Relacionamentos: Uma disciplina pode ser lecionada por um professor (Many-to-One com Professor), pode ter vários alunos (Many-to-Many com Estudante), e estar vinculada a várias turmas (One-to-Many com Turma).

- **Turma**:
- Atributos: id, codigo, anoLetivo, turno, sala.
Relacionamentos: Uma turma pode ter várias disciplinas (One-to-Many com Disciplina) e vários estudantes (Many-to-Many com Estudante).

- **Curso**:
- Atributos: id, nome, descricao, duracao.
Relacionamentos: Um curso pode ter várias disciplinas (One-to-Many com Disciplina) e vários estudantes matriculados (One-to-Many com Estudante).

- **Matrícula**:
- Atributos: id, dataMatricula, situacao.
Relacionamentos: Uma matrícula envolve um estudante e uma turma (Many-to-One com Estudante e Many-to-One com Turma).

- **Nota**:
- Atributos: id, valor, dataAtribuicao.
Relacionamentos: Uma nota está associada a um estudante e a uma disciplina (Many-to-One com Estudante e Many-to-One com Disciplina).

- **Avaliação**:
- Atributos: id, tipo, data, peso.
Relacionamentos: Uma avaliação está vinculada a uma disciplina e a várias notas (One-to-Many com Nota).

- **Endereço (Entidade separada, associada a Estudante e Professor)**:
- Atributos: id, rua, cidade, estado, cep, pais.
Relacionamentos: Um endereço pode estar associado a um estudante ou a um professor (One-to-One).

- **Instituição**:
- Atributos: id, nome, endereco, telefone, email.
Relacionamentos: Uma instituição pode ter vários cursos (One-to-Many com Curso) e várias turmas (One-to-Many com Turma).

## Requisitos

Para executar este projeto, você precisará dos seguintes softwares instalados em sua máquina:

- JDK versão 17: Download [aqui](https://www.oracle.com/br/java/technologies/downloads/#jdk17) ou utilize um gerenciador de versões como [SDKMAN!](https://sdkman.io/install) (Recomendado!)
- [Docker](https://www.docker.com/products/docker-desktop): Para gerenciar containers e bancos de dados.

## Executando o Projeto

Siga os passos abaixo para clonar e executar o projeto:

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/edumanage.git
   ```

2. Acesse o diretório do projeto:
   ```bash
   cd edumanage
   ```

3. Suba o ambiente Docker com os serviços necessários:
   ```bash
   docker compose up
   ```

4. Limpe o projeto:
   ```bash
   ./mvnw clean
   ```

5. Instale as dependências do projeto:
   ```bash
   ./mvnw install
   ```

6. Execute a aplicação:
   ```bash
   ./mvnw spring-boot:run
   ```

## Estrutura do Projeto

- **src/main/java**: Código-fonte principal do sistema.
- **src/main/resources**: Configurações e arquivos de recursos.
- **Dockerfile**: Arquivo de configuração do Docker.
- **docker-compose.yml**: Arquivo de orquestração do Docker para subir o ambiente.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto é licenciado sob a [MIT License](LICENSE).
