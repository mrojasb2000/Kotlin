## Profiles

### Running Java profiles

* java -jar application.jar --spring.profiles.active="profile_name"

Ej. java -jar application.jar --spring.profiles.active="production"

### Running Spring Boot 2 profiles
* mvn spring-boot:run -Dspring-boot.run.arguments=--[property_name].[property_name]=[value]

Ej. mvn spring-boot:run -Dspring-boot.run.arguments=--service.type="advance"

### Customers list
Ej. http://localhost:8080/customers

### Find Customers by id
Ej. http://localhost:8080/customers/2

### Filtering values
Ej. http://localhost:8080/customers?nameFilter=in

## CRUD Customer

### Create new customer
Ej. curl -X POST localhost:8080/customer/ -H 'content-type: application/json' -d '{
                                                                                  "id": 4,
                                                                                  "name": "New Customer"
                                                                              }'

