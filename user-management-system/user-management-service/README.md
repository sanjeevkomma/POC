## Technology Stack :    

   1. Java 8
   2. Spring Boot 2.3.0.M1
   3. H2 DB

## Application Design : 

## Commands : 

   1. mvn clean install
   2. mvn eclipse:clean
   3. mvn eclipse:eclipse

## How to Start : 

    1. git clone https://github.com/sanjeevkomma/spring-boot.git
    2. mvn spring-boot:run
    3. Access H2 Console ( http://localhost:8080/h2-console/login.jsp ) 
    
## REST API : 

    1. Get All User : GET : http://localhost:8080/user
    2. Get User : GET : http://localhost:8080/user/{id}
    3. Delete User : DELETE : http://localhost:8080/user/{id}
    4. Save User : POST : http://localhost:8080/user
    
## cURL ( Client URL ) :

    1. Get All User : GET : curl -v localhost:8080/user
    
# Reference
* [React JS + Spring Boot REST API Example](https://www.javaguides.net/2020/07/react-js-spring-boot-rest-api-example-tutorial.html)
    
