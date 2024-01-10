# Projeto TBList - Intensivão Java Spring

## Sobre o projeto

🎮 TBList é uma aplicação Back-end construída durante o Intensivão Java Spring, organizado pela [DevSuperior](https://devsuperior.com.br). 🌟

A proposta desta aplicação é funcionar como uma plataforma de pesquisa de jogos, permitindo aos usuários mergulharem no universo dos games e encontrarem informações sobre seus títulos favoritos. 🕹️💻

Com um toque de diversão, os usuários têm a liberdade de buscar jogos por gênero e classificação, encontrando verdadeiras joias dos videogames. 🕵️‍♂️🌟

A TBList também traz um endpoint especial, permitindo que os jogos sejam organizados de forma personalizada na lista, tornando a experiência única e sob medida para cada usuário. 🔄🎊

Prepare-se para desvendar o universo dos jogos com a TBList! 🚀🎉 

## Modelo conceitual

![Modelo Conceitual](.github/resources/tblist-model.png)

## Padrão camadas adotado

![Padrão camadas](.github/resources/tblist-padrao-camadas.jpg)

## Endpoints

### Buscar todos os jogos paginado
```
GET /games
```
![Get Games](.github/resources/getGames.png)

### Buscar jogo por id
```
GET /games/{id}
```
![Get Games By Id](.github/resources/getGamesById.png)

### Busca uma lista por meio de seu ID mostrando quais jogos estão dentro desta categoria
```
GET /lists/{id}/games
```
![Get Games By List Id](.github/resources/getGamesByListId.png)

## Tecnologias utilizadas

### Back end
- [Java 17](https://www.java.com/pt-BR/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [H2 Console](https://www.h2database.com/html/main.html)
- [JPA / Hibernate](https://hibernate.org/)
- [Maven](https://maven.apache.org/)
- [Postman](https://www.postman.com/)

### Implantação em produção
- Hospedagem: [Railway](https://railway.app/)
- Banco de dados: [PostgreSQL](https://www.postgresql.org/)

### Pré-requisitos:
- Java 17
- Maven