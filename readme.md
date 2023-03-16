### How to use this spring-boot project

- Install packages with `mvn package`
- Run `mvn spring-boot:run` for starting the application (or use your IDE)

Application (with the embedded H2 database) is ready to be used ! You can access the url below for testing it :

- Swagger UI : http://localhost:8080/swagger-ui.html
- H2 UI : http://localhost:8080/h2-console

> Don't forget to set the `JDBC URL` value as `jdbc:h2:mem:testdb` for H2 UI.


#### Updated by Rosslynn Agulto
- Updated saveEmployee method in the controller class
  Added @ResponseBody to be able to save correctly the values to the database
- Updated getEmployee method in the controller class
  Added try catch method so that we will not encounter system error whenever 
  trying to retrieve employee using ID which does not exist in the database
- Updated updateEmployee method in the controller class
  Added try catch method so that we will not encounter system error whenever 
  trying to update employee which does not exist in the database
- Added @Data annotation in Employee class instead of adding @Getter & @Setter in each field
- Added @transactional annotation in the service implementation class to manage transactions
- Added @Override in service implementation classes
- Added javadocs to all classes

#### Experience in Java
- I have 2 years of handling java application support role for HR evaluation system
- I have more than 3 years of experience as a java developer and used spring mvc and springboot
- I am a mid developer and i am eager to learn more

  
