# Getting Started

### Reference Documentation
I wanted to learn swagger. This also use H2.

Baeldung spring swagger:

* [Documenting a Spring REST API Using OpenAPI 3.0](https://www.baeldung.com/spring-rest-openapi-documentation)

There is also H2 database.
[Read here](https://www.baeldung.com/spring-boot-h2-database) - 
[Github](https://github.com/eugenp/tutorials/tree/master/persistence-modules/spring-boot-persistence-h2)

### Links
[H2 console](http://localhost:8080/h2-console)
(use jdbc:h2:file:./data/books. Login sa & no password)

[Api docs](http://localhost:8080/v3/api-docs/)
[Swagger ui](http://localhost:8080/swagger-ui.html)

### Quelques examples

Cette requête est correct car on a 2 records.
Mais celle ci va donner une erreur "book not found!" (http://localhost:8080/api/book/11).

C'est bon de jouer avec de ControllerAdvice pour voir les erreurs retournés.