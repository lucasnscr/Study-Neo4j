# Study-Neo4j
 
### Project description
Project that builds an api that opens a transactional flow of reactive data, so that Apis connects with Kafka to process and receive messages. Promoting Spring Cloud Stream, Spring WebFlux and Kafka.


## Installation ##

It is necessary to install some items:
- Docker
- Java
- Maven

### Graph Database
Different from relational databases, the Graph-oriented Database has other forms of data persistence like NoSQL.

The idea is to create a less generic model than the relational model, providing a simpler modeling, seeking to obtain greater performance, both for its implementation free of costly operations such as JOINs, and for the use of graph algorithms. Being much simpler to design it doesn't need a complex table design to start including the data. Imagine creating a student entity, just create a node and its properties without initially worrying about what relationships it will have. The big difference is in the representation of the relationship between the data. We have entities called vertices or nodes that are connected by edges or relationships, each of which can hold data between relationships and each relationship can have a direction.

### Spring Data
The Spring Data Neo4j project applies Spring Data concepts to the development of solutions using the Neo4j graph data store. We provide repositories as a high-level abstraction for storing and querying documents as well as templates and clients for generic domain access or generic query execution. All of them are integrated with Spring’s application transactions.

### Necessary Steps

For the optimal execution of microservices, you need upload Neo4j , for that access the project's root folder, in it run the command docker compose up -d.
If you haven't changed docker compose the address is: http://localhost:7474/browser/

In Docker compose we disable the authentication functionality, but the default password and username are neo4j for both.

After connecting to Neo4j browser, run the script below to create Nodes and relationships.
```
CREATE (Interestelar:Movie {title: 'Interestelar', director: 'Christopher Nolan'})
CREATE (DarkKnight:Movie {title: 'The Dark Knight', director: 'Christopher Nolan'})
CREATE (Tenet:Movie {title: 'Tenet', director: 'Christopher Nolan'})
CREATE (Lucas:User {name: 'Lucas Nascimento', age: 27})
CREATE (Brenda:User {name: 'Brenda', age: 23})
CREATE (Mel:User {name: 'Mel', age: 30})

CREATE
(Interestelar)-[:RATED {rating: 10}]->(Lucas),
(Interestelar)-[:RATED {rating: 8}]->(Brenda),
(Interestelar)-[:RATED {rating: 7}]->(Mel),
(DarkKnight)-[:RATED {rating: 10}]->(Lucas),
(DarkKnight)-[:RATED {rating: 8}]->(Brenda),
(DarkKnight)-[:RATED {rating: 10}]->(Mel),
(Tenet)-[:RATED {rating: 6}]->(Lucas),
(Tenet)-[:RATED {rating: 7}]->(Brenda),
(Tenet)-[:RATED {rating: 0}]->(Mel)

;
```

### Technologies

The following technologies were used to carry out the project:
- Java 11
- Maven
- SpringBoot
- Spring Rest
- Spring Data Neo4j
- Neo4j
- Docker Compose
