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

### Get customers
Ej. curl -X GET localhost:8080/customers

### Get customer by id
Ej. curl -X GET localhost:8080/customers/2

### Create new customer
Ej. curl -X POST localhost:8080/customer/ -H 'content-type: application/json' -d '{"id": 4,"name": "New Customer"}'

### Delete customer
Ej. curl -X DELETE localhost:8080/customer/2

### Update customer
Ej. curl -X PUT http://localhost:8080/customer/2 -H 'cache-control: no-cache' -H 'content-type: application/json' -d '{ "id": 4, "name": "Update Customer"}”
