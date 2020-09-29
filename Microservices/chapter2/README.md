## Profiles

### Running Java profiles

* java -jar application.jar --spring.profiles.active="profile_name"

Ej. java -jar application.jar --spring.profiles.active="production"

### Running Spring Boot 2 profiles
* mvn spring-boot:run -Dspring-boot.run.arguments=--[property_name].[property_name]=[value]

Ej. mvn spring-boot:run -Dspring-boot.run.arguments=--service.type="advance"
