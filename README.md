# dsclient-bootcamp-devsuperior

owner: Marcvos Franciso Picosque
Date: 2021-03-23T01:22:00Z

Bootcamp DevSuperior 2.0 - Chapter 01-29 - Final chapter assignment - API Clients CRUD

Trabalho final do capítulo

###  Enunciado do trabalho  ###

Você deverá entregar um projeto Spring Boot 2.4.x contendo um CRUD completo de web services REST 
para acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo:

Busca paginada de recursos
Busca de recurso por id
Inserir novo recurso
Atualizar recurso
Deletar recurso

O projeto deverá estar com um ambiente de testes configurado acessando o banco de dados H2, deverá 
usar Maven como gerenciador de dependência, e Java 11 como linguagem.

Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da 
entidade Client é mostrada a seguir (você deve seguir à risca os nomes de classe e atributos mostrados 

+------------------------+
|         Client         |
+------------------------+
| - id : Long            |
| - name : String        |
| - cpf : String         |
| - income : Double      |
| - birthDate : Instant  |
| - children : Integer   |
+------------------------+

Seu projeto deverá fazer um seed de pelo menos 10 clientes com dados SIGNIFICATIVOS
(não é para usar dados sem significado como “Nome 1”, “Nome 2”, etc.).
